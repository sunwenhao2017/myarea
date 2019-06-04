package com.qtone.hdkt.model.project;

import java.io.Serializable;
import java.util.Date;

public class Inter implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 模块id
     */
    private Integer moduleId;

    /**
     * 项目id
     */
    private Integer projectId;

    /**
     * 接口方法名称
     */
    private String interName;

    /**
     * 请求url
     */
    private String interPath;

    /**
     * 请求方式
     */
    private String method;

    /**
     * 请求协议
     */
    private String scheme;

    /**
     * 概要信息，用途说明
     */
    private String summary;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 请求格式 body row  application/json
     */
    private String consume;

    /**
     * 响应格式
     */
    private String produce;

    /**
     * 是否弃用 1是 0否
     */
    private Byte deprecated;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    private Date deleteTime;

    /**
     * 0:否； 1:是
     */
    private Integer isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getInterName() {
        return interName;
    }

    public void setInterName(String interName) {
        this.interName = interName == null ? null : interName.trim();
    }

    public String getInterPath() {
        return interPath;
    }

    public void setInterPath(String interPath) {
        this.interPath = interPath == null ? null : interPath.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme == null ? null : scheme.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getConsume() {
        return consume;
    }

    public void setConsume(String consume) {
        this.consume = consume == null ? null : consume.trim();
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce == null ? null : produce.trim();
    }

    public Byte getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Byte deprecated) {
        this.deprecated = deprecated;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}