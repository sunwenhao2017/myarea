package com.powerbridge.codegen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

import com.powerbridge.codegen.config.CodegenConfig;
import com.powerbridge.codegen.config.ModelBuilderConfig;
import com.powerbridge.codegen.config.TemplateConfig;
import com.powerbridge.core.config.GlobalSecurityConfigAdapter;

@SpringBootApplication
@EnableConfigurationProperties(value= {ModelBuilderConfig.class, CodegenConfig.class, TemplateConfig.class})
@Import({GlobalSecurityConfigAdapter.class})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class CodeGenApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeGenApplication.class, args);
    }

}
