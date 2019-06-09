package com.powerbridge.codegen.core;

import com.powerbridge.codegen.config.CodegenConfig;
import com.powerbridge.codegen.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月24日上午9:00:00
 */
@Component
public class Projectgenerator {

	@Autowired
	private CodegenConfig config;

    public void start() throws Exception {
        FileUtil fileUtil = new FileUtil(config);
        fileUtil.moveFolder();
    }

}

