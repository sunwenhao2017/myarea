package com.qtone.hdkt.model.authority;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthrityWebpageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public AuthrityWebpageExample() {
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

        public Criteria andWebpageCodeIsNull() {
            addCriterion("webpage_code is null");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeIsNotNull() {
            addCriterion("webpage_code is not null");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeEqualTo(String value) {
            addCriterion("webpage_code =", value, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeNotEqualTo(String value) {
            addCriterion("webpage_code <>", value, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeGreaterThan(String value) {
            addCriterion("webpage_code >", value, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("webpage_code >=", value, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeLessThan(String value) {
            addCriterion("webpage_code <", value, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeLessThanOrEqualTo(String value) {
            addCriterion("webpage_code <=", value, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeLike(String value) {
            addCriterion("webpage_code like", value, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeNotLike(String value) {
            addCriterion("webpage_code not like", value, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeIn(List<String> values) {
            addCriterion("webpage_code in", values, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeNotIn(List<String> values) {
            addCriterion("webpage_code not in", values, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeBetween(String value1, String value2) {
            addCriterion("webpage_code between", value1, value2, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageCodeNotBetween(String value1, String value2) {
            addCriterion("webpage_code not between", value1, value2, "webpageCode");
            return (Criteria) this;
        }

        public Criteria andWebpageNameIsNull() {
            addCriterion("webpage_name is null");
            return (Criteria) this;
        }

        public Criteria andWebpageNameIsNotNull() {
            addCriterion("webpage_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebpageNameEqualTo(String value) {
            addCriterion("webpage_name =", value, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageNameNotEqualTo(String value) {
            addCriterion("webpage_name <>", value, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageNameGreaterThan(String value) {
            addCriterion("webpage_name >", value, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageNameGreaterThanOrEqualTo(String value) {
            addCriterion("webpage_name >=", value, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageNameLessThan(String value) {
            addCriterion("webpage_name <", value, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageNameLessThanOrEqualTo(String value) {
            addCriterion("webpage_name <=", value, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageNameLike(String value) {
            addCriterion("webpage_name like", value, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageNameNotLike(String value) {
            addCriterion("webpage_name not like", value, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageNameIn(List<String> values) {
            addCriterion("webpage_name in", values, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageNameNotIn(List<String> values) {
            addCriterion("webpage_name not in", values, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageNameBetween(String value1, String value2) {
            addCriterion("webpage_name between", value1, value2, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageNameNotBetween(String value1, String value2) {
            addCriterion("webpage_name not between", value1, value2, "webpageName");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeIsNull() {
            addCriterion("webpage_type is null");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeIsNotNull() {
            addCriterion("webpage_type is not null");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeEqualTo(Integer value) {
            addCriterion("webpage_type =", value, "webpageType");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeNotEqualTo(Integer value) {
            addCriterion("webpage_type <>", value, "webpageType");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeGreaterThan(Integer value) {
            addCriterion("webpage_type >", value, "webpageType");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("webpage_type >=", value, "webpageType");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeLessThan(Integer value) {
            addCriterion("webpage_type <", value, "webpageType");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("webpage_type <=", value, "webpageType");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeIn(List<Integer> values) {
            addCriterion("webpage_type in", values, "webpageType");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeNotIn(List<Integer> values) {
            addCriterion("webpage_type not in", values, "webpageType");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeBetween(Integer value1, Integer value2) {
            addCriterion("webpage_type between", value1, value2, "webpageType");
            return (Criteria) this;
        }

        public Criteria andWebpageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("webpage_type not between", value1, value2, "webpageType");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andIsLastIsNull() {
            addCriterion("is_last is null");
            return (Criteria) this;
        }

        public Criteria andIsLastIsNotNull() {
            addCriterion("is_last is not null");
            return (Criteria) this;
        }

        public Criteria andIsLastEqualTo(Integer value) {
            addCriterion("is_last =", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastNotEqualTo(Integer value) {
            addCriterion("is_last <>", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastGreaterThan(Integer value) {
            addCriterion("is_last >", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_last >=", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastLessThan(Integer value) {
            addCriterion("is_last <", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastLessThanOrEqualTo(Integer value) {
            addCriterion("is_last <=", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastIn(List<Integer> values) {
            addCriterion("is_last in", values, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastNotIn(List<Integer> values) {
            addCriterion("is_last not in", values, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastBetween(Integer value1, Integer value2) {
            addCriterion("is_last between", value1, value2, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastNotBetween(Integer value1, Integer value2) {
            addCriterion("is_last not between", value1, value2, "isLast");
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