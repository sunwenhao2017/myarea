package com.powerbridge.codegen.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月24日下午1:38:35
 */
@Getter
@Setter
@ConfigurationProperties
public class ModelBuilderConfig {

	@Value("${pb.modelbuilders.name:}")private String name;
	@Value("${pb.modelbuilders.type:}")private String type;
	@Value("${pb.modelbuilders.configPath:}")private String configPath;
	@Value("${pb.modelbuilders.modelBuilderClassName:}")private String modelBuilderClassName;
}

