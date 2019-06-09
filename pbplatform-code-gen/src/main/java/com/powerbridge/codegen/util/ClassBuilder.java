package com.powerbridge.codegen.util;

import java.lang.reflect.ParameterizedType;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月25日上午8:47:01
 */
public class ClassBuilder {

	public static <TClass> TClass newInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> builderClass = Class.forName(className);
        return (TClass) builderClass.newInstance();
    }

    public static Class<?> getGenericTypeArgumengt(String className) throws ClassNotFoundException {
        Class<?> builderClass = Class.forName(className);
        return (Class<?>) (((ParameterizedType) builderClass.getGenericInterfaces()[0]).getActualTypeArguments()[0]);
    }
}

