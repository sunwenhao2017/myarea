package com.qtone.hdkt.model.homework;

import java.util.Date;

public class LessonHomeworkStudentProblem {
    private Integer id;

    private Integer lessonStudentId;

    private Integer problemId;

    private Integer problemType;

    private Integer source;

    private Integer sourceType;

    private Integer isCorrect;

    private Integer answertype;

    private String remark;

    private Integer score;

    private Integer determineScore;

    private Date createTime;

    private Date updateTime;

    private Date deleteTime;

    private Integer isDeleted;

    private String answer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLessonStudentId() {
        return lessonStudentId;
    }

    public void setLessonStudentId(Integer lessonStudentId) {
        this.lessonStudentId = lessonStudentId;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public Integer getProblemType() {
        return problemType;
    }

    public void setProblemType(Integer problemType) {
        this.problemType = problemType;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Integer isCorrect) {
        this.isCorrect = isCorrect;
    }

    public Integer getAnswertype() {
        return answertype;
    }

    public void setAnswertype(Integer answertype) {
        this.answertype = answertype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getDetermineScore() {
        return determineScore;
    }

    public void setDetermineScore(Integer determineScore) {
        this.determineScore = determineScore;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}