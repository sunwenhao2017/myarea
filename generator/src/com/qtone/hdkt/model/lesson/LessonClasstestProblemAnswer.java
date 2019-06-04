package com.qtone.hdkt.model.lesson;

import java.util.Date;

public class LessonClasstestProblemAnswer {
    private Integer id;

    private Integer lessonClasstestId;

    private Integer problemId;

    private Integer studentId;

    private String studentCard;

    private Integer isSubjective;

    private Integer isCorrect;

    private Integer answerSort;

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

    public Integer getLessonClasstestId() {
        return lessonClasstestId;
    }

    public void setLessonClasstestId(Integer lessonClasstestId) {
        this.lessonClasstestId = lessonClasstestId;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(String studentCard) {
        this.studentCard = studentCard == null ? null : studentCard.trim();
    }

    public Integer getIsSubjective() {
        return isSubjective;
    }

    public void setIsSubjective(Integer isSubjective) {
        this.isSubjective = isSubjective;
    }

    public Integer getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Integer isCorrect) {
        this.isCorrect = isCorrect;
    }

    public Integer getAnswerSort() {
        return answerSort;
    }

    public void setAnswerSort(Integer answerSort) {
        this.answerSort = answerSort;
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