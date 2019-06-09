package com.powerbridge.codegen.config;

import java.util.HashMap;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月24日上午10:20:28
 */
@Getter
@Setter
@ConfigurationProperties(prefix="pb.templates")
public class TemplateConfig {

    private String name;
    private String modelBuilderName;
    private String templateFilename;
    private String outputPath;
    private String outputFilenameRule;
    private boolean oneFile = false;
    private HashMap<String, String> options;
}

