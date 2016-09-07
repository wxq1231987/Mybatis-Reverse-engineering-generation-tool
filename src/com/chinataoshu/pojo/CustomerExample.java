package com.chinataoshu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCusidIsNull() {
            addCriterion("CusId is null");
            return (Criteria) this;
        }

        public Criteria andCusidIsNotNull() {
            addCriterion("CusId is not null");
            return (Criteria) this;
        }

        public Criteria andCusidEqualTo(Integer value) {
            addCriterion("CusId =", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidNotEqualTo(Integer value) {
            addCriterion("CusId <>", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidGreaterThan(Integer value) {
            addCriterion("CusId >", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CusId >=", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidLessThan(Integer value) {
            addCriterion("CusId <", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidLessThanOrEqualTo(Integer value) {
            addCriterion("CusId <=", value, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidIn(List<Integer> values) {
            addCriterion("CusId in", values, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidNotIn(List<Integer> values) {
            addCriterion("CusId not in", values, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidBetween(Integer value1, Integer value2) {
            addCriterion("CusId between", value1, value2, "cusid");
            return (Criteria) this;
        }

        public Criteria andCusidNotBetween(Integer value1, Integer value2) {
            addCriterion("CusId not between", value1, value2, "cusid");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNull() {
            addCriterion("LoginId is null");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNotNull() {
            addCriterion("LoginId is not null");
            return (Criteria) this;
        }

        public Criteria andLoginidEqualTo(String value) {
            addCriterion("LoginId =", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotEqualTo(String value) {
            addCriterion("LoginId <>", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThan(String value) {
            addCriterion("LoginId >", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThanOrEqualTo(String value) {
            addCriterion("LoginId >=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThan(String value) {
            addCriterion("LoginId <", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThanOrEqualTo(String value) {
            addCriterion("LoginId <=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLike(String value) {
            addCriterion("LoginId like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotLike(String value) {
            addCriterion("LoginId not like", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidIn(List<String> values) {
            addCriterion("LoginId in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotIn(List<String> values) {
            addCriterion("LoginId not in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidBetween(String value1, String value2) {
            addCriterion("LoginId between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotBetween(String value1, String value2) {
            addCriterion("LoginId not between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIsNull() {
            addCriterion("LoginPwd is null");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIsNotNull() {
            addCriterion("LoginPwd is not null");
            return (Criteria) this;
        }

        public Criteria andLoginpwdEqualTo(String value) {
            addCriterion("LoginPwd =", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotEqualTo(String value) {
            addCriterion("LoginPwd <>", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdGreaterThan(String value) {
            addCriterion("LoginPwd >", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdGreaterThanOrEqualTo(String value) {
            addCriterion("LoginPwd >=", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLessThan(String value) {
            addCriterion("LoginPwd <", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLessThanOrEqualTo(String value) {
            addCriterion("LoginPwd <=", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLike(String value) {
            addCriterion("LoginPwd like", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotLike(String value) {
            addCriterion("LoginPwd not like", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIn(List<String> values) {
            addCriterion("LoginPwd in", values, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotIn(List<String> values) {
            addCriterion("LoginPwd not in", values, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdBetween(String value1, String value2) {
            addCriterion("LoginPwd between", value1, value2, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotBetween(String value1, String value2) {
            addCriterion("LoginPwd not between", value1, value2, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andCustelIsNull() {
            addCriterion("CusTel is null");
            return (Criteria) this;
        }

        public Criteria andCustelIsNotNull() {
            addCriterion("CusTel is not null");
            return (Criteria) this;
        }

        public Criteria andCustelEqualTo(String value) {
            addCriterion("CusTel =", value, "custel");
            return (Criteria) this;
        }

        public Criteria andCustelNotEqualTo(String value) {
            addCriterion("CusTel <>", value, "custel");
            return (Criteria) this;
        }

        public Criteria andCustelGreaterThan(String value) {
            addCriterion("CusTel >", value, "custel");
            return (Criteria) this;
        }

        public Criteria andCustelGreaterThanOrEqualTo(String value) {
            addCriterion("CusTel >=", value, "custel");
            return (Criteria) this;
        }

        public Criteria andCustelLessThan(String value) {
            addCriterion("CusTel <", value, "custel");
            return (Criteria) this;
        }

        public Criteria andCustelLessThanOrEqualTo(String value) {
            addCriterion("CusTel <=", value, "custel");
            return (Criteria) this;
        }

        public Criteria andCustelLike(String value) {
            addCriterion("CusTel like", value, "custel");
            return (Criteria) this;
        }

        public Criteria andCustelNotLike(String value) {
            addCriterion("CusTel not like", value, "custel");
            return (Criteria) this;
        }

        public Criteria andCustelIn(List<String> values) {
            addCriterion("CusTel in", values, "custel");
            return (Criteria) this;
        }

        public Criteria andCustelNotIn(List<String> values) {
            addCriterion("CusTel not in", values, "custel");
            return (Criteria) this;
        }

        public Criteria andCustelBetween(String value1, String value2) {
            addCriterion("CusTel between", value1, value2, "custel");
            return (Criteria) this;
        }

        public Criteria andCustelNotBetween(String value1, String value2) {
            addCriterion("CusTel not between", value1, value2, "custel");
            return (Criteria) this;
        }

        public Criteria andCusemailIsNull() {
            addCriterion("CusEmail is null");
            return (Criteria) this;
        }

        public Criteria andCusemailIsNotNull() {
            addCriterion("CusEmail is not null");
            return (Criteria) this;
        }

        public Criteria andCusemailEqualTo(String value) {
            addCriterion("CusEmail =", value, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusemailNotEqualTo(String value) {
            addCriterion("CusEmail <>", value, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusemailGreaterThan(String value) {
            addCriterion("CusEmail >", value, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusemailGreaterThanOrEqualTo(String value) {
            addCriterion("CusEmail >=", value, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusemailLessThan(String value) {
            addCriterion("CusEmail <", value, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusemailLessThanOrEqualTo(String value) {
            addCriterion("CusEmail <=", value, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusemailLike(String value) {
            addCriterion("CusEmail like", value, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusemailNotLike(String value) {
            addCriterion("CusEmail not like", value, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusemailIn(List<String> values) {
            addCriterion("CusEmail in", values, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusemailNotIn(List<String> values) {
            addCriterion("CusEmail not in", values, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusemailBetween(String value1, String value2) {
            addCriterion("CusEmail between", value1, value2, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusemailNotBetween(String value1, String value2) {
            addCriterion("CusEmail not between", value1, value2, "cusemail");
            return (Criteria) this;
        }

        public Criteria andCusnameIsNull() {
            addCriterion("CusName is null");
            return (Criteria) this;
        }

        public Criteria andCusnameIsNotNull() {
            addCriterion("CusName is not null");
            return (Criteria) this;
        }

        public Criteria andCusnameEqualTo(String value) {
            addCriterion("CusName =", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotEqualTo(String value) {
            addCriterion("CusName <>", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameGreaterThan(String value) {
            addCriterion("CusName >", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameGreaterThanOrEqualTo(String value) {
            addCriterion("CusName >=", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameLessThan(String value) {
            addCriterion("CusName <", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameLessThanOrEqualTo(String value) {
            addCriterion("CusName <=", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameLike(String value) {
            addCriterion("CusName like", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotLike(String value) {
            addCriterion("CusName not like", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameIn(List<String> values) {
            addCriterion("CusName in", values, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotIn(List<String> values) {
            addCriterion("CusName not in", values, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameBetween(String value1, String value2) {
            addCriterion("CusName between", value1, value2, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotBetween(String value1, String value2) {
            addCriterion("CusName not between", value1, value2, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusbalanceIsNull() {
            addCriterion("CusBalance is null");
            return (Criteria) this;
        }

        public Criteria andCusbalanceIsNotNull() {
            addCriterion("CusBalance is not null");
            return (Criteria) this;
        }

        public Criteria andCusbalanceEqualTo(Float value) {
            addCriterion("CusBalance =", value, "cusbalance");
            return (Criteria) this;
        }

        public Criteria andCusbalanceNotEqualTo(Float value) {
            addCriterion("CusBalance <>", value, "cusbalance");
            return (Criteria) this;
        }

        public Criteria andCusbalanceGreaterThan(Float value) {
            addCriterion("CusBalance >", value, "cusbalance");
            return (Criteria) this;
        }

        public Criteria andCusbalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("CusBalance >=", value, "cusbalance");
            return (Criteria) this;
        }

        public Criteria andCusbalanceLessThan(Float value) {
            addCriterion("CusBalance <", value, "cusbalance");
            return (Criteria) this;
        }

        public Criteria andCusbalanceLessThanOrEqualTo(Float value) {
            addCriterion("CusBalance <=", value, "cusbalance");
            return (Criteria) this;
        }

        public Criteria andCusbalanceIn(List<Float> values) {
            addCriterion("CusBalance in", values, "cusbalance");
            return (Criteria) this;
        }

        public Criteria andCusbalanceNotIn(List<Float> values) {
            addCriterion("CusBalance not in", values, "cusbalance");
            return (Criteria) this;
        }

        public Criteria andCusbalanceBetween(Float value1, Float value2) {
            addCriterion("CusBalance between", value1, value2, "cusbalance");
            return (Criteria) this;
        }

        public Criteria andCusbalanceNotBetween(Float value1, Float value2) {
            addCriterion("CusBalance not between", value1, value2, "cusbalance");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountIsNull() {
            addCriterion("AlipayAccount is null");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountIsNotNull() {
            addCriterion("AlipayAccount is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountEqualTo(String value) {
            addCriterion("AlipayAccount =", value, "alipayaccount");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountNotEqualTo(String value) {
            addCriterion("AlipayAccount <>", value, "alipayaccount");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountGreaterThan(String value) {
            addCriterion("AlipayAccount >", value, "alipayaccount");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountGreaterThanOrEqualTo(String value) {
            addCriterion("AlipayAccount >=", value, "alipayaccount");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountLessThan(String value) {
            addCriterion("AlipayAccount <", value, "alipayaccount");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountLessThanOrEqualTo(String value) {
            addCriterion("AlipayAccount <=", value, "alipayaccount");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountLike(String value) {
            addCriterion("AlipayAccount like", value, "alipayaccount");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountNotLike(String value) {
            addCriterion("AlipayAccount not like", value, "alipayaccount");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountIn(List<String> values) {
            addCriterion("AlipayAccount in", values, "alipayaccount");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountNotIn(List<String> values) {
            addCriterion("AlipayAccount not in", values, "alipayaccount");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountBetween(String value1, String value2) {
            addCriterion("AlipayAccount between", value1, value2, "alipayaccount");
            return (Criteria) this;
        }

        public Criteria andAlipayaccountNotBetween(String value1, String value2) {
            addCriterion("AlipayAccount not between", value1, value2, "alipayaccount");
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