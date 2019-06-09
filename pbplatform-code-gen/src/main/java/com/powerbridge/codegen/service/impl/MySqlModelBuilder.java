package com.powerbridge.codegen.service.impl;

import com.powerbridge.codegen.config.MySqlConfig;
import com.powerbridge.codegen.config.TableField;
import com.powerbridge.codegen.config.TableInfo;
import com.powerbridge.codegen.serivce.IModelBuilder;
import com.powerbridge.core.util.DateUtil;
import org.apache.commons.lang3.StringUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月24日下午6:01:16
 */
public class MySqlModelBuilder implements IModelBuilder<MySqlConfig> {

	@Override
	public List<Object> buildDataModels(MySqlConfig config) throws Exception {
		try {
            Class.forName(config.getDriverClassName());
        } catch (ClassNotFoundException e) {
            throw new Exception("load driver exception..", e);
        }

        List<Object> tableInfos = new ArrayList<>();
        Connection connection;
        try {
            Properties props =new Properties();
            props.put("user", config.getUsername());
            props.put("password", config.getPassword());
            props.put("useInformationSchema","true"); //表注释

            connection = DriverManager.getConnection(config.getDbUrl(), props);
            DatabaseMetaData dbMetaData = connection.getMetaData();

            List<TableInfo> allTableList = getAllTableList(dbMetaData);
            String[] tableNames = config.getTables().split(",");
            if (!(tableNames.length == 1 && StringUtils.isBlank(tableNames[0]))) {
                List<String> tableNameList = Arrays.asList(tableNames);
                allTableList.removeIf(table -> !tableNameList.contains(table.getName()));
            }
            tableInfos.addAll(allTableList);

        } catch (SQLException e) {
            throw new Exception("load database metadata exception..", e);
        }

        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableInfos;
	}
	
	public static List<TableInfo> getAllTableList(DatabaseMetaData dbMetaData) throws Exception {
        List<TableInfo> tableInfos = new ArrayList<TableInfo>();
        try {
            // table type. Typical types are "TABLE", "VIEW", "SYSTEM TABLE", "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
            String[] types = {"TABLE"};
            ResultSet rs = dbMetaData.getTables(null, null, "%", types);

            while (rs.next()) {
                String tableName = rs.getString("TABLE_NAME");  //表名
                String remarks = rs.getString("REMARKS");       //表备注

                List<TableField> tableFields = getTableFields(dbMetaData, tableName);
                String primaryKeyName = getAllPrimaryKeys(dbMetaData, tableName);
                if(primaryKeyName==null)
                	continue;
                TableField primaryKey = tableFields.stream()
                        .filter(field -> field.getName().equals(primaryKeyName))
                        .findFirst().get();
                TableInfo tableInfo = new TableInfo();
                tableInfo.setName(tableName);
                tableInfo.setFields(tableFields);
                tableInfo.setPrimaryKey(primaryKey);
                tableInfo.setRemarks(remarks);
                tableInfo.setCurTime(DateUtil.getYear()+"年"+DateUtil.getMonth()+"月"+DateUtil.getDay()+"日 "+DateUtil.getTime() );
                tableInfos.add(tableInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableInfos;
    }
	
	public static List<TableField> getTableFields(DatabaseMetaData dbMetaData, String tableName) throws Exception {

        ArrayList<TableField> tableFields = new ArrayList<>();

        ResultSet rs = dbMetaData.getColumns(null, null, tableName, "%");
        while (rs.next()) {
            String columnName = rs.getString("COLUMN_NAME");//列名
            int dataType = rs.getInt("DATA_TYPE"); //对应的    类型
            int columnSize = rs.getInt("COLUMN_SIZE");//列大小
            /**
             *  0 (columnNoNulls) - 该列不允许为空
             *  1 (columnNullable) - 该列允许为空
             *  2 (columnNullableUnknown) - 不确定该列是否为空
             */
            int nullAble = rs.getInt("NULLABLE");  //是否允许为null
            String remarks = rs.getString("REMARKS");//列描述
            TableField tableField = new TableField();
            tableField.setName(columnName);
            tableField.setDataType(dataType);
            tableField.setColumnSize(columnSize);
            tableField.setRemarks(remarks);
            tableField.setNullable(nullAble);
            tableFields.add(tableField);
        }
        return tableFields;
    }
	
	public static String getAllPrimaryKeys(DatabaseMetaData dbMetaData, String tableName) throws Exception {

        ResultSet rs = dbMetaData.getPrimaryKeys(null, null, tableName);
        if (!rs.next()) {
//            throw new Exception(String.format("table:%s don't have primary key", tableName));
        	return null;
        }
        return rs.getString("COLUMN_NAME");//列名
    }
}

