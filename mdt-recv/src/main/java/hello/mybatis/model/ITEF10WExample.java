package hello.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ITEF10WExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ITEF10WExample() {
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

        public Criteria andNcellSeqIsNull() {
            addCriterion("NCELL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andNcellSeqIsNotNull() {
            addCriterion("NCELL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andNcellSeqEqualTo(BigDecimal value) {
            addCriterion("NCELL_SEQ =", value, "ncellSeq");
            return (Criteria) this;
        }

        public Criteria andNcellSeqNotEqualTo(BigDecimal value) {
            addCriterion("NCELL_SEQ <>", value, "ncellSeq");
            return (Criteria) this;
        }

        public Criteria andNcellSeqGreaterThan(BigDecimal value) {
            addCriterion("NCELL_SEQ >", value, "ncellSeq");
            return (Criteria) this;
        }

        public Criteria andNcellSeqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NCELL_SEQ >=", value, "ncellSeq");
            return (Criteria) this;
        }

        public Criteria andNcellSeqLessThan(BigDecimal value) {
            addCriterion("NCELL_SEQ <", value, "ncellSeq");
            return (Criteria) this;
        }

        public Criteria andNcellSeqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NCELL_SEQ <=", value, "ncellSeq");
            return (Criteria) this;
        }

        public Criteria andNcellSeqIn(List<BigDecimal> values) {
            addCriterion("NCELL_SEQ in", values, "ncellSeq");
            return (Criteria) this;
        }

        public Criteria andNcellSeqNotIn(List<BigDecimal> values) {
            addCriterion("NCELL_SEQ not in", values, "ncellSeq");
            return (Criteria) this;
        }

        public Criteria andNcellSeqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NCELL_SEQ between", value1, value2, "ncellSeq");
            return (Criteria) this;
        }

        public Criteria andNcellSeqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NCELL_SEQ not between", value1, value2, "ncellSeq");
            return (Criteria) this;
        }

        public Criteria andNcellIdIsNull() {
            addCriterion("NCELL_ID is null");
            return (Criteria) this;
        }

        public Criteria andNcellIdIsNotNull() {
            addCriterion("NCELL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNcellIdEqualTo(BigDecimal value) {
            addCriterion("NCELL_ID =", value, "ncellId");
            return (Criteria) this;
        }

        public Criteria andNcellIdNotEqualTo(BigDecimal value) {
            addCriterion("NCELL_ID <>", value, "ncellId");
            return (Criteria) this;
        }

        public Criteria andNcellIdGreaterThan(BigDecimal value) {
            addCriterion("NCELL_ID >", value, "ncellId");
            return (Criteria) this;
        }

        public Criteria andNcellIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NCELL_ID >=", value, "ncellId");
            return (Criteria) this;
        }

        public Criteria andNcellIdLessThan(BigDecimal value) {
            addCriterion("NCELL_ID <", value, "ncellId");
            return (Criteria) this;
        }

        public Criteria andNcellIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NCELL_ID <=", value, "ncellId");
            return (Criteria) this;
        }

        public Criteria andNcellIdIn(List<BigDecimal> values) {
            addCriterion("NCELL_ID in", values, "ncellId");
            return (Criteria) this;
        }

        public Criteria andNcellIdNotIn(List<BigDecimal> values) {
            addCriterion("NCELL_ID not in", values, "ncellId");
            return (Criteria) this;
        }

        public Criteria andNcellIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NCELL_ID between", value1, value2, "ncellId");
            return (Criteria) this;
        }

        public Criteria andNcellIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NCELL_ID not between", value1, value2, "ncellId");
            return (Criteria) this;
        }

        public Criteria andPciValIsNull() {
            addCriterion("PCI_VAL is null");
            return (Criteria) this;
        }

        public Criteria andPciValIsNotNull() {
            addCriterion("PCI_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andPciValEqualTo(BigDecimal value) {
            addCriterion("PCI_VAL =", value, "pciVal");
            return (Criteria) this;
        }

        public Criteria andPciValNotEqualTo(BigDecimal value) {
            addCriterion("PCI_VAL <>", value, "pciVal");
            return (Criteria) this;
        }

        public Criteria andPciValGreaterThan(BigDecimal value) {
            addCriterion("PCI_VAL >", value, "pciVal");
            return (Criteria) this;
        }

        public Criteria andPciValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PCI_VAL >=", value, "pciVal");
            return (Criteria) this;
        }

        public Criteria andPciValLessThan(BigDecimal value) {
            addCriterion("PCI_VAL <", value, "pciVal");
            return (Criteria) this;
        }

        public Criteria andPciValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PCI_VAL <=", value, "pciVal");
            return (Criteria) this;
        }

        public Criteria andPciValIn(List<BigDecimal> values) {
            addCriterion("PCI_VAL in", values, "pciVal");
            return (Criteria) this;
        }

        public Criteria andPciValNotIn(List<BigDecimal> values) {
            addCriterion("PCI_VAL not in", values, "pciVal");
            return (Criteria) this;
        }

        public Criteria andPciValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCI_VAL between", value1, value2, "pciVal");
            return (Criteria) this;
        }

        public Criteria andPciValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCI_VAL not between", value1, value2, "pciVal");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValIsNull() {
            addCriterion("CARR_FREQ_VAL is null");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValIsNotNull() {
            addCriterion("CARR_FREQ_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValEqualTo(BigDecimal value) {
            addCriterion("CARR_FREQ_VAL =", value, "carrFreqVal");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValNotEqualTo(BigDecimal value) {
            addCriterion("CARR_FREQ_VAL <>", value, "carrFreqVal");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValGreaterThan(BigDecimal value) {
            addCriterion("CARR_FREQ_VAL >", value, "carrFreqVal");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARR_FREQ_VAL >=", value, "carrFreqVal");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValLessThan(BigDecimal value) {
            addCriterion("CARR_FREQ_VAL <", value, "carrFreqVal");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARR_FREQ_VAL <=", value, "carrFreqVal");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValIn(List<BigDecimal> values) {
            addCriterion("CARR_FREQ_VAL in", values, "carrFreqVal");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValNotIn(List<BigDecimal> values) {
            addCriterion("CARR_FREQ_VAL not in", values, "carrFreqVal");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARR_FREQ_VAL between", value1, value2, "carrFreqVal");
            return (Criteria) this;
        }

        public Criteria andCarrFreqValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARR_FREQ_VAL not between", value1, value2, "carrFreqVal");
            return (Criteria) this;
        }

        public Criteria andRsrpValIsNull() {
            addCriterion("RSRP_VAL is null");
            return (Criteria) this;
        }

        public Criteria andRsrpValIsNotNull() {
            addCriterion("RSRP_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andRsrpValEqualTo(BigDecimal value) {
            addCriterion("RSRP_VAL =", value, "rsrpVal");
            return (Criteria) this;
        }

        public Criteria andRsrpValNotEqualTo(BigDecimal value) {
            addCriterion("RSRP_VAL <>", value, "rsrpVal");
            return (Criteria) this;
        }

        public Criteria andRsrpValGreaterThan(BigDecimal value) {
            addCriterion("RSRP_VAL >", value, "rsrpVal");
            return (Criteria) this;
        }

        public Criteria andRsrpValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RSRP_VAL >=", value, "rsrpVal");
            return (Criteria) this;
        }

        public Criteria andRsrpValLessThan(BigDecimal value) {
            addCriterion("RSRP_VAL <", value, "rsrpVal");
            return (Criteria) this;
        }

        public Criteria andRsrpValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RSRP_VAL <=", value, "rsrpVal");
            return (Criteria) this;
        }

        public Criteria andRsrpValIn(List<BigDecimal> values) {
            addCriterion("RSRP_VAL in", values, "rsrpVal");
            return (Criteria) this;
        }

        public Criteria andRsrpValNotIn(List<BigDecimal> values) {
            addCriterion("RSRP_VAL not in", values, "rsrpVal");
            return (Criteria) this;
        }

        public Criteria andRsrpValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSRP_VAL between", value1, value2, "rsrpVal");
            return (Criteria) this;
        }

        public Criteria andRsrpValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSRP_VAL not between", value1, value2, "rsrpVal");
            return (Criteria) this;
        }

        public Criteria andRsrqValIsNull() {
            addCriterion("RSRQ_VAL is null");
            return (Criteria) this;
        }

        public Criteria andRsrqValIsNotNull() {
            addCriterion("RSRQ_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andRsrqValEqualTo(BigDecimal value) {
            addCriterion("RSRQ_VAL =", value, "rsrqVal");
            return (Criteria) this;
        }

        public Criteria andRsrqValNotEqualTo(BigDecimal value) {
            addCriterion("RSRQ_VAL <>", value, "rsrqVal");
            return (Criteria) this;
        }

        public Criteria andRsrqValGreaterThan(BigDecimal value) {
            addCriterion("RSRQ_VAL >", value, "rsrqVal");
            return (Criteria) this;
        }

        public Criteria andRsrqValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RSRQ_VAL >=", value, "rsrqVal");
            return (Criteria) this;
        }

        public Criteria andRsrqValLessThan(BigDecimal value) {
            addCriterion("RSRQ_VAL <", value, "rsrqVal");
            return (Criteria) this;
        }

        public Criteria andRsrqValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RSRQ_VAL <=", value, "rsrqVal");
            return (Criteria) this;
        }

        public Criteria andRsrqValIn(List<BigDecimal> values) {
            addCriterion("RSRQ_VAL in", values, "rsrqVal");
            return (Criteria) this;
        }

        public Criteria andRsrqValNotIn(List<BigDecimal> values) {
            addCriterion("RSRQ_VAL not in", values, "rsrqVal");
            return (Criteria) this;
        }

        public Criteria andRsrqValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSRQ_VAL between", value1, value2, "rsrqVal");
            return (Criteria) this;
        }

        public Criteria andRsrqValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RSRQ_VAL not between", value1, value2, "rsrqVal");
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