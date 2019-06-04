package com.qtone.hdkt.model.course;

import java.io.Serializable;
import java.util.Date;

public class CurriculumLessonStorybook implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 课程小节课id
     */
    private Integer curriculumLessonId;

    /**
     * 故事绘本id
     */
    private Integer bookId;

    /**
     * 打卡次数
     */
    private Integer numberClock;

    /**
     * 过期天数
     */
    private Integer deadlineday;

    /**
     * 是否发布到学生端，0标识不发布，1标识发布
     */
    private Integer isPublish;

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

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getNumberClock() {
        return numberClock;
    }

    public void setNumberClock(Integer numberClock) {
        this.numberClock = numberClock;
    }

    public Integer getDeadlineday() {
        return deadlineday;
    }

    public void setDeadlineday(Integer deadlineday) {
        this.deadlineday = deadlineday;
    }

    public Integer getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Integer isPublish) {
        this.isPublish = isPublish;
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