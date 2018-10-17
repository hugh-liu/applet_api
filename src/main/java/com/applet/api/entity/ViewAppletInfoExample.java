package com.applet.api.entity;

import com.applet.api.util.page.Page;
import java.util.ArrayList;
import java.util.List;

public class ViewAppletInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ViewAppletInfoExample() {
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

        public Criteria andAppletNameIsNull() {
            addCriterion("applet_name is null");
            return (Criteria) this;
        }

        public Criteria andAppletNameIsNotNull() {
            addCriterion("applet_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppletNameEqualTo(String value) {
            addCriterion("applet_name =", value, "appletName");
            return (Criteria) this;
        }

        public Criteria andAppletNameNotEqualTo(String value) {
            addCriterion("applet_name <>", value, "appletName");
            return (Criteria) this;
        }

        public Criteria andAppletNameGreaterThan(String value) {
            addCriterion("applet_name >", value, "appletName");
            return (Criteria) this;
        }

        public Criteria andAppletNameGreaterThanOrEqualTo(String value) {
            addCriterion("applet_name >=", value, "appletName");
            return (Criteria) this;
        }

        public Criteria andAppletNameLessThan(String value) {
            addCriterion("applet_name <", value, "appletName");
            return (Criteria) this;
        }

        public Criteria andAppletNameLessThanOrEqualTo(String value) {
            addCriterion("applet_name <=", value, "appletName");
            return (Criteria) this;
        }

        public Criteria andAppletNameLike(String value) {
            addCriterion("applet_name like", value, "appletName");
            return (Criteria) this;
        }

        public Criteria andAppletNameNotLike(String value) {
            addCriterion("applet_name not like", value, "appletName");
            return (Criteria) this;
        }

        public Criteria andAppletNameIn(List<String> values) {
            addCriterion("applet_name in", values, "appletName");
            return (Criteria) this;
        }

        public Criteria andAppletNameNotIn(List<String> values) {
            addCriterion("applet_name not in", values, "appletName");
            return (Criteria) this;
        }

        public Criteria andAppletNameBetween(String value1, String value2) {
            addCriterion("applet_name between", value1, value2, "appletName");
            return (Criteria) this;
        }

        public Criteria andAppletNameNotBetween(String value1, String value2) {
            addCriterion("applet_name not between", value1, value2, "appletName");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAppletCodeIsNull() {
            addCriterion("applet_code is null");
            return (Criteria) this;
        }

        public Criteria andAppletCodeIsNotNull() {
            addCriterion("applet_code is not null");
            return (Criteria) this;
        }

        public Criteria andAppletCodeEqualTo(String value) {
            addCriterion("applet_code =", value, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppletCodeNotEqualTo(String value) {
            addCriterion("applet_code <>", value, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppletCodeGreaterThan(String value) {
            addCriterion("applet_code >", value, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppletCodeGreaterThanOrEqualTo(String value) {
            addCriterion("applet_code >=", value, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppletCodeLessThan(String value) {
            addCriterion("applet_code <", value, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppletCodeLessThanOrEqualTo(String value) {
            addCriterion("applet_code <=", value, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppletCodeLike(String value) {
            addCriterion("applet_code like", value, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppletCodeNotLike(String value) {
            addCriterion("applet_code not like", value, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppletCodeIn(List<String> values) {
            addCriterion("applet_code in", values, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppletCodeNotIn(List<String> values) {
            addCriterion("applet_code not in", values, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppletCodeBetween(String value1, String value2) {
            addCriterion("applet_code between", value1, value2, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppletCodeNotBetween(String value1, String value2) {
            addCriterion("applet_code not between", value1, value2, "appletCode");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNull() {
            addCriterion("app_secret is null");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNotNull() {
            addCriterion("app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andAppSecretEqualTo(String value) {
            addCriterion("app_secret =", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotEqualTo(String value) {
            addCriterion("app_secret <>", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThan(String value) {
            addCriterion("app_secret >", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("app_secret >=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThan(String value) {
            addCriterion("app_secret <", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThanOrEqualTo(String value) {
            addCriterion("app_secret <=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLike(String value) {
            addCriterion("app_secret like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotLike(String value) {
            addCriterion("app_secret not like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretIn(List<String> values) {
            addCriterion("app_secret in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotIn(List<String> values) {
            addCriterion("app_secret not in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretBetween(String value1, String value2) {
            addCriterion("app_secret between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotBetween(String value1, String value2) {
            addCriterion("app_secret not between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andIfSellingIsNull() {
            addCriterion("if_selling is null");
            return (Criteria) this;
        }

        public Criteria andIfSellingIsNotNull() {
            addCriterion("if_selling is not null");
            return (Criteria) this;
        }

        public Criteria andIfSellingEqualTo(Boolean value) {
            addCriterion("if_selling =", value, "ifSelling");
            return (Criteria) this;
        }

        public Criteria andIfSellingNotEqualTo(Boolean value) {
            addCriterion("if_selling <>", value, "ifSelling");
            return (Criteria) this;
        }

        public Criteria andIfSellingGreaterThan(Boolean value) {
            addCriterion("if_selling >", value, "ifSelling");
            return (Criteria) this;
        }

        public Criteria andIfSellingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("if_selling >=", value, "ifSelling");
            return (Criteria) this;
        }

        public Criteria andIfSellingLessThan(Boolean value) {
            addCriterion("if_selling <", value, "ifSelling");
            return (Criteria) this;
        }

        public Criteria andIfSellingLessThanOrEqualTo(Boolean value) {
            addCriterion("if_selling <=", value, "ifSelling");
            return (Criteria) this;
        }

        public Criteria andIfSellingIn(List<Boolean> values) {
            addCriterion("if_selling in", values, "ifSelling");
            return (Criteria) this;
        }

        public Criteria andIfSellingNotIn(List<Boolean> values) {
            addCriterion("if_selling not in", values, "ifSelling");
            return (Criteria) this;
        }

        public Criteria andIfSellingBetween(Boolean value1, Boolean value2) {
            addCriterion("if_selling between", value1, value2, "ifSelling");
            return (Criteria) this;
        }

        public Criteria andIfSellingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("if_selling not between", value1, value2, "ifSelling");
            return (Criteria) this;
        }

        public Criteria andAppletStatusIsNull() {
            addCriterion("applet_status is null");
            return (Criteria) this;
        }

        public Criteria andAppletStatusIsNotNull() {
            addCriterion("applet_status is not null");
            return (Criteria) this;
        }

        public Criteria andAppletStatusEqualTo(Boolean value) {
            addCriterion("applet_status =", value, "appletStatus");
            return (Criteria) this;
        }

        public Criteria andAppletStatusNotEqualTo(Boolean value) {
            addCriterion("applet_status <>", value, "appletStatus");
            return (Criteria) this;
        }

        public Criteria andAppletStatusGreaterThan(Boolean value) {
            addCriterion("applet_status >", value, "appletStatus");
            return (Criteria) this;
        }

        public Criteria andAppletStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("applet_status >=", value, "appletStatus");
            return (Criteria) this;
        }

        public Criteria andAppletStatusLessThan(Boolean value) {
            addCriterion("applet_status <", value, "appletStatus");
            return (Criteria) this;
        }

        public Criteria andAppletStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("applet_status <=", value, "appletStatus");
            return (Criteria) this;
        }

        public Criteria andAppletStatusIn(List<Boolean> values) {
            addCriterion("applet_status in", values, "appletStatus");
            return (Criteria) this;
        }

        public Criteria andAppletStatusNotIn(List<Boolean> values) {
            addCriterion("applet_status not in", values, "appletStatus");
            return (Criteria) this;
        }

        public Criteria andAppletStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("applet_status between", value1, value2, "appletStatus");
            return (Criteria) this;
        }

        public Criteria andAppletStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("applet_status not between", value1, value2, "appletStatus");
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

        public Criteria andTemplateStatusIsNull() {
            addCriterion("template_status is null");
            return (Criteria) this;
        }

        public Criteria andTemplateStatusIsNotNull() {
            addCriterion("template_status is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateStatusEqualTo(Integer value) {
            addCriterion("template_status =", value, "templateStatus");
            return (Criteria) this;
        }

        public Criteria andTemplateStatusNotEqualTo(Integer value) {
            addCriterion("template_status <>", value, "templateStatus");
            return (Criteria) this;
        }

        public Criteria andTemplateStatusGreaterThan(Integer value) {
            addCriterion("template_status >", value, "templateStatus");
            return (Criteria) this;
        }

        public Criteria andTemplateStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_status >=", value, "templateStatus");
            return (Criteria) this;
        }

        public Criteria andTemplateStatusLessThan(Integer value) {
            addCriterion("template_status <", value, "templateStatus");
            return (Criteria) this;
        }

        public Criteria andTemplateStatusLessThanOrEqualTo(Integer value) {
            addCriterion("template_status <=", value, "templateStatus");
            return (Criteria) this;
        }

        public Criteria andTemplateStatusIn(List<Integer> values) {
            addCriterion("template_status in", values, "templateStatus");
            return (Criteria) this;
        }

        public Criteria andTemplateStatusNotIn(List<Integer> values) {
            addCriterion("template_status not in", values, "templateStatus");
            return (Criteria) this;
        }

        public Criteria andTemplateStatusBetween(Integer value1, Integer value2) {
            addCriterion("template_status between", value1, value2, "templateStatus");
            return (Criteria) this;
        }

        public Criteria andTemplateStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("template_status not between", value1, value2, "templateStatus");
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