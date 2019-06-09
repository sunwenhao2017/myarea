package com.powerbridge.codegen.config;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月24日下午5:59:37
 */
@Getter
@Setter
public class MySqlConfig {

	private String dbUrl;
    private String driverClassName;
    private String username;
    private String password;
    private String tables; //可指定要生成的表名，用,分割
}

