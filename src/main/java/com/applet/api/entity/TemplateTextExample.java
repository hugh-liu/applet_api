package com.applet.api.entity;

import com.applet.api.util.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TemplateTextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public TemplateTextExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andUserTemplateIdIsNull() {
            addCriterion("user_template_id is null");
            return (Criteria) this;
        }

        public Criteria andUserTemplateIdIsNotNull() {
            addCriterion("user_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserTemplateIdEqualTo(Integer value) {
            addCriterion("user_template_id =", value, "userTemplateId");
            return (Criteria) this;
        }

        public Criteria andUserTemplateIdNotEqualTo(Integer value) {
            addCriterion("user_template_id <>", value, "userTemplateId");
            return (Criteria) this;
        }

        public Criteria andUserTemplateIdGreaterThan(Integer value) {
            addCriterion("user_template_id >", value, "userTemplateId");
            return (Criteria) this;
        }

        public Criteria andUserTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_template_id >=", value, "userTemplateId");
            return (Criteria) this;
        }

        public Criteria andUserTemplateIdLessThan(Integer value) {
            addCriterion("user_template_id <", value, "userTemplateId");
            return (Criteria) this;
        }

        public Criteria andUserTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_template_id <=", value, "userTemplateId");
            return (Criteria) this;
        }

        public Criteria andUserTemplateIdIn(List<Integer> values) {
            addCriterion("user_template_id in", values, "userTemplateId");
            return (Criteria) this;
        }

        public Criteria andUserTemplateIdNotIn(List<Integer> values) {
            addCriterion("user_template_id not in", values, "userTemplateId");
            return (Criteria) this;
        }

        public Criteria andUserTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("user_template_id between", value1, value2, "userTemplateId");
            return (Criteria) this;
        }

        public Criteria andUserTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_template_id not between", value1, value2, "userTemplateId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNull() {
            addCriterion("config_id is null");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNotNull() {
            addCriterion("config_id is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualTo(Integer value) {
            addCriterion("config_id =", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualTo(Integer value) {
            addCriterion("config_id <>", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThan(Integer value) {
            addCriterion("config_id >", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("config_id >=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThan(Integer value) {
            addCriterion("config_id <", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualTo(Integer value) {
            addCriterion("config_id <=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIn(List<Integer> values) {
            addCriterion("config_id in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotIn(List<Integer> values) {
            addCriterion("config_id not in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdBetween(Integer value1, Integer value2) {
            addCriterion("config_id between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotBetween(Integer value1, Integer value2) {
            addCriterion("config_id not between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andTextTypeIsNull() {
            addCriterion("text_type is null");
            return (Criteria) this;
        }

        public Criteria andTextTypeIsNotNull() {
            addCriterion("text_type is not null");
            return (Criteria) this;
        }

        public Criteria andTextTypeEqualTo(Integer value) {
            addCriterion("text_type =", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeNotEqualTo(Integer value) {
            addCriterion("text_type <>", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeGreaterThan(Integer value) {
            addCriterion("text_type >", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_type >=", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeLessThan(Integer value) {
            addCriterion("text_type <", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeLessThanOrEqualTo(Integer value) {
            addCriterion("text_type <=", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeIn(List<Integer> values) {
            addCriterion("text_type in", values, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeNotIn(List<Integer> values) {
            addCriterion("text_type not in", values, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeBetween(Integer value1, Integer value2) {
            addCriterion("text_type between", value1, value2, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("text_type not between", value1, value2, "textType");
            return (Criteria) this;
        }

        public Criteria andTextContentIsNull() {
            addCriterion("text_content is null");
            return (Criteria) this;
        }

        public Criteria andTextContentIsNotNull() {
            addCriterion("text_content is not null");
            return (Criteria) this;
        }

        public Criteria andTextContentEqualTo(String value) {
            addCriterion("text_content =", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentNotEqualTo(String value) {
            addCriterion("text_content <>", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentGreaterThan(String value) {
            addCriterion("text_content >", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentGreaterThanOrEqualTo(String value) {
            addCriterion("text_content >=", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentLessThan(String value) {
            addCriterion("text_content <", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentLessThanOrEqualTo(String value) {
            addCriterion("text_content <=", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentLike(String value) {
            addCriterion("text_content like", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentNotLike(String value) {
            addCriterion("text_content not like", value, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentIn(List<String> values) {
            addCriterion("text_content in", values, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentNotIn(List<String> values) {
            addCriterion("text_content not in", values, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentBetween(String value1, String value2) {
            addCriterion("text_content between", value1, value2, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextContentNotBetween(String value1, String value2) {
            addCriterion("text_content not between", value1, value2, "textContent");
            return (Criteria) this;
        }

        public Criteria andTextIndexIsNull() {
            addCriterion("text_index is null");
            return (Criteria) this;
        }

        public Criteria andTextIndexIsNotNull() {
            addCriterion("text_index is not null");
            return (Criteria) this;
        }

        public Criteria andTextIndexEqualTo(Integer value) {
            addCriterion("text_index =", value, "textIndex");
            return (Criteria) this;
        }

        public Criteria andTextIndexNotEqualTo(Integer value) {
            addCriterion("text_index <>", value, "textIndex");
            return (Criteria) this;
        }

        public Criteria andTextIndexGreaterThan(Integer value) {
            addCriterion("text_index >", value, "textIndex");
            return (Criteria) this;
        }

        public Criteria andTextIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_index >=", value, "textIndex");
            return (Criteria) this;
        }

        public Criteria andTextIndexLessThan(Integer value) {
            addCriterion("text_index <", value, "textIndex");
            return (Criteria) this;
        }

        public Criteria andTextIndexLessThanOrEqualTo(Integer value) {
            addCriterion("text_index <=", value, "textIndex");
            return (Criteria) this;
        }

        public Criteria andTextIndexIn(List<Integer> values) {
            addCriterion("text_index in", values, "textIndex");
            return (Criteria) this;
        }

        public Criteria andTextIndexNotIn(List<Integer> values) {
            addCriterion("text_index not in", values, "textIndex");
            return (Criteria) this;
        }

        public Criteria andTextIndexBetween(Integer value1, Integer value2) {
            addCriterion("text_index between", value1, value2, "textIndex");
            return (Criteria) this;
        }

        public Criteria andTextIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("text_index not between", value1, value2, "textIndex");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
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