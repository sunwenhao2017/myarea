# 关于
本实例旨在基于指定的库模型自动化生成对应微服务的初始工程，生成后的工程可直接导入IDE运行

**注意:**
> 生成后的项目导入IDE运行前，需检查Apollo是否已经配置了对应实例的环境参数； 
> 生成的代码只包含通用逻辑，开发人员需根据具体业务需求做后续改造 

## 代码生成器使用方法
1. 去 http://gitlab.powerbridge.com/pbplatform/pbplatform-code-gen 把代码自动生成工程 (以下简称gen工程)下载到本地

2. 把gen工程导入IDE

3. gen工程中 resources\config\application.yml 中需修改以下参数配置
   1. projectName=新工程的名字
   2. artifactId=新工程包名（eg：com.powerbridge.${artifactId}）
   3. modelName=新工程模块名（eg：com.powerbridge.${artifactId}.controller.${modelName}）, 若不配置, 系统默认不生成子模块
   4. aplloAppId=新工程Apllo中配置的appId
   5. apllopubAppId=新工程引用的公共Apollo配置
   6. buildStructure=是否生成工程结构，false时只生成表模型对应的代码
 
5. IDE中执行com\powerbridge\codegen\CodeGenApplication.java启动gen工程，启动成功后，页面上访问：http://localhost:8999/genCode?dbType=mysql&dbUrl=172.16.0.168:3306/bssp_grt&dbUsername=devl&dbPwd=qwe456, 目前采用get方式给后台传输数据库配置采参数，若要指定生成指定表模型，可以在请求路径添加：&tables={指定表名，多个表明使用,分隔}。若页面响应“code gen successed !” 表示代码生成成功。
可在D:/${projectName}位置获取生成后的初始项目
