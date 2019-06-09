package com.powerbridge.codegen.serivce;

import java.util.List;

/**
 * @Description: 模型构建器接口
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月24日下午3:13:01
 */
public interface IModelBuilder<T> {

	/**
     * 构建数据模型
     * @param config 构建器配置类实例
     * @return 数据模型列表，返回List接口以支持批量生成
     * @throws Exception
     */
	List<Object> buildDataModels(T config) throws Exception;
}

