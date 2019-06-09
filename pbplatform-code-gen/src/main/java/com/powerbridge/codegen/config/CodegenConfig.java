package com.powerbridge.codegen.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月24日下午1:38:17
 */
@ConfigurationProperties(prefix="pb")
public class CodegenConfig {

	@Getter
	@Setter
	private List<ModelBuilderConfig> modelbuilders;
	@Getter
	@Setter
	private List<TemplateConfig> templates;

	//修改.project/name, app.properties/app.id的项目名
	@Getter
	@Setter
	private String exampleFileName;
	@Getter
	@Setter
	private String saveDir;
	@Getter
	@Setter
	private String exampleProjectName;

	//修改包结构
	@Getter
	@Setter
	private String exampleStructure;
	@Getter
	@Setter
	private String outputStructure;

	//新项目包名
	@Getter
	@Setter
	private String artifactId;

	//新项目名
	@Getter
	@Setter
	private String projectName;

	//Apollo配置
	@Getter
	@Setter
	private String exampleApllo;
	@Getter
	@Setter
	private String aplloAppId;
	@Getter
	@Setter
	private String examplePubApllo;
	@Getter
	@Setter
	private String apllopubAppId;

	//是否生成项目结构
	@Getter
	@Setter
	private boolean buildStructure;

	@Getter
	@Setter
	private String modelName;

	@Getter
	@Setter
	private String outputModelStructure;

	@Getter
	@Setter
	private String exampleFtpPath;

	@Getter
	@Setter
	private String exampleSaveName;
}

