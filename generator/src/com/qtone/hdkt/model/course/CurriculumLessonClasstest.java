package com.qtone.hdkt.model.course;

import java.io.Serializable;
import java.util.Date;

public class CurriculumLessonClasstest implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 课程小节课id
     */
    private Integer curriculumLessonId;

    /**
     * 随堂检测id
     */
    private Integer classtestId;

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
     * 
     */
    private Integer isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCurriculumLessonId() {
        return curriculumLessonId;
    }

    public void setCurriculumLessonId(Integer curriculumLessonId) {
        this.curriculumLessonId = curriculumLessonId;
    }

    public Integer getClasstestId() {
        return classtestId;
    }

    public void setClasstestId(Integer classtestId) {
        this.classtestId = classtestId;
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