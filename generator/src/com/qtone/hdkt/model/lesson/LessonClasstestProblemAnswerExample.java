package com.qtone.hdkt.model.lesson;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LessonClasstestProblemAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public LessonClasstestProblemAnswerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdIsNull() {
            addCriterion("lesson_classtest_id is null");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdIsNotNull() {
            addCriterion("lesson_classtest_id is not null");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdEqualTo(Integer value) {
            addCriterion("lesson_classtest_id =", value, "lessonClasstestId");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdNotEqualTo(Integer value) {
            addCriterion("lesson_classtest_id <>", value, "lessonClasstestId");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdGreaterThan(Integer value) {
            addCriterion("lesson_classtest_id >", value, "lessonClasstestId");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lesson_classtest_id >=", value, "lessonClasstestId");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdLessThan(Integer value) {
            addCriterion("lesson_classtest_id <", value, "lessonClasstestId");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdLessThanOrEqualTo(Integer value) {
            addCriterion("lesson_classtest_id <=", value, "lessonClasstestId");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdIn(List<Integer> values) {
            addCriterion("lesson_classtest_id in", values, "lessonClasstestId");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdNotIn(List<Integer> values) {
            addCriterion("lesson_classtest_id not in", values, "lessonClasstestId");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdBetween(Integer value1, Integer value2) {
            addCriterion("lesson_classtest_id between", value1, value2, "lessonClasstestId");
            return (Criteria) this;
        }

        public Criteria andLessonClasstestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lesson_classtest_id not between", value1, value2, "lessonClasstestId");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNull() {
            addCriterion("problem_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNotNull() {
            addCriterion("problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemIdEqualTo(Integer value) {
            addCriterion("problem_id =", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotEqualTo(Integer value) {
            addCriterion("problem_id <>", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThan(Integer value) {
            addCriterion("problem_id >", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_id >=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThan(Integer value) {
            addCriterion("problem_id <", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThanOrEqualTo(Integer value) {
            addCriterion("problem_id <=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdIn(List<Integer> values) {
            addCriterion("problem_id in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotIn(List<Integer> values) {
            addCriterion("problem_id not in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdBetween(Integer value1, Integer value2) {
            addCriterion("problem_id between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_id not between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIsNull() {
            addCriterion("student_card is null");
            return (Criteria) this;
        }

        public Criteria andStudentCardIsNotNull() {
            addCriterion("student_card is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCardEqualTo(String value) {
            addCriterion("student_card =", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardNotEqualTo(String value) {
            addCriterion("student_card <>", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardGreaterThan(String value) {
            addCriterion("student_card >", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardGreaterThanOrEqualTo(String value) {
            addCriterion("student_card >=", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardLessThan(String value) {
            addCriterion("student_card <", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardLessThanOrEqualTo(String value) {
            addCriterion("student_card <=", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardLike(String value) {
            addCriterion("student_card like", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardNotLike(String value) {
            addCriterion("student_card not like", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardIn(List<String> values) {
            addCriterion("student_card in", values, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardNotIn(List<String> values) {
            addCriterion("student_card not in", values, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardBetween(String value1, String value2) {
            addCriterion("student_card between", value1, value2, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardNotBetween(String value1, String value2) {
            addCriterion("student_card not between", value1, value2, "studentCard");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveIsNull() {
            addCriterion("is_subjective is null");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveIsNotNull() {
            addCriterion("is_subjective is not null");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveEqualTo(Integer value) {
            addCriterion("is_subjective =", value, "isSubjective");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveNotEqualTo(Integer value) {
            addCriterion("is_subjective <>", value, "isSubjective");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveGreaterThan(Integer value) {
            addCriterion("is_subjective >", value, "isSubjective");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_subjective >=", value, "isSubjective");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveLessThan(Integer value) {
            addCriterion("is_subjective <", value, "isSubjective");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveLessThanOrEqualTo(Integer value) {
            addCriterion("is_subjective <=", value, "isSubjective");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveIn(List<Integer> values) {
            addCriterion("is_subjective in", values, "isSubjective");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveNotIn(List<Integer> values) {
            addCriterion("is_subjective not in", values, "isSubjective");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveBetween(Integer value1, Integer value2) {
            addCriterion("is_subjective between", value1, value2, "isSubjective");
            return (Criteria) this;
        }

        public Criteria andIsSubjectiveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_subjective not between", value1, value2, "isSubjective");
            return (Criteria) this;
        }

        public Criteria andIsCorrectIsNull() {
            addCriterion("is_correct is null");
            return (Criteria) this;
        }

        public Criteria andIsCorrectIsNotNull() {
            addCriterion("is_correct is not null");
            return (Criteria) this;
        }

        public Criteria andIsCorrectEqualTo(Integer value) {
            addCriterion("is_correct =", value, "isCorrect");
            return (Criteria) this;
        }

        public Criteria andIsCorrectNotEqualTo(Integer value) {
            addCriterion("is_correct <>", value, "isCorrect");
            return (Criteria) this;
        }

        public Criteria andIsCorrectGreaterThan(Integer value) {
            addCriterion("is_correct >", value, "isCorrect");
            return (Criteria) this;
        }

        public Criteria andIsCorrectGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_correct >=", value, "isCorrect");
            return (Criteria) this;
        }

        public Criteria andIsCorrectLessThan(Integer value) {
            addCriterion("is_correct <", value, "isCorrect");
            return (Criteria) this;
        }

        public Criteria andIsCorrectLessThanOrEqualTo(Integer value) {
            addCriterion("is_correct <=", value, "isCorrect");
            return (Criteria) this;
        }

        public Criteria andIsCorrectIn(List<Integer> values) {
            addCriterion("is_correct in", values, "isCorrect");
            return (Criteria) this;
        }

        public Criteria andIsCorrectNotIn(List<Integer> values) {
            addCriterion("is_correct not in", values, "isCorrect");
            return (Criteria) this;
        }

        public Criteria andIsCorrectBetween(Integer value1, Integer value2) {
            addCriterion("is_correct between", value1, value2, "isCorrect");
            return (Criteria) this;
        }

        public Criteria andIsCorrectNotBetween(Integer value1, Integer value2) {
            addCriterion("is_correct not between", value1, value2, "isCorrect");
            return (Criteria) this;
        }

        public Criteria andAnswerSortIsNull() {
            addCriterion("answer_sort is null");
            return (Criteria) this;
        }

        public Criteria andAnswerSortIsNotNull() {
            addCriterion("answer_sort is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerSortEqualTo(Integer value) {
            addCriterion("answer_sort =", value, "answerSort");
            return (Criteria) this;
        }

        public Criteria andAnswerSortNotEqualTo(Integer value) {
            addCriterion("answer_sort <>", value, "answerSort");
            return (Criteria) this;
        }

        public Criteria andAnswerSortGreaterThan(Integer value) {
            addCriterion("answer_sort >", value, "answerSort");
            return (Criteria) this;
        }

        public Criteria andAnswerSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_sort >=", value, "answerSort");
            return (Criteria) this;
        }

        public Criteria andAnswerSortLessThan(Integer value) {
            addCriterion("answer_sort <", value, "answerSort");
            return (Criteria) this;
        }

        public Criteria andAnswerSortLessThanOrEqualTo(Integer value) {
            addCriterion("answer_sort <=", value, "answerSort");
            return (Criteria) this;
        }

        public Criteria andAnswerSortIn(List<Integer> values) {
            addCriterion("answer_sort in", values, "answerSort");
            return (Criteria) this;
        }

        public Criteria andAnswerSortNotIn(List<Integer> values) {
            addCriterion("answer_sort not in", values, "answerSort");
            return (Criteria) this;
        }

        public Criteria andAnswerSortBetween(Integer value1, Integer value2) {
            addCriterion("answer_sort between", value1, value2, "answerSort");
            return (Criteria) this;
        }

        public Criteria andAnswerSortNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_sort not between", value1, value2, "answerSort");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}