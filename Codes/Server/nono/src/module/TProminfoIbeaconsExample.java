package module;

import java.util.ArrayList;
import java.util.List;

public class TProminfoIbeaconsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProminfoIbeaconsExample() {
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

        public Criteria andStorenoIsNull() {
            addCriterion("storeno is null");
            return (Criteria) this;
        }

        public Criteria andStorenoIsNotNull() {
            addCriterion("storeno is not null");
            return (Criteria) this;
        }

        public Criteria andStorenoEqualTo(String value) {
            addCriterion("storeno =", value, "storeno");
            return (Criteria) this;
        }

        public Criteria andStorenoNotEqualTo(String value) {
            addCriterion("storeno <>", value, "storeno");
            return (Criteria) this;
        }

        public Criteria andStorenoGreaterThan(String value) {
            addCriterion("storeno >", value, "storeno");
            return (Criteria) this;
        }

        public Criteria andStorenoGreaterThanOrEqualTo(String value) {
            addCriterion("storeno >=", value, "storeno");
            return (Criteria) this;
        }

        public Criteria andStorenoLessThan(String value) {
            addCriterion("storeno <", value, "storeno");
            return (Criteria) this;
        }

        public Criteria andStorenoLessThanOrEqualTo(String value) {
            addCriterion("storeno <=", value, "storeno");
            return (Criteria) this;
        }

        public Criteria andStorenoLike(String value) {
            addCriterion("storeno like", value, "storeno");
            return (Criteria) this;
        }

        public Criteria andStorenoNotLike(String value) {
            addCriterion("storeno not like", value, "storeno");
            return (Criteria) this;
        }

        public Criteria andStorenoIn(List<String> values) {
            addCriterion("storeno in", values, "storeno");
            return (Criteria) this;
        }

        public Criteria andStorenoNotIn(List<String> values) {
            addCriterion("storeno not in", values, "storeno");
            return (Criteria) this;
        }

        public Criteria andStorenoBetween(String value1, String value2) {
            addCriterion("storeno between", value1, value2, "storeno");
            return (Criteria) this;
        }

        public Criteria andStorenoNotBetween(String value1, String value2) {
            addCriterion("storeno not between", value1, value2, "storeno");
            return (Criteria) this;
        }

        public Criteria andProminfoidIsNull() {
            addCriterion("prominfoid is null");
            return (Criteria) this;
        }

        public Criteria andProminfoidIsNotNull() {
            addCriterion("prominfoid is not null");
            return (Criteria) this;
        }

        public Criteria andProminfoidEqualTo(String value) {
            addCriterion("prominfoid =", value, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andProminfoidNotEqualTo(String value) {
            addCriterion("prominfoid <>", value, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andProminfoidGreaterThan(String value) {
            addCriterion("prominfoid >", value, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andProminfoidGreaterThanOrEqualTo(String value) {
            addCriterion("prominfoid >=", value, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andProminfoidLessThan(String value) {
            addCriterion("prominfoid <", value, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andProminfoidLessThanOrEqualTo(String value) {
            addCriterion("prominfoid <=", value, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andProminfoidLike(String value) {
            addCriterion("prominfoid like", value, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andProminfoidNotLike(String value) {
            addCriterion("prominfoid not like", value, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andProminfoidIn(List<String> values) {
            addCriterion("prominfoid in", values, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andProminfoidNotIn(List<String> values) {
            addCriterion("prominfoid not in", values, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andProminfoidBetween(String value1, String value2) {
            addCriterion("prominfoid between", value1, value2, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andProminfoidNotBetween(String value1, String value2) {
            addCriterion("prominfoid not between", value1, value2, "prominfoid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidIsNull() {
            addCriterion("ibeaconid is null");
            return (Criteria) this;
        }

        public Criteria andIbeaconidIsNotNull() {
            addCriterion("ibeaconid is not null");
            return (Criteria) this;
        }

        public Criteria andIbeaconidEqualTo(String value) {
            addCriterion("ibeaconid =", value, "ibeaconid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidNotEqualTo(String value) {
            addCriterion("ibeaconid <>", value, "ibeaconid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidGreaterThan(String value) {
            addCriterion("ibeaconid >", value, "ibeaconid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidGreaterThanOrEqualTo(String value) {
            addCriterion("ibeaconid >=", value, "ibeaconid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidLessThan(String value) {
            addCriterion("ibeaconid <", value, "ibeaconid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidLessThanOrEqualTo(String value) {
            addCriterion("ibeaconid <=", value, "ibeaconid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidLike(String value) {
            addCriterion("ibeaconid like", value, "ibeaconid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidNotLike(String value) {
            addCriterion("ibeaconid not like", value, "ibeaconid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidIn(List<String> values) {
            addCriterion("ibeaconid in", values, "ibeaconid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidNotIn(List<String> values) {
            addCriterion("ibeaconid not in", values, "ibeaconid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidBetween(String value1, String value2) {
            addCriterion("ibeaconid between", value1, value2, "ibeaconid");
            return (Criteria) this;
        }

        public Criteria andIbeaconidNotBetween(String value1, String value2) {
            addCriterion("ibeaconid not between", value1, value2, "ibeaconid");
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