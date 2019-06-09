package com.powerbridge.codegen.util;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.util.ResourceUtils;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月25日上午9:54:14
 */
public class ConfigReader {

    private static final String MYSQL_URL = "jdbc:mysql://{0}?characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useSSL=false";
    private static final String MYSQL_DRIVERCLASS = "com.mysql.jdbc.Driver";

	public static <TConfig> TConfig getConfigByFilePath(Class<TConfig> type, String path) throws Exception {

        File file = ResourceUtils.getFile("classpath:"+path);
        if (!file.exists()) {
            String errMsg = String.format("config file at {%s} not exist..", path);
            throw new Exception(errMsg);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        TConfig config;
        try {
            config = objectMapper.readValue(file, type);
            return config;
        } catch (IOException e) {
            String errMsg = String.format("read config file {%s} exception..", path);
            throw new Exception(errMsg, e);
        }
    }

    /**
     * 从request获取mysql数据库配置
     * @param type
     * @param request
     * @return
     * @throws Exception
     */
    public static <TConfig> TConfig getConfigByRequest(Class<TConfig> type, HttpServletRequest request) throws Exception {
        String dbType = request.getParameter("dbType");
        String dbUrl = request.getParameter("dbUrl");
        String dbUsername = request.getParameter("dbUsername");
        String dbPwd = request.getParameter("dbPwd");
        String tables = request.getParameter("tables");

        if(Strings.isNullOrEmpty(dbType))
            throw new Exception("请选择数据库类型！");
        if(Strings.isNullOrEmpty(dbUrl))
            throw new Exception("请输入数据库配置！");
        if(Strings.isNullOrEmpty(dbUsername))
            throw new Exception("请输入数据库用户名！");
        if(Strings.isNullOrEmpty(dbPwd))
            throw new Exception("请输入数据库登录密码！");

        Map<String, String> dbConfig = new HashMap<>();
        dbConfig.put("dbUrl", MessageFormat.format(MYSQL_URL,dbUrl));
        dbConfig.put("driverClassName", MYSQL_DRIVERCLASS);
        dbConfig.put("username", dbUsername);
        dbConfig.put("password", dbPwd);
        if(Strings.isNullOrEmpty(tables))
            tables = "";
        dbConfig.put("tables", tables);

        ObjectMapper objectMapper = new ObjectMapper();
        TConfig config = objectMapper.readValue(JSONObject.toJSONString(dbConfig), type);;
        return config;
    }
}

