package com.powerbridge.codegen.config;

import com.powerbridge.codegen.util.StringUtil;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 
 * @author: shunhe@powerbridge.com
 * @Date: 2018年7月24日下午6:04:14
 */

public class TableInfo {

	@Getter
	private String name; // 原始表名
	@Getter
	@Setter
    private String upperCaseName; //前缀大写+首字符大写表名，用于创建PO、Mapper等
    @Getter
    @Setter
    private String lowerCaseName; //前缀小写+首字符大写表名，用于ServiceImpl
	@Getter
	@Setter
    private String simpleName;// 去掉前缀的表名，目前只支持_分割的表名
	@Getter
	@Setter
    private String upperCaseSimpleName; //simpleName的首字母大写形式
    @Getter
    @Setter
    private String humpName;
	@Getter
    private List<TableField> fields = new ArrayList<>();
	@Getter
	@Setter
    private List<String> pkgs = new ArrayList<>(); // 所有字段类型对应的Java包，import到java文件
	@Getter
	@Setter
    private TableField primaryKey; // 主键字段
	@Getter
	@Setter
    private String remarks; // 表注释
	@Getter
	@Setter
	private String curTime;//系统时间

    
    public void setName(String name) throws Exception {

        this.name = name;
        this.upperCaseName = StringUtil.ToUpperName(name);
        this.lowerCaseName = new StringBuilder().append(StringUtil.ToUpperName(name).toLowerCase().charAt(0)).append(StringUtil.ToUpperName(name).substring(1)).toString();
        this.simpleName = StringUtil.ToSimpleName(name);
        this.upperCaseSimpleName = StringUtil.ToSimpleName(this.upperCaseName);
        this.humpName = StringUtil.ToHumpName(name);
    }
    
    public void setFields(List<TableField> fields) {
        this.fields = fields;
        fields.forEach(field -> {

            String pkg = field.getColumnType().getPkg();
            if (StringUtils.isEmpty(pkg) || pkgs.contains(pkg)) {
                return;
            }
            pkgs.add(pkg);
        });
    }

}

