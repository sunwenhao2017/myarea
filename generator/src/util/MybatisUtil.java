package util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 生成入口
 * @author SUNWENHAO
 * @date 2018年11月22日 上午11:23:17
 */
public class MybatisUtil {
	
	public static void main(String[] args) {
		try {
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			File configFile = new File("src/GeneratedMapperConfig-mysql.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback, warnings);
			myBatisGenerator.generate(null);
			System.out.println("生成成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
