package com.qtone.hdkt.model.authority;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthorityWebpageInterfaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public AuthorityWebpageInterfaceExample() {
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

        public Criteria andInterfaceCodeIsNull() {
            addCriterion("interface_code is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeIsNotNull() {
            addCriterion("interface_code is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeEqualTo(String value) {
            addCriterion("interface_code =", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeNotEqualTo(String value) {
            addCriterion("interface_code <>", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeGreaterThan(String value) {
            addCriterion("interface_code >", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("interface_code >=", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeLessThan(String value) {
            addCriterion("interface_code <", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeLessThanOrEqualTo(String value) {
            addCriterion("interface_code <=", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeLike(String value) {
            addCriterion("interface_code like", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeNotLike(String value) {
            addCriterion("interface_code not like", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeIn(List<String> values) {
            addCriterion("interface_code in", values, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeNotIn(List<String> values) {
            addCriterion("interface_code not in", values, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeBetween(String value1, String value2) {
            addCriterion("interface_code between", value1, value2, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeNotBetween(String value1, String value2) {
            addCriterion("interface_code not between", value1, value2, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameIsNull() {
            addCriterion("interface_name is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameIsNotNull() {
            addCriterion("interface_name is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameEqualTo(String value) {
            addCriterion("interface_name =", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotEqualTo(String value) {
            addCriterion("interface_name <>", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameGreaterThan(String value) {
            addCriterion("interface_name >", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("interface_name >=", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLessThan(String value) {
            addCriterion("interface_name <", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLessThanOrEqualTo(String value) {
            addCriterion("interface_name <=", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameLike(String value) {
            addCriterion("interface_name like", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotLike(String value) {
            addCriterion("interface_name not like", value, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameIn(List<String> values) {
            addCriterion("interface_name in", values, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotIn(List<String> values) {
            addCriterion("interface_name not in", values, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameBetween(String value1, String value2) {
            addCriterion("interface_name between", value1, value2, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andInterfaceNameNotBetween(String value1, String value2) {
            addCriterion("interface_name not between", value1, value2, "interfaceName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(Integer value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(Integer value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(Integer value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(Integer value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<Integer> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<Integer> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(Integer value1, Integer value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlIsNull() {
            addCriterion("interface_url is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlIsNotNull() {
            addCriterion("interface_url is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlEqualTo(String value) {
            addCriterion("interface_url =", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlNotEqualTo(String value) {
            addCriterion("interface_url <>", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlGreaterThan(String value) {
            addCriterion("interface_url >", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("interface_url >=", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlLessThan(String value) {
            addCriterion("interface_url <", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlLessThanOrEqualTo(String value) {
            addCriterion("interface_url <=", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlLike(String value) {
            addCriterion("interface_url like", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlNotLike(String value) {
            addCriterion("interface_url not like", value, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlIn(List<String> values) {
            addCriterion("interface_url in", values, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlNotIn(List<String> values) {
            addCriterion("interface_url not in", values, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlBetween(String value1, String value2) {
            addCriterion("interface_url between", value1, value2, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andInterfaceUrlNotBetween(String value1, String value2) {
            addCriterion("interface_url not between", value1, value2, "interfaceUrl");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("method_name is null");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("method_name is not null");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("method_name =", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("method_name <>", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("method_name >", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("method_name >=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("method_name <", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("method_name <=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("method_name like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("method_name not like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("method_name in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("method_name not in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("method_name between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("method_name not between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andWebpageIdIsNull() {
            addCriterion("webpage_id is null");
            return (Criteria) this;
        }

        public Criteria andWebpageIdIsNotNull() {
            addCriterion("webpage_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebpageIdEqualTo(Integer value) {
            addCriterion("webpage_id =", value, "webpageId");
            return (Criteria) this;
        }

        public Criteria andWebpageIdNotEqualTo(Integer value) {
            addCriterion("webpage_id <>", value, "webpageId");
            return (Criteria) this;
        }

        public Criteria andWebpageIdGreaterThan(Integer value) {
            addCriterion("webpage_id >", value, "webpageId");
            return (Criteria) this;
        }

        public Criteria andWebpageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("webpage_id >=", value, "webpageId");
            return (Criteria) this;
        }

        public Criteria andWebpageIdLessThan(Integer value) {
            addCriterion("webpage_id <", value, "webpageId");
            return (Criteria) this;
        }

        public Criteria andWebpageIdLessThanOrEqualTo(Integer value) {
            addCriterion("webpage_id <=", value, "webpageId");
            return (Criteria) this;
        }

        public Criteria andWebpageIdIn(List<Integer> values) {
            addCriterion("webpage_id in", values, "webpageId");
            return (Criteria) this;
        }

        public Criteria andWebpageIdNotIn(List<Integer> values) {
            addCriterion("webpage_id not in", values, "webpageId");
            return (Criteria) this;
        }

        public Criteria andWebpageIdBetween(Integer value1, Integer value2) {
            addCriterion("webpage_id between", value1, value2, "webpageId");
            return (Criteria) this;
        }

        public Criteria andWebpageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("webpage_id not between", value1, value2, "webpageId");
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