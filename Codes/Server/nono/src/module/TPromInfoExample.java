package module;

import java.util.ArrayList;
import java.util.List;

public class TPromInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPromInfoExample() {
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andAdimageIsNull() {
            addCriterion("adimage is null");
            return (Criteria) this;
        }

        public Criteria andAdimageIsNotNull() {
            addCriterion("adimage is not null");
            return (Criteria) this;
        }

        public Criteria andAdimageEqualTo(String value) {
            addCriterion("adimage =", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageNotEqualTo(String value) {
            addCriterion("adimage <>", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageGreaterThan(String value) {
            addCriterion("adimage >", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageGreaterThanOrEqualTo(String value) {
            addCriterion("adimage >=", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageLessThan(String value) {
            addCriterion("adimage <", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageLessThanOrEqualTo(String value) {
            addCriterion("adimage <=", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageLike(String value) {
            addCriterion("adimage like", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageNotLike(String value) {
            addCriterion("adimage not like", value, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageIn(List<String> values) {
            addCriterion("adimage in", values, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageNotIn(List<String> values) {
            addCriterion("adimage not in", values, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageBetween(String value1, String value2) {
            addCriterion("adimage between", value1, value2, "adimage");
            return (Criteria) this;
        }

        public Criteria andAdimageNotBetween(String value1, String value2) {
            addCriterion("adimage not between", value1, value2, "adimage");
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