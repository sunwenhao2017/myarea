package com.powerbridge.codegen.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.fileupload.util.Streams;

import com.google.common.base.Strings;
import com.powerbridge.codegen.config.CodegenConfig;

public class FileUtil {

    private CodegenConfig config;

    public FileUtil(CodegenConfig config) {
        this.config = config;
    }

    public void moveFolder() {
        String exampleLoaclPath = config.getSaveDir() + ":/" + config.getExampleFileName();
        boolean buildModel = Strings.isNullOrEmpty(config.getModelName()) ? false : true;
        // 先复制文件
        copyFolder(exampleLoaclPath, config.getSaveDir() + ":/" + config.getProjectName());
        // 删除源文件
        deleteDir(new File(exampleLoaclPath));
    }

    // 复制某个目录及目录下的所有子目录和文件到新文件夹
    public void copyFolder(String oldPath, String newPath) {
        boolean addModelStructure = Strings.isNullOrEmpty(config.getModelName()) ? false : true;
        try {
            // 如果文件夹不存在，则建立新文件夹
            (new File(newPath)).mkdirs();
            // 读取整个文件夹的内容到file字符串数组，下面设置一个游标i，不停地向下移开始读这个数组
            File filelist = new File(oldPath);
            String[] file = filelist.list();
            // 要注意，这个temp仅仅是一个临时文件指针
            // 整个程序并没有创建临时文件
            File temp = null;
            for (int i = 0; i < file.length; i++) {

                // 如果oldPath以路径分隔符/或者\结尾，那么则oldPath/文件名就可以了
                // 否则要自己oldPath后面补个路径分隔符再加文件名
                // 谁知道你传递过来的参数是f:/a还是f:/a/啊？
                if (oldPath.endsWith(File.separator)) {
                    temp = new File(oldPath + file[i]);
                } else {
                    temp = new File(oldPath + File.separator + file[i]);
                }

                // 如果游标遇到文件
                if (temp.isFile()) {
                    FileInputStream input = new FileInputStream(temp);
                    // 复制并且改名
                    String fileName = newPath + "/" + (temp.getName()).toString();
                    FileOutputStream output = new FileOutputStream(fileName);
                    byte[] bufferarray = new byte[1024 * 64];
                    int prereadlength;
                    while ((prereadlength = input.read(bufferarray)) != -1) {
                        output.write(bufferarray, 0, prereadlength);
                    }
                    output.flush();
                    output.close();
                    input.close();

                }
                // 如果游标遇到文件夹
                if (temp.isDirectory()) {
                    String dirPath = file[i];
                    if("example".equals(file[i]))
                        dirPath = config.getArtifactId();
                    String targetPath = newPath + "/" + dirPath;

                    if(addModelStructure){
                        if(targetPath.endsWith("controller") ||
                                targetPath.endsWith("dao") ||
                                targetPath.endsWith("entity") ||
                                targetPath.endsWith("service") ||
                                targetPath.endsWith("mapper")
                                ) {
                            targetPath = targetPath + "/" + config.getModelName();
                        }
                    }

                    copyFolder(oldPath + "/" + file[i], targetPath);
                }
            }
        } catch (Exception e) {
            System.out.println("复制整个文件夹内容操作出错");
        }
    }



    /**
     * 重构生成后的项目结构
     */
    public void rebuildStructure(String filePath, String modelName){
        boolean addModelStructure = Strings.isNullOrEmpty(modelName) ? false : true;
        File f=new File(filePath);
        try {
            if(f.isDirectory()){
                File[] fs=f.listFiles();
                for(int i=0;i<fs.length;i++){
                    String fsPath=fs[i].getAbsolutePath();
                    rebuildStructure(fsPath, modelName);
                }
            }else{
                //用新项目的参数替换脚手架的参数
                replaceNewProjectConfig(filePath);

                if(addModelStructure){//给生成后的项目添加子模块(controller/entity/dao/service/mapper)
                    //插入模块结构
                    insertModelStructure(filePath, config.getOutputStructure(), config.getExampleStructure(), config.getModelName());
                    //替换controller中的对外接口结构
                    replaceFileStr(filePath, "@RequestMapping(\"/", "@RequestMapping(\"/" + config.getModelName() + "/");
                    //替换mapper.xml中的引用
                    if(filePath.endsWith(".xml")) {
                        replaceFileStr(filePath, config.getOutputStructure() + ".entity", config.getOutputStructure() + ".entity." + config.getModelName());
                        replaceFileStr(filePath, config.getExampleStructure() + ".entity",  config.getExampleStructure() + ".entity." + config.getModelName());
                        replaceFileStr(filePath, config.getOutputStructure() + ".dao", config.getOutputStructure() + ".dao." + config.getModelName());
                        replaceFileStr(filePath, config.getExampleStructure() + ".dao", config.getExampleStructure() + ".dao." + config.getModelName());
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 用新项目的参数替换脚手架的参数
     * 1、替换apollo配置
     * 2、替换新项目包名
     * 3、替换工程名（.project/name, app.properties/app.id）
     */
    private void replaceNewProjectConfig(String filePath){
        //替换Apollo-app.id
        replaceFileStr(filePath, config.getExampleApllo(), config.getAplloAppId());
        //替换公共Apollo-app.id
        replaceFileStr(filePath, config.getExamplePubApllo(), config.getApllopubAppId());
        //替换包结构
        replaceFileStr(filePath, config.getExampleStructure(), config.getOutputStructure());
        //替换项目名
        if(filePath.endsWith(".project") || filePath.endsWith("settings.gradle"))
            replaceFileStr(filePath, config.getExampleProjectName(), config.getProjectName());
    }

    /**
     * 插入模块结构 eg: com.powerbridge.bls.controller.${modelName}
     * @param filepath
     * @param outputStructure
     * @param exampleStructure
     * @param modelName
     */
    private static void insertModelStructure(String filepath, String outputStructure, String exampleStructure, String modelName){
        String[] fileTypes = new String[]{"controller", "dao", "entity", "service"};
        for(String type: fileTypes){
            replaceFileStr(filepath, "package " + outputStructure + "." + type, "package " + outputStructure + "." + type+ "." + modelName);
            replaceFileStr(filepath, "package " + exampleStructure + "." + type, "package " + exampleStructure + "." + type+ "." + modelName);

            replaceFileStr(filepath, "import " + outputStructure + "." + type, "import " + outputStructure + "." + type+ "." + modelName);
            replaceFileStr(filepath, "import " + exampleStructure + "." + type, "import " + exampleStructure + "." + type+ "." + modelName);
        }
    }

    /***
     * 替换指定文件中的指定内容
     * @param filepath  文件路径
     * @param sourceStr 文件需要替换的内容
     * @param targetStr 替换后的内容
     * @return 替换成功返回true，否则返回false
     */
    public static boolean replaceFileStr(String filepath,String sourceStr,String targetStr){
        try {
            FileReader fis = new FileReader(filepath);  // 创建文件输入流
            BufferedReader br = new BufferedReader(fis);
            char[] data = new char[1024];               // 创建缓冲字符数组
            int rn = 0;
            StringBuilder sb=new StringBuilder();       // 创建字符串构建器
            //fis.read(data)：将字符读入数组。在某个输入可用、发生 I/O 错误或者已到达流的末尾前，此方法一直阻塞。读取的字符数，如果已到达流的末尾，则返回 -1
            while ((rn = fis.read(data)) > 0) {         // 读取文件内容到字符串构建器
                String str=String.valueOf(data,0,rn);//把数组转换成字符串
                //System.out.println(str);
                sb.append(str);
            }
            fis.close();// 关闭输入流
            // 从构建器中生成字符串，并替换搜索文本
            String str = sb.toString().replace(sourceStr, targetStr);
            FileWriter fout = new FileWriter(filepath);// 创建文件输出流
            fout.write(str.toCharArray());// 把替换完成的字符串写入文件内
            fout.close();// 关闭输出流

            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * 从ftp服务器下载脚手架项目并解压
     * @throws Exception
     */
    public void getExampleProjectFromFtp() throws Exception{
        downloadFile(config.getExampleFtpPath(), config.getSaveDir() + ":/", config.getExampleSaveName());
        String source = config.getSaveDir() + ":/" + config.getExampleSaveName();
        deGzipArchive(config.getSaveDir() + ":/", source);
        deleteDir(new File(source));
    }

    /**
     * 从指定路径下载资源文件
     * @param sourceUrl
     * @param saveDir
     * @param saveName
     * @throws Exception
     */
    public static void downloadFile(String sourceUrl, String saveDir, String saveName)throws Exception{
        URL url = new URL(sourceUrl);
        InputStream in = url.openStream();

        File dir = new File(saveDir);
        File file = new File(dir,saveName);
        FileOutputStream out = new FileOutputStream(file);
        Streams.copy(in, out, true);
    }

    /**
     * 解压tar.gz文件
     * tar文件只是把多个文件或文件夹打包合成一个文件，本身并没有进行压缩。gz是进行过压缩的文件。
     * @param dir 解压后保存路径 D:/
     * @param filepath 压缩包路径 D:/pbplatform-example-master.tar.gz
     * @throws Exception
     */
    public static void deGzipArchive(String dir, String filepath)
            throws Exception {
        final File input = new File(filepath);
        final InputStream is = new FileInputStream(input);
        final CompressorInputStream in = new GzipCompressorInputStream(is, true);
        TarArchiveInputStream tin = new TarArchiveInputStream(in);
        TarArchiveEntry entry = tin.getNextTarEntry();
        while (entry != null) {
            File archiveEntry = new File(dir, entry.getName());
            archiveEntry.getParentFile().mkdirs();
            if (entry.isDirectory()) {
                archiveEntry.mkdir();
                entry = tin.getNextTarEntry();
                continue;
            }
            OutputStream out = new FileOutputStream(archiveEntry);
            IOUtils.copy(tin, out);
            out.close();
            entry = tin.getNextTarEntry();
        }
        in.close();
        tin.close();
    }

    // 删除某个目录及目录下的所有子目录和文件
    public static boolean deleteDir(File dir) {
        // 如果是文件夹
        if (dir.isDirectory()) {
            // 则读出该文件夹下的的所有文件
            String[] children = dir.list();
            // 递归删除目录中的子目录下
            for (int i = 0; i < children.length; i++) {
                // File f=new File（String parent ，String child）
                // parent抽象路径名用于表示目录，child 路径名字符串用于表示目录或文件。
                // 连起来刚好是文件路径
                boolean isDelete = deleteDir(new File(dir, children[i]));
                // 如果删完了，没东西删，isDelete==false的时候，则跳出此时递归
                if (!isDelete) {
                    return false;
                }
            }
        }
        // 读到的是一个文件或者是一个空目录，则可以直接删除
        return dir.delete();
    }

}
