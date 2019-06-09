package com.powerbridge.codegen.config;

import com.powerbridge.codegen.util.StringUtil;
import lombok.Getter;
import lombok.Setter;

import java.sql.Types;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月24日下午6:04:38
 */

public class TableField {

	@Getter
	private String name; // 原始字段名
	@Getter
	@Setter
    private String lowerCaseName; // 首字母小写字段名
	@Getter
	@Setter
    private String upperCaseName; // 首字母大写字段名
    @Getter
    @Setter
    private String humpName;
    @Getter
    @Setter
    private String getSetName; // get、set方法的字段名 首字母大写，其他字母驼峰
	@Getter
    private int dataType; // 字段类型值，对应 java.sql.Types中的枚举值
    @Getter
	@Setter
    private DbColumnType columnType;
    @Getter
	@Setter
    private String typeName; // 字段数据库类型，其他类型参见源码：TableField.java
    @Getter
	@Setter
    private int columnSize; // 字段大小
    @Getter
	@Setter
    private String remarks; // 字段注释
    @Getter
    @Setter
    private int nullable;//是否为空

    public void setName(String name) throws Exception {
        this.name = name;
        this.lowerCaseName = new StringBuilder().append(StringUtil.ToUpperName(name).toLowerCase().charAt(0)).append(StringUtil.ToUpperName(name).substring(1)).toString();
        this.upperCaseName = StringUtil.ToUpperName(name);
        this.humpName = StringUtil.ToHumpName(name);
        this.getSetName = new StringBuilder().append(humpName.substring(0,1).toUpperCase()).append(humpName.substring(1)).toString();
    }

    public static void main(String[] args) {
        String humpName = "sageWeYouAre";
        String getSetName = new StringBuilder().append(humpName.substring(0,1).toUpperCase()).append(humpName.substring(1)).toString();
        System.out.println(getSetName);
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;

        switch (dataType) {
            case Types.INTEGER:
                columnType = DbColumnType.INTEGER;
                typeName = "INTEGER";
                break;
            case Types.BIGINT:
                columnType = DbColumnType.LONG;
                typeName = "long";
                break;
            case Types.BIT:
                columnType = DbColumnType.BOOLEAN;
                typeName = "BIT";
                break;
            case Types.VARCHAR:
                columnType = DbColumnType.STRING;
                typeName = "VARCHAR";
                break;
            case Types.TIMESTAMP:
                columnType = DbColumnType.DATE;
                typeName = "TIMESTAMP";
                break;
            case Types.DATE:
                columnType = DbColumnType.DATE;
                typeName = "DATE";
                break;
            case Types.FLOAT:
                columnType = DbColumnType.FLOAT;
                typeName = "FLOAT";
                break;
            case Types.REAL:
                columnType = DbColumnType.FLOAT;
                typeName = "FLOAT";
                break;
            case Types.DOUBLE:
                columnType = DbColumnType.DOUBLE;
                typeName = "DOUBLE";
                break;
            default:
                columnType = DbColumnType.STRING;
                typeName = "VARCHAR";
                break;
        }
    }
}

