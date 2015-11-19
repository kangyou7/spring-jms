package hello.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LOGD20WExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LOGD20WExample() {
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

        public Criteria andWorkDayIsNull() {
            addCriterion("WORK_DAY is null");
            return (Criteria) this;
        }

        public Criteria andWorkDayIsNotNull() {
            addCriterion("WORK_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDayEqualTo(String value) {
            addCriterion("WORK_DAY =", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayNotEqualTo(String value) {
            addCriterion("WORK_DAY <>", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayGreaterThan(String value) {
            addCriterion("WORK_DAY >", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_DAY >=", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayLessThan(String value) {
            addCriterion("WORK_DAY <", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayLessThanOrEqualTo(String value) {
            addCriterion("WORK_DAY <=", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayLike(String value) {
            addCriterion("WORK_DAY like", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayNotLike(String value) {
            addCriterion("WORK_DAY not like", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayIn(List<String> values) {
            addCriterion("WORK_DAY in", values, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayNotIn(List<String> values) {
            addCriterion("WORK_DAY not in", values, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayBetween(String value1, String value2) {
            addCriterion("WORK_DAY between", value1, value2, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayNotBetween(String value1, String value2) {
            addCriterion("WORK_DAY not between", value1, value2, "workDay");
            return (Criteria) this;
        }

        public Criteria andMdtIdIsNull() {
            addCriterion("MDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMdtIdIsNotNull() {
            addCriterion("MDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMdtIdEqualTo(String value) {
            addCriterion("MDT_ID =", value, "mdtId");
            return (Criteria) this;
        }

        public Criteria andMdtIdNotEqualTo(String value) {
            addCriterion("MDT_ID <>", value, "mdtId");
            return (Criteria) this;
        }

        public Criteria andMdtIdGreaterThan(String value) {
            addCriterion("MDT_ID >", value, "mdtId");
            return (Criteria) this;
        }

        public Criteria andMdtIdGreaterThanOrEqualTo(String value) {
            addCriterion("MDT_ID >=", value, "mdtId");
            return (Criteria) this;
        }

        public Criteria andMdtIdLessThan(String value) {
            addCriterion("MDT_ID <", value, "mdtId");
            return (Criteria) this;
        }

        public Criteria andMdtIdLessThanOrEqualTo(String value) {
            addCriterion("MDT_ID <=", value, "mdtId");
            return (Criteria) this;
        }

        public Criteria andMdtIdLike(String value) {
            addCriterion("MDT_ID like", value, "mdtId");
            return (Criteria) this;
        }

        public Criteria andMdtIdNotLike(String value) {
            addCriterion("MDT_ID not like", value, "mdtId");
            return (Criteria) this;
        }

        public Criteria andMdtIdIn(List<String> values) {
            addCriterion("MDT_ID in", values, "mdtId");
            return (Criteria) this;
        }

        public Criteria andMdtIdNotIn(List<String> values) {
            addCriterion("MDT_ID not in", values, "mdtId");
            return (Criteria) this;
        }

        public Criteria andMdtIdBetween(String value1, String value2) {
            addCriterion("MDT_ID between", value1, value2, "mdtId");
            return (Criteria) this;
        }

        public Criteria andMdtIdNotBetween(String value1, String value2) {
            addCriterion("MDT_ID not between", value1, value2, "mdtId");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqIsNull() {
            addCriterion("CARR_FREQ_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqIsNotNull() {
            addCriterion("CARR_FREQ_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqEqualTo(BigDecimal value) {
            addCriterion("CARR_FREQ_SEQ =", value, "carrFreqSeq");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqNotEqualTo(BigDecimal value) {
            addCriterion("CARR_FREQ_SEQ <>", value, "carrFreqSeq");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqGreaterThan(BigDecimal value) {
            addCriterion("CARR_FREQ_SEQ >", value, "carrFreqSeq");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARR_FREQ_SEQ >=", value, "carrFreqSeq");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqLessThan(BigDecimal value) {
            addCriterion("CARR_FREQ_SEQ <", value, "carrFreqSeq");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARR_FREQ_SEQ <=", value, "carrFreqSeq");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqIn(List<BigDecimal> values) {
            addCriterion("CARR_FREQ_SEQ in", values, "carrFreqSeq");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqNotIn(List<BigDecimal> values) {
            addCriterion("CARR_FREQ_SEQ not in", values, "carrFreqSeq");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARR_FREQ_SEQ between", value1, value2, "carrFreqSeq");
            return (Criteria) this;
        }

        public Criteria andCarrFreqSeqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARR_FREQ_SEQ not between", value1, value2, "carrFreqSeq");
            return (Criteria) this;
        }

        public Criteria andArfcnValIsNull() {
            addCriterion("ARFCN_VAL is null");
            return (Criteria) this;
        }

        public Criteria andArfcnValIsNotNull() {
            addCriterion("ARFCN_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andArfcnValEqualTo(BigDecimal value) {
            addCriterion("ARFCN_VAL =", value, "arfcnVal");
            return (Criteria) this;
        }

        public Criteria andArfcnValNotEqualTo(BigDecimal value) {
            addCriterion("ARFCN_VAL <>", value, "arfcnVal");
            return (Criteria) this;
        }

        public Criteria andArfcnValGreaterThan(BigDecimal value) {
            addCriterion("ARFCN_VAL >", value, "arfcnVal");
            return (Criteria) this;
        }

        public Criteria andArfcnValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ARFCN_VAL >=", value, "arfcnVal");
            return (Criteria) this;
        }

        public Criteria andArfcnValLessThan(BigDecimal value) {
            addCriterion("ARFCN_VAL <", value, "arfcnVal");
            return (Criteria) this;
        }

        public Criteria andArfcnValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ARFCN_VAL <=", value, "arfcnVal");
            return (Criteria) this;
        }

        public Criteria andArfcnValIn(List<BigDecimal> values) {
            addCriterion("ARFCN_VAL in", values, "arfcnVal");
            return (Criteria) this;
        }

        public Criteria andArfcnValNotIn(List<BigDecimal> values) {
            addCriterion("ARFCN_VAL not in", values, "arfcnVal");
            return (Criteria) this;
        }

        public Criteria andArfcnValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ARFCN_VAL between", value1, value2, "arfcnVal");
            return (Criteria) this;
        }

        public Criteria andArfcnValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ARFCN_VAL not between", value1, value2, "arfcnVal");
            return (Criteria) this;
        }

        public Criteria andNcellCntIsNull() {
            addCriterion("NCELL_CNT is null");
            return (Criteria) this;
        }

        public Criteria andNcellCntIsNotNull() {
            addCriterion("NCELL_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andNcellCntEqualTo(BigDecimal value) {
            addCriterion("NCELL_CNT =", value, "ncellCnt");
            return (Criteria) this;
        }

        public Criteria andNcellCntNotEqualTo(BigDecimal value) {
            addCriterion("NCELL_CNT <>", value, "ncellCnt");
            return (Criteria) this;
        }

        public Criteria andNcellCntGreaterThan(BigDecimal value) {
            addCriterion("NCELL_CNT >", value, "ncellCnt");
            return (Criteria) this;
        }

        public Criteria andNcellCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NCELL_CNT >=", value, "ncellCnt");
            return (Criteria) this;
        }

        public Criteria andNcellCntLessThan(BigDecimal value) {
            addCriterion("NCELL_CNT <", value, "ncellCnt");
            return (Criteria) this;
        }

        public Criteria andNcellCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NCELL_CNT <=", value, "ncellCnt");
            return (Criteria) this;
        }

        public Criteria andNcellCntIn(List<BigDecimal> values) {
            addCriterion("NCELL_CNT in", values, "ncellCnt");
            return (Criteria) this;
        }

        public Criteria andNcellCntNotIn(List<BigDecimal> values) {
            addCriterion("NCELL_CNT not in", values, "ncellCnt");
            return (Criteria) this;
        }

        public Criteria andNcellCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NCELL_CNT between", value1, value2, "ncellCnt");
            return (Criteria) this;
        }

        public Criteria andNcellCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NCELL_CNT not between", value1, value2, "ncellCnt");
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