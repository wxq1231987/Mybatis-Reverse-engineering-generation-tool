package com.chinataoshu.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("OrderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("OrderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("OrderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("OrderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("OrderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("OrderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("OrderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("OrderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("OrderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("OrderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("OrderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("OrderId not between", value1, value2, "orderid");
            return (Criteria) this;
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

        public Criteria andBooknoIsNull() {
            addCriterion("BookNo is null");
            return (Criteria) this;
        }

        public Criteria andBooknoIsNotNull() {
            addCriterion("BookNo is not null");
            return (Criteria) this;
        }

        public Criteria andBooknoEqualTo(Integer value) {
            addCriterion("BookNo =", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoNotEqualTo(Integer value) {
            addCriterion("BookNo <>", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoGreaterThan(Integer value) {
            addCriterion("BookNo >", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookNo >=", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoLessThan(Integer value) {
            addCriterion("BookNo <", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoLessThanOrEqualTo(Integer value) {
            addCriterion("BookNo <=", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoIn(List<Integer> values) {
            addCriterion("BookNo in", values, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoNotIn(List<Integer> values) {
            addCriterion("BookNo not in", values, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoBetween(Integer value1, Integer value2) {
            addCriterion("BookNo between", value1, value2, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoNotBetween(Integer value1, Integer value2) {
            addCriterion("BookNo not between", value1, value2, "bookno");
            return (Criteria) this;
        }

        public Criteria andIspadIsNull() {
            addCriterion("IsPad is null");
            return (Criteria) this;
        }

        public Criteria andIspadIsNotNull() {
            addCriterion("IsPad is not null");
            return (Criteria) this;
        }

        public Criteria andIspadEqualTo(String value) {
            addCriterion("IsPad =", value, "ispad");
            return (Criteria) this;
        }

        public Criteria andIspadNotEqualTo(String value) {
            addCriterion("IsPad <>", value, "ispad");
            return (Criteria) this;
        }

        public Criteria andIspadGreaterThan(String value) {
            addCriterion("IsPad >", value, "ispad");
            return (Criteria) this;
        }

        public Criteria andIspadGreaterThanOrEqualTo(String value) {
            addCriterion("IsPad >=", value, "ispad");
            return (Criteria) this;
        }

        public Criteria andIspadLessThan(String value) {
            addCriterion("IsPad <", value, "ispad");
            return (Criteria) this;
        }

        public Criteria andIspadLessThanOrEqualTo(String value) {
            addCriterion("IsPad <=", value, "ispad");
            return (Criteria) this;
        }

        public Criteria andIspadLike(String value) {
            addCriterion("IsPad like", value, "ispad");
            return (Criteria) this;
        }

        public Criteria andIspadNotLike(String value) {
            addCriterion("IsPad not like", value, "ispad");
            return (Criteria) this;
        }

        public Criteria andIspadIn(List<String> values) {
            addCriterion("IsPad in", values, "ispad");
            return (Criteria) this;
        }

        public Criteria andIspadNotIn(List<String> values) {
            addCriterion("IsPad not in", values, "ispad");
            return (Criteria) this;
        }

        public Criteria andIspadBetween(String value1, String value2) {
            addCriterion("IsPad between", value1, value2, "ispad");
            return (Criteria) this;
        }

        public Criteria andIspadNotBetween(String value1, String value2) {
            addCriterion("IsPad not between", value1, value2, "ispad");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryIsNull() {
            addCriterion("IsDelivery is null");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryIsNotNull() {
            addCriterion("IsDelivery is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryEqualTo(String value) {
            addCriterion("IsDelivery =", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryNotEqualTo(String value) {
            addCriterion("IsDelivery <>", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryGreaterThan(String value) {
            addCriterion("IsDelivery >", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("IsDelivery >=", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryLessThan(String value) {
            addCriterion("IsDelivery <", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryLessThanOrEqualTo(String value) {
            addCriterion("IsDelivery <=", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryLike(String value) {
            addCriterion("IsDelivery like", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryNotLike(String value) {
            addCriterion("IsDelivery not like", value, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryIn(List<String> values) {
            addCriterion("IsDelivery in", values, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryNotIn(List<String> values) {
            addCriterion("IsDelivery not in", values, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryBetween(String value1, String value2) {
            addCriterion("IsDelivery between", value1, value2, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsdeliveryNotBetween(String value1, String value2) {
            addCriterion("IsDelivery not between", value1, value2, "isdelivery");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedIsNull() {
            addCriterion("IsEvaluated is null");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedIsNotNull() {
            addCriterion("IsEvaluated is not null");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedEqualTo(String value) {
            addCriterion("IsEvaluated =", value, "isevaluated");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedNotEqualTo(String value) {
            addCriterion("IsEvaluated <>", value, "isevaluated");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedGreaterThan(String value) {
            addCriterion("IsEvaluated >", value, "isevaluated");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedGreaterThanOrEqualTo(String value) {
            addCriterion("IsEvaluated >=", value, "isevaluated");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedLessThan(String value) {
            addCriterion("IsEvaluated <", value, "isevaluated");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedLessThanOrEqualTo(String value) {
            addCriterion("IsEvaluated <=", value, "isevaluated");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedLike(String value) {
            addCriterion("IsEvaluated like", value, "isevaluated");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedNotLike(String value) {
            addCriterion("IsEvaluated not like", value, "isevaluated");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedIn(List<String> values) {
            addCriterion("IsEvaluated in", values, "isevaluated");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedNotIn(List<String> values) {
            addCriterion("IsEvaluated not in", values, "isevaluated");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedBetween(String value1, String value2) {
            addCriterion("IsEvaluated between", value1, value2, "isevaluated");
            return (Criteria) this;
        }

        public Criteria andIsevaluatedNotBetween(String value1, String value2) {
            addCriterion("IsEvaluated not between", value1, value2, "isevaluated");
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