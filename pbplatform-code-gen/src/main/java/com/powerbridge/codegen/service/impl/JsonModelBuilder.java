package com.powerbridge.codegen.service.impl;

import java.util.List;

import com.powerbridge.codegen.serivce.IModelBuilder;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月25日上午8:46:02
 */
public class JsonModelBuilder implements IModelBuilder<Object>{

	@Override
	public List<Object> buildDataModels(Object config) throws Exception {
		return (List) config;
	}

}

