package com.chinataoshu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShopbookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopbookExample() {
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

        public Criteria andShopidIsNull() {
            addCriterion("ShopId is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("ShopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("ShopId =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("ShopId <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("ShopId >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShopId >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("ShopId <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("ShopId <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("ShopId in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("ShopId not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("ShopId between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShopId not between", value1, value2, "shopid");
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

        public Criteria andBooktileIsNull() {
            addCriterion("BookTile is null");
            return (Criteria) this;
        }

        public Criteria andBooktileIsNotNull() {
            addCriterion("BookTile is not null");
            return (Criteria) this;
        }

        public Criteria andBooktileEqualTo(String value) {
            addCriterion("BookTile =", value, "booktile");
            return (Criteria) this;
        }

        public Criteria andBooktileNotEqualTo(String value) {
            addCriterion("BookTile <>", value, "booktile");
            return (Criteria) this;
        }

        public Criteria andBooktileGreaterThan(String value) {
            addCriterion("BookTile >", value, "booktile");
            return (Criteria) this;
        }

        public Criteria andBooktileGreaterThanOrEqualTo(String value) {
            addCriterion("BookTile >=", value, "booktile");
            return (Criteria) this;
        }

        public Criteria andBooktileLessThan(String value) {
            addCriterion("BookTile <", value, "booktile");
            return (Criteria) this;
        }

        public Criteria andBooktileLessThanOrEqualTo(String value) {
            addCriterion("BookTile <=", value, "booktile");
            return (Criteria) this;
        }

        public Criteria andBooktileLike(String value) {
            addCriterion("BookTile like", value, "booktile");
            return (Criteria) this;
        }

        public Criteria andBooktileNotLike(String value) {
            addCriterion("BookTile not like", value, "booktile");
            return (Criteria) this;
        }

        public Criteria andBooktileIn(List<String> values) {
            addCriterion("BookTile in", values, "booktile");
            return (Criteria) this;
        }

        public Criteria andBooktileNotIn(List<String> values) {
            addCriterion("BookTile not in", values, "booktile");
            return (Criteria) this;
        }

        public Criteria andBooktileBetween(String value1, String value2) {
            addCriterion("BookTile between", value1, value2, "booktile");
            return (Criteria) this;
        }

        public Criteria andBooktileNotBetween(String value1, String value2) {
            addCriterion("BookTile not between", value1, value2, "booktile");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andItemstatusIsNull() {
            addCriterion("ItemStatus is null");
            return (Criteria) this;
        }

        public Criteria andItemstatusIsNotNull() {
            addCriterion("ItemStatus is not null");
            return (Criteria) this;
        }

        public Criteria andItemstatusEqualTo(String value) {
            addCriterion("ItemStatus =", value, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andItemstatusNotEqualTo(String value) {
            addCriterion("ItemStatus <>", value, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andItemstatusGreaterThan(String value) {
            addCriterion("ItemStatus >", value, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andItemstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ItemStatus >=", value, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andItemstatusLessThan(String value) {
            addCriterion("ItemStatus <", value, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andItemstatusLessThanOrEqualTo(String value) {
            addCriterion("ItemStatus <=", value, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andItemstatusLike(String value) {
            addCriterion("ItemStatus like", value, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andItemstatusNotLike(String value) {
            addCriterion("ItemStatus not like", value, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andItemstatusIn(List<String> values) {
            addCriterion("ItemStatus in", values, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andItemstatusNotIn(List<String> values) {
            addCriterion("ItemStatus not in", values, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andItemstatusBetween(String value1, String value2) {
            addCriterion("ItemStatus between", value1, value2, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andItemstatusNotBetween(String value1, String value2) {
            addCriterion("ItemStatus not between", value1, value2, "itemstatus");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateIsNull() {
            addCriterion("FrightTemplate is null");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateIsNotNull() {
            addCriterion("FrightTemplate is not null");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateEqualTo(String value) {
            addCriterion("FrightTemplate =", value, "frighttemplate");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateNotEqualTo(String value) {
            addCriterion("FrightTemplate <>", value, "frighttemplate");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateGreaterThan(String value) {
            addCriterion("FrightTemplate >", value, "frighttemplate");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateGreaterThanOrEqualTo(String value) {
            addCriterion("FrightTemplate >=", value, "frighttemplate");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateLessThan(String value) {
            addCriterion("FrightTemplate <", value, "frighttemplate");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateLessThanOrEqualTo(String value) {
            addCriterion("FrightTemplate <=", value, "frighttemplate");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateLike(String value) {
            addCriterion("FrightTemplate like", value, "frighttemplate");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateNotLike(String value) {
            addCriterion("FrightTemplate not like", value, "frighttemplate");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateIn(List<String> values) {
            addCriterion("FrightTemplate in", values, "frighttemplate");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateNotIn(List<String> values) {
            addCriterion("FrightTemplate not in", values, "frighttemplate");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateBetween(String value1, String value2) {
            addCriterion("FrightTemplate between", value1, value2, "frighttemplate");
            return (Criteria) this;
        }

        public Criteria andFrighttemplateNotBetween(String value1, String value2) {
            addCriterion("FrightTemplate not between", value1, value2, "frighttemplate");
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