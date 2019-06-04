package util.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import util.common.CommonConstant;

/**
 * 文件工具类
 * @author SUNWENHAO
 * @date 2018年11月16日 上午11:37:23
 */
public class FileUtil {

	//源文件
    static String sourcePath = "";
    //目标文件
    static String targetPath = "";
    
    public static void main(String[] args){
    	
    	System.out.println("请选择要备份的项目：");
    	System.out.println("1、API文档管理"+"\t2、新机构");
    	String choose = "";
    	
    	Scanner input = new Scanner(System.in);
    	while(!input.hasNextInt()) {
    		choose=input.next();
    		System.out.print("请输入数字：");
    	}
    	
    	int num = input.nextInt();
    	switch (num) {
		case 1:
			sourcePath = CommonConstant.apiSrcUrl;
			targetPath = CommonConstant.apiTargetUril;
			break;
		case 2:
			sourcePath = CommonConstant.orgNewSrcUrl;
			targetPath = CommonConstant.orgNewTargetUril;
			break;	
		default:
			break;
		}
    	
    	File sourceFile = new File(sourcePath);
        if(!(new File(sourcePath)).exists()){
            System.out.println("源文件" + sourcePath + "不存在，无法复制！");
            return;
        }
        else{
        	//获取目标路径
        	String realTargetPath = getRealTargetPath(targetPath);
        	if(sourceFile.isFile()) {
        		//复制文件
        		copyFile(new File(sourcePath),new File(realTargetPath));
        	}else {
        		//复制目录
        		copyDirectory(sourcePath,realTargetPath);
        	}
        }
    }
    
    /**
     * 获取复制后最终的目标路径
     * @author SUNWENHAO
     * @param 
     * @return
     * @date 2018年11月16日 下午2:02:06
     */
    private static String getRealTargetPath(String targetPath) {
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	String date = sdf.format(new Date());
    	targetPath += date;
    	File targetFile = new File(targetPath);
    	
    	int version = 0;	//版本号
    	if(targetFile.exists()) {
    		targetPath += "_" + version;
    	}
    	
    	StringBuilder sb = new StringBuilder(targetPath);
    	while(true) {
    		targetFile = new File(sb.toString());
    		//文件
    		if(targetFile.exists()) {
    			version ++;
                sb.replace(sb.toString().length()-1, sb.toString().length(), version+"");
    		}else {
    			break;
    		}
    	}
    	return sb.toString();
    }
    
    /**
     * 复制源文件至目标文件
     * @author SUNWENHAO
     * @param 
     * @return
     * @date 2018年11月16日 下午2:05:18
     */
    private static void copyFile(File sourceFile,File targetFile){
        if(!sourceFile.canRead()){
            System.out.println("源文件" + sourceFile.getAbsolutePath() + "不可读，无法复制！");
            return;
        }else{
            System.out.println("开始复制文件" + sourceFile.getAbsolutePath() + "到" + targetFile.getAbsolutePath());
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            FileOutputStream fos = null;
            BufferedOutputStream bos = null;
            
            try{
                fis = new FileInputStream(sourceFile);
                bis = new BufferedInputStream(fis);
                fos = new FileOutputStream(targetFile);
                bos = new BufferedOutputStream(fos);
                int len = 0;
                while((len = bis.read()) != -1){
                    bos.write(len);    
                }
                bos.flush();
                
            }catch(FileNotFoundException e){
                e.printStackTrace();    
            }catch(IOException e){
                e.printStackTrace();
            }finally{
                try{
                    if(fis != null){
                        fis.close();    
                    }
                    if(bis != null){
                        bis.close();    
                    }
                    if(fos != null){
                        fos.close();    
                    }
                    if(bos != null){
                        bos.close();    
                    }
                    System.out.println("文件" + sourceFile.getAbsolutePath() + "复制到" + targetFile.getAbsolutePath() + "【完成】");
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
    /**
     * 复制源目录至目标目录
     * @author SUNWENHAO
     * @param 
     * @return
     * @date 2018年11月16日 下午2:05:25
     */
    private static void copyDirectory(String sourcePathString,String targetPathString){
        if(!new File(sourcePathString).canRead()){
            System.out.println("源文件夹" + sourcePathString + "不可读，无法复制！");
            return;
        }else{
            (new File(targetPathString)).mkdirs();
            System.out.println("开始复制文件夹" + sourcePathString + "到" + targetPathString);
            File[] files = new File(sourcePathString).listFiles();
            for(int i = 0; i < files.length; i++){
                if(files[i].isFile()){
                    copyFile(new File(sourcePathString + File.separator + files[i].getName()),new File(targetPathString + File.separator + files[i].getName()));    
                }else if(files[i].isDirectory()){
                    copyDirectory(sourcePathString + File.separator + files[i].getName(),targetPathString + File.separator + files[i].getName());
                }    
            }
            System.out.println("复制文件夹" + sourcePathString + "到" + targetPathString + "【结束】");
        }
    }
    
    
    
    
}
