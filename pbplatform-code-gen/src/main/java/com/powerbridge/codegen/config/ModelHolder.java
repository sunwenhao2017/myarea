package com.powerbridge.codegen.config;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月25日上午10:05:38
 */
@Getter
@Setter
public class ModelHolder {

	private Object model;
    private HashMap<String, String> options;
    
    public ModelHolder(Object model, HashMap<String, String> options) {
        this.model = model;
        this.options = options;
    }
}

