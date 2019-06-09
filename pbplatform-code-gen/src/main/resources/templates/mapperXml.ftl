<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="${options.mapperns}.${model.upperCaseName}Mapper">
    <resultMap id="BaseResultMap" type="${options.pons}.${model.upperCaseName}">
        <id column="${model.primaryKey.name}" property="${model.primaryKey.humpName}"/>
    <#list model.fields as field>
    	<#if field.name != model.primaryKey.name>
	    <result column="${field.name}" property="${field.humpName}"/>
	    </#if>
    </#list>
    </resultMap>
    <sql id="Base_Column_List">
        <#list model.fields as field>A.${field.name} as ${field.humpName} <#sep>, </#list>
    </sql>

    <select id="select${model.upperCaseName}List" resultType="${options.pons}.${model.upperCaseName}" databaseId="mysql">
        select
        <include refid="Base_Column_List"/>
        from ${model.name} A
        <where>
			1=1
			<#list model.fields as field>
				<if test="${field.humpName} != null and ${field.humpName} !=''">
					AND A.${field.name} = ${r"#{"}${field.humpName}}
				</if>
			</#list>
		</where>
    </select>
    
    <select id="select${model.upperCaseName}List" resultType="${options.pons}.${model.upperCaseName}" databaseId="oracle">
        select
        <include refid="Base_Column_List"/>
        from ${model.name} A
        <where>
			1=1
			<#list model.fields as field>
				<if test="${field.humpName} != null and ${field.humpName} !=''">
					AND A.${field.name} = ${r"#{"}${field.humpName}}
				</if>
			</#list>
		</where>
    </select>
</mapper>