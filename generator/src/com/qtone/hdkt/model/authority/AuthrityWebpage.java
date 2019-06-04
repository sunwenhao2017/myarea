package com.qtone.hdkt.model.authority;

import java.util.Date;

public class AuthrityWebpage {
    private Integer id;

    private String webpageCode;

    private String webpageName;

    private Integer webpageType;

    private Integer parentId;

    private Integer level;

    private Integer isLast;

    private Date createTime;

    private Date updateTime;

    private Date deleteTime;

    private Integer isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebpageCode() {
        return webpageCode;
    }

    public void setWebpageCode(String webpageCode) {
        this.webpageCode = webpageCode == null ? null : webpageCode.trim();
    }

    public String getWebpageName() {
        return webpageName;
    }

    public void setWebpageName(String webpageName) {
        this.webpageName = webpageName == null ? null : webpageName.trim();
    }

    public Integer getWebpageType() {
        return webpageType;
    }

    public void setWebpageType(Integer webpageType) {
        this.webpageType = webpageType;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIsLast() {
        return isLast;
    }

    public void setIsLast(Integer isLast) {
        this.isLast = isLast;
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