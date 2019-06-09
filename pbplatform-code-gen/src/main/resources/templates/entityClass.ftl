package ${options.pons};

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

<#list model.pkgs as pkg>
import ${pkg};
</#list>

/**
 * @Description: ${model.name}实体表
 * @author: powerbridge@powerbridge.com
 * @Date: ${model.curTime}
 */
@TableName("${model.name}")
public class ${model.upperCaseName} implements Serializable {

	private static final long serialVersionUID = 1L;

    @NotNull
    @TableId("${model.primaryKey.name}")
    @ApiModelProperty(value="主键${model.primaryKey.name}", name="${model.primaryKey.humpName}", example="")
	private ${model.primaryKey.columnType.javaType} ${model.primaryKey.humpName};
	
    <#list model.fields as field>
    <#if field.name != model.primaryKey.name>
    <#if field.dataType==91>
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    </#if>
    <#if field.dataType==93>
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    </#if>
    <#if field.nullable==0 && field.dataType==12>
    @NotEmpty(message = "参数不能为空")
    </#if>
    <#if field.nullable==0 && field.dataType!=12>
    @NotNull(message = "参数不能为空")
    </#if>
    <#if field.columnSize!=0 && field.dataType!=91 && field.dataType!=93>
    @Max(value = ${field.columnSize?c}, message = "参数值最大值为${field.columnSize?c}")
    </#if>
    @TableField("${field.name}")
    @ApiModelProperty(value = "${field.remarks}", name="${field.humpName}", example="")
    private ${field.columnType.javaType} ${field.humpName};
    
    </#if>
    </#list>

    /**
    * get、set方法
    */
    <#list model.fields as field>

    public ${field.columnType.javaType} get${field.getSetName}() {
        return ${field.humpName};
    }

    public void set${field.getSetName}(${field.columnType.javaType} ${field.humpName}) {
        this.${field.humpName} = ${field.humpName}<#if field.columnType.javaType == "String"> == null ? "" : ${field.humpName}.trim()</#if>;
    }

    </#list>

}