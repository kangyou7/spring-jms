package hello.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RLFR01WExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RLFR01WExample() {
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

        public Criteria andEnbIdIsNull() {
            addCriterion("ENB_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnbIdIsNotNull() {
            addCriterion("ENB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnbIdEqualTo(String value) {
            addCriterion("ENB_ID =", value, "enbId");
            return (Criteria) this;
        }

        public Criteria andEnbIdNotEqualTo(String value) {
            addCriterion("ENB_ID <>", value, "enbId");
            return (Criteria) this;
        }

        public Criteria andEnbIdGreaterThan(String value) {
            addCriterion("ENB_ID >", value, "enbId");
            return (Criteria) this;
        }

        public Criteria andEnbIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENB_ID >=", value, "enbId");
            return (Criteria) this;
        }

        public Criteria andEnbIdLessThan(String value) {
            addCriterion("ENB_ID <", value, "enbId");
            return (Criteria) this;
        }

        public Criteria andEnbIdLessThanOrEqualTo(String value) {
            addCriterion("ENB_ID <=", value, "enbId");
            return (Criteria) this;
        }

        public Criteria andEnbIdLike(String value) {
            addCriterion("ENB_ID like", value, "enbId");
            return (Criteria) this;
        }

        public Criteria andEnbIdNotLike(String value) {
            addCriterion("ENB_ID not like", value, "enbId");
            return (Criteria) this;
        }

        public Criteria andEnbIdIn(List<String> values) {
            addCriterion("ENB_ID in", values, "enbId");
            return (Criteria) this;
        }

        public Criteria andEnbIdNotIn(List<String> values) {
            addCriterion("ENB_ID not in", values, "enbId");
            return (Criteria) this;
        }

        public Criteria andEnbIdBetween(String value1, String value2) {
            addCriterion("ENB_ID between", value1, value2, "enbId");
            return (Criteria) this;
        }

        public Criteria andEnbIdNotBetween(String value1, String value2) {
            addCriterion("ENB_ID not between", value1, value2, "enbId");
            return (Criteria) this;
        }

        public Criteria andCellIdIsNull() {
            addCriterion("CELL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCellIdIsNotNull() {
            addCriterion("CELL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCellIdEqualTo(String value) {
            addCriterion("CELL_ID =", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotEqualTo(String value) {
            addCriterion("CELL_ID <>", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdGreaterThan(String value) {
            addCriterion("CELL_ID >", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdGreaterThanOrEqualTo(String value) {
            addCriterion("CELL_ID >=", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdLessThan(String value) {
            addCriterion("CELL_ID <", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdLessThanOrEqualTo(String value) {
            addCriterion("CELL_ID <=", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdLike(String value) {
            addCriterion("CELL_ID like", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotLike(String value) {
            addCriterion("CELL_ID not like", value, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdIn(List<String> values) {
            addCriterion("CELL_ID in", values, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotIn(List<String> values) {
            addCriterion("CELL_ID not in", values, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdBetween(String value1, String value2) {
            addCriterion("CELL_ID between", value1, value2, "cellId");
            return (Criteria) this;
        }

        public Criteria andCellIdNotBetween(String value1, String value2) {
            addCriterion("CELL_ID not between", value1, value2, "cellId");
            return (Criteria) this;
        }

        public Criteria andCalIdIsNull() {
            addCriterion("CAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCalIdIsNotNull() {
            addCriterion("CAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCalIdEqualTo(String value) {
            addCriterion("CAL_ID =", value, "calId");
            return (Criteria) this;
        }

        public Criteria andCalIdNotEqualTo(String value) {
            addCriterion("CAL_ID <>", value, "calId");
            return (Criteria) this;
        }

        public Criteria andCalIdGreaterThan(String value) {
            addCriterion("CAL_ID >", value, "calId");
            return (Criteria) this;
        }

        public Criteria andCalIdGreaterThanOrEqualTo(String value) {
            addCriterion("CAL_ID >=", value, "calId");
            return (Criteria) this;
        }

        public Criteria andCalIdLessThan(String value) {
            addCriterion("CAL_ID <", value, "calId");
            return (Criteria) this;
        }

        public Criteria andCalIdLessThanOrEqualTo(String value) {
            addCriterion("CAL_ID <=", value, "calId");
            return (Criteria) this;
        }

        public Criteria andCalIdLike(String value) {
            addCriterion("CAL_ID like", value, "calId");
            return (Criteria) this;
        }

        public Criteria andCalIdNotLike(String value) {
            addCriterion("CAL_ID not like", value, "calId");
            return (Criteria) this;
        }

        public Criteria andCalIdIn(List<String> values) {
            addCriterion("CAL_ID in", values, "calId");
            return (Criteria) this;
        }

        public Criteria andCalIdNotIn(List<String> values) {
            addCriterion("CAL_ID not in", values, "calId");
            return (Criteria) this;
        }

        public Criteria andCalIdBetween(String value1, String value2) {
            addCriterion("CAL_ID between", value1, value2, "calId");
            return (Criteria) this;
        }

        public Criteria andCalIdNotBetween(String value1, String value2) {
            addCriterion("CAL_ID not between", value1, value2, "calId");
            return (Criteria) this;
        }

        public Criteria andMeasTmstIsNull() {
            addCriterion("MEAS_TMST is null");
            return (Criteria) this;
        }

        public Criteria andMeasTmstIsNotNull() {
            addCriterion("MEAS_TMST is not null");
            return (Criteria) this;
        }

        public Criteria andMeasTmstEqualTo(String value) {
            addCriterion("MEAS_TMST =", value, "measTmst");
            return (Criteria) this;
        }

        public Criteria andMeasTmstNotEqualTo(String value) {
            addCriterion("MEAS_TMST <>", value, "measTmst");
            return (Criteria) this;
        }

        public Criteria andMeasTmstGreaterThan(String value) {
            addCriterion("MEAS_TMST >", value, "measTmst");
            return (Criteria) this;
        }

        public Criteria andMeasTmstGreaterThanOrEqualTo(String value) {
            addCriterion("MEAS_TMST >=", value, "measTmst");
            return (Criteria) this;
        }

        public Criteria andMeasTmstLessThan(String value) {
            addCriterion("MEAS_TMST <", value, "measTmst");
            return (Criteria) this;
        }

        public Criteria andMeasTmstLessThanOrEqualTo(String value) {
            addCriterion("MEAS_TMST <=", value, "measTmst");
            return (Criteria) this;
        }

        public Criteria andMeasTmstLike(String value) {
            addCriterion("MEAS_TMST like", value, "measTmst");
            return (Criteria) this;
        }

        public Criteria andMeasTmstNotLike(String value) {
            addCriterion("MEAS_TMST not like", value, "measTmst");
            return (Criteria) this;
        }

        public Criteria andMeasTmstIn(List<String> values) {
            addCriterion("MEAS_TMST in", values, "measTmst");
            return (Criteria) this;
        }

        public Criteria andMeasTmstNotIn(List<String> values) {
            addCriterion("MEAS_TMST not in", values, "measTmst");
            return (Criteria) this;
        }

        public Criteria andMeasTmstBetween(String value1, String value2) {
            addCriterion("MEAS_TMST between", value1, value2, "measTmst");
            return (Criteria) this;
        }

        public Criteria andMeasTmstNotBetween(String value1, String value2) {
            addCriterion("MEAS_TMST not between", value1, value2, "measTmst");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValIsNull() {
            addCriterion("SCELL_RSRP_VAL is null");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValIsNotNull() {
            addCriterion("SCELL_RSRP_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValEqualTo(BigDecimal value) {
            addCriterion("SCELL_RSRP_VAL =", value, "scellRsrpVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValNotEqualTo(BigDecimal value) {
            addCriterion("SCELL_RSRP_VAL <>", value, "scellRsrpVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValGreaterThan(BigDecimal value) {
            addCriterion("SCELL_RSRP_VAL >", value, "scellRsrpVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCELL_RSRP_VAL >=", value, "scellRsrpVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValLessThan(BigDecimal value) {
            addCriterion("SCELL_RSRP_VAL <", value, "scellRsrpVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCELL_RSRP_VAL <=", value, "scellRsrpVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValIn(List<BigDecimal> values) {
            addCriterion("SCELL_RSRP_VAL in", values, "scellRsrpVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValNotIn(List<BigDecimal> values) {
            addCriterion("SCELL_RSRP_VAL not in", values, "scellRsrpVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCELL_RSRP_VAL between", value1, value2, "scellRsrpVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrpValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCELL_RSRP_VAL not between", value1, value2, "scellRsrpVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValIsNull() {
            addCriterion("SCELL_RSRQ_VAL is null");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValIsNotNull() {
            addCriterion("SCELL_RSRQ_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValEqualTo(BigDecimal value) {
            addCriterion("SCELL_RSRQ_VAL =", value, "scellRsrqVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValNotEqualTo(BigDecimal value) {
            addCriterion("SCELL_RSRQ_VAL <>", value, "scellRsrqVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValGreaterThan(BigDecimal value) {
            addCriterion("SCELL_RSRQ_VAL >", value, "scellRsrqVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCELL_RSRQ_VAL >=", value, "scellRsrqVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValLessThan(BigDecimal value) {
            addCriterion("SCELL_RSRQ_VAL <", value, "scellRsrqVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCELL_RSRQ_VAL <=", value, "scellRsrqVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValIn(List<BigDecimal> values) {
            addCriterion("SCELL_RSRQ_VAL in", values, "scellRsrqVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValNotIn(List<BigDecimal> values) {
            addCriterion("SCELL_RSRQ_VAL not in", values, "scellRsrqVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCELL_RSRQ_VAL between", value1, value2, "scellRsrqVal");
            return (Criteria) this;
        }

        public Criteria andScellRsrqValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCELL_RSRQ_VAL not between", value1, value2, "scellRsrqVal");
            return (Criteria) this;
        }

        public Criteria andCellTpValIsNull() {
            addCriterion("CELL_TP_VAL is null");
            return (Criteria) this;
        }

        public Criteria andCellTpValIsNotNull() {
            addCriterion("CELL_TP_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andCellTpValEqualTo(BigDecimal value) {
            addCriterion("CELL_TP_VAL =", value, "cellTpVal");
            return (Criteria) this;
        }

        public Criteria andCellTpValNotEqualTo(BigDecimal value) {
            addCriterion("CELL_TP_VAL <>", value, "cellTpVal");
            return (Criteria) this;
        }

        public Criteria andCellTpValGreaterThan(BigDecimal value) {
            addCriterion("CELL_TP_VAL >", value, "cellTpVal");
            return (Criteria) this;
        }

        public Criteria andCellTpValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CELL_TP_VAL >=", value, "cellTpVal");
            return (Criteria) this;
        }

        public Criteria andCellTpValLessThan(BigDecimal value) {
            addCriterion("CELL_TP_VAL <", value, "cellTpVal");
            return (Criteria) this;
        }

        public Criteria andCellTpValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CELL_TP_VAL <=", value, "cellTpVal");
            return (Criteria) this;
        }

        public Criteria andCellTpValIn(List<BigDecimal> values) {
            addCriterion("CELL_TP_VAL in", values, "cellTpVal");
            return (Criteria) this;
        }

        public Criteria andCellTpValNotIn(List<BigDecimal> values) {
            addCriterion("CELL_TP_VAL not in", values, "cellTpVal");
            return (Criteria) this;
        }

        public Criteria andCellTpValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CELL_TP_VAL between", value1, value2, "cellTpVal");
            return (Criteria) this;
        }

        public Criteria andCellTpValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CELL_TP_VAL not between", value1, value2, "cellTpVal");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdIsNull() {
            addCriterion("GLBAL_CELL_PLMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdIsNotNull() {
            addCriterion("GLBAL_CELL_PLMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdEqualTo(String value) {
            addCriterion("GLBAL_CELL_PLMN_ID =", value, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdNotEqualTo(String value) {
            addCriterion("GLBAL_CELL_PLMN_ID <>", value, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdGreaterThan(String value) {
            addCriterion("GLBAL_CELL_PLMN_ID >", value, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdGreaterThanOrEqualTo(String value) {
            addCriterion("GLBAL_CELL_PLMN_ID >=", value, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdLessThan(String value) {
            addCriterion("GLBAL_CELL_PLMN_ID <", value, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdLessThanOrEqualTo(String value) {
            addCriterion("GLBAL_CELL_PLMN_ID <=", value, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdLike(String value) {
            addCriterion("GLBAL_CELL_PLMN_ID like", value, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdNotLike(String value) {
            addCriterion("GLBAL_CELL_PLMN_ID not like", value, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdIn(List<String> values) {
            addCriterion("GLBAL_CELL_PLMN_ID in", values, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdNotIn(List<String> values) {
            addCriterion("GLBAL_CELL_PLMN_ID not in", values, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdBetween(String value1, String value2) {
            addCriterion("GLBAL_CELL_PLMN_ID between", value1, value2, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellPlmnIdNotBetween(String value1, String value2) {
            addCriterion("GLBAL_CELL_PLMN_ID not between", value1, value2, "glbalCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdIsNull() {
            addCriterion("GLBAL_CELL_ID is null");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdIsNotNull() {
            addCriterion("GLBAL_CELL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdEqualTo(BigDecimal value) {
            addCriterion("GLBAL_CELL_ID =", value, "glbalCellId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdNotEqualTo(BigDecimal value) {
            addCriterion("GLBAL_CELL_ID <>", value, "glbalCellId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdGreaterThan(BigDecimal value) {
            addCriterion("GLBAL_CELL_ID >", value, "glbalCellId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLBAL_CELL_ID >=", value, "glbalCellId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdLessThan(BigDecimal value) {
            addCriterion("GLBAL_CELL_ID <", value, "glbalCellId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLBAL_CELL_ID <=", value, "glbalCellId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdIn(List<BigDecimal> values) {
            addCriterion("GLBAL_CELL_ID in", values, "glbalCellId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdNotIn(List<BigDecimal> values) {
            addCriterion("GLBAL_CELL_ID not in", values, "glbalCellId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLBAL_CELL_ID between", value1, value2, "glbalCellId");
            return (Criteria) this;
        }

        public Criteria andGlbalCellIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLBAL_CELL_ID not between", value1, value2, "glbalCellId");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValIsNull() {
            addCriterion("PCI_ARFCN_PCI_VAL is null");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValIsNotNull() {
            addCriterion("PCI_ARFCN_PCI_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValEqualTo(BigDecimal value) {
            addCriterion("PCI_ARFCN_PCI_VAL =", value, "pciArfcnPciVal");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValNotEqualTo(BigDecimal value) {
            addCriterion("PCI_ARFCN_PCI_VAL <>", value, "pciArfcnPciVal");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValGreaterThan(BigDecimal value) {
            addCriterion("PCI_ARFCN_PCI_VAL >", value, "pciArfcnPciVal");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PCI_ARFCN_PCI_VAL >=", value, "pciArfcnPciVal");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValLessThan(BigDecimal value) {
            addCriterion("PCI_ARFCN_PCI_VAL <", value, "pciArfcnPciVal");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PCI_ARFCN_PCI_VAL <=", value, "pciArfcnPciVal");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValIn(List<BigDecimal> values) {
            addCriterion("PCI_ARFCN_PCI_VAL in", values, "pciArfcnPciVal");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValNotIn(List<BigDecimal> values) {
            addCriterion("PCI_ARFCN_PCI_VAL not in", values, "pciArfcnPciVal");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCI_ARFCN_PCI_VAL between", value1, value2, "pciArfcnPciVal");
            return (Criteria) this;
        }

        public Criteria andPciArfcnPciValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCI_ARFCN_PCI_VAL not between", value1, value2, "pciArfcnPciVal");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntIsNull() {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT is null");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntIsNotNull() {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntEqualTo(BigDecimal value) {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT =", value, "pciArfcnCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntNotEqualTo(BigDecimal value) {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT <>", value, "pciArfcnCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntGreaterThan(BigDecimal value) {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT >", value, "pciArfcnCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT >=", value, "pciArfcnCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntLessThan(BigDecimal value) {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT <", value, "pciArfcnCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT <=", value, "pciArfcnCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntIn(List<BigDecimal> values) {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT in", values, "pciArfcnCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntNotIn(List<BigDecimal> values) {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT not in", values, "pciArfcnCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT between", value1, value2, "pciArfcnCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andPciArfcnCarrFreqCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCI_ARFCN_CARR_FREQ_CNT not between", value1, value2, "pciArfcnCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdIsNull() {
            addCriterion("REEST_CELL_PLMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdIsNotNull() {
            addCriterion("REEST_CELL_PLMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdEqualTo(String value) {
            addCriterion("REEST_CELL_PLMN_ID =", value, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdNotEqualTo(String value) {
            addCriterion("REEST_CELL_PLMN_ID <>", value, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdGreaterThan(String value) {
            addCriterion("REEST_CELL_PLMN_ID >", value, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdGreaterThanOrEqualTo(String value) {
            addCriterion("REEST_CELL_PLMN_ID >=", value, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdLessThan(String value) {
            addCriterion("REEST_CELL_PLMN_ID <", value, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdLessThanOrEqualTo(String value) {
            addCriterion("REEST_CELL_PLMN_ID <=", value, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdLike(String value) {
            addCriterion("REEST_CELL_PLMN_ID like", value, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdNotLike(String value) {
            addCriterion("REEST_CELL_PLMN_ID not like", value, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdIn(List<String> values) {
            addCriterion("REEST_CELL_PLMN_ID in", values, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdNotIn(List<String> values) {
            addCriterion("REEST_CELL_PLMN_ID not in", values, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdBetween(String value1, String value2) {
            addCriterion("REEST_CELL_PLMN_ID between", value1, value2, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellPlmnIdNotBetween(String value1, String value2) {
            addCriterion("REEST_CELL_PLMN_ID not between", value1, value2, "reestCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andReestCellIdIsNull() {
            addCriterion("REEST_CELL_ID is null");
            return (Criteria) this;
        }

        public Criteria andReestCellIdIsNotNull() {
            addCriterion("REEST_CELL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReestCellIdEqualTo(BigDecimal value) {
            addCriterion("REEST_CELL_ID =", value, "reestCellId");
            return (Criteria) this;
        }

        public Criteria andReestCellIdNotEqualTo(BigDecimal value) {
            addCriterion("REEST_CELL_ID <>", value, "reestCellId");
            return (Criteria) this;
        }

        public Criteria andReestCellIdGreaterThan(BigDecimal value) {
            addCriterion("REEST_CELL_ID >", value, "reestCellId");
            return (Criteria) this;
        }

        public Criteria andReestCellIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REEST_CELL_ID >=", value, "reestCellId");
            return (Criteria) this;
        }

        public Criteria andReestCellIdLessThan(BigDecimal value) {
            addCriterion("REEST_CELL_ID <", value, "reestCellId");
            return (Criteria) this;
        }

        public Criteria andReestCellIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REEST_CELL_ID <=", value, "reestCellId");
            return (Criteria) this;
        }

        public Criteria andReestCellIdIn(List<BigDecimal> values) {
            addCriterion("REEST_CELL_ID in", values, "reestCellId");
            return (Criteria) this;
        }

        public Criteria andReestCellIdNotIn(List<BigDecimal> values) {
            addCriterion("REEST_CELL_ID not in", values, "reestCellId");
            return (Criteria) this;
        }

        public Criteria andReestCellIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REEST_CELL_ID between", value1, value2, "reestCellId");
            return (Criteria) this;
        }

        public Criteria andReestCellIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REEST_CELL_ID not between", value1, value2, "reestCellId");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValIsNull() {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL is null");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValIsNotNull() {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValEqualTo(BigDecimal value) {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL =", value, "connFailMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValNotEqualTo(BigDecimal value) {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL <>", value, "connFailMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValGreaterThan(BigDecimal value) {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL >", value, "connFailMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL >=", value, "connFailMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValLessThan(BigDecimal value) {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL <", value, "connFailMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL <=", value, "connFailMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValIn(List<BigDecimal> values) {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL in", values, "connFailMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValNotIn(List<BigDecimal> values) {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL not in", values, "connFailMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL between", value1, value2, "connFailMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andConnFailMeasTimeValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONN_FAIL_MEAS_TIME_VAL not between", value1, value2, "connFailMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValIsNull() {
            addCriterion("CONN_FAIL_TP_VAL is null");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValIsNotNull() {
            addCriterion("CONN_FAIL_TP_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValEqualTo(BigDecimal value) {
            addCriterion("CONN_FAIL_TP_VAL =", value, "connFailTpVal");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValNotEqualTo(BigDecimal value) {
            addCriterion("CONN_FAIL_TP_VAL <>", value, "connFailTpVal");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValGreaterThan(BigDecimal value) {
            addCriterion("CONN_FAIL_TP_VAL >", value, "connFailTpVal");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONN_FAIL_TP_VAL >=", value, "connFailTpVal");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValLessThan(BigDecimal value) {
            addCriterion("CONN_FAIL_TP_VAL <", value, "connFailTpVal");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONN_FAIL_TP_VAL <=", value, "connFailTpVal");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValIn(List<BigDecimal> values) {
            addCriterion("CONN_FAIL_TP_VAL in", values, "connFailTpVal");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValNotIn(List<BigDecimal> values) {
            addCriterion("CONN_FAIL_TP_VAL not in", values, "connFailTpVal");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONN_FAIL_TP_VAL between", value1, value2, "connFailTpVal");
            return (Criteria) this;
        }

        public Criteria andConnFailTpValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONN_FAIL_TP_VAL not between", value1, value2, "connFailTpVal");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdIsNull() {
            addCriterion("BEF_CELL_PLMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdIsNotNull() {
            addCriterion("BEF_CELL_PLMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdEqualTo(String value) {
            addCriterion("BEF_CELL_PLMN_ID =", value, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdNotEqualTo(String value) {
            addCriterion("BEF_CELL_PLMN_ID <>", value, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdGreaterThan(String value) {
            addCriterion("BEF_CELL_PLMN_ID >", value, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdGreaterThanOrEqualTo(String value) {
            addCriterion("BEF_CELL_PLMN_ID >=", value, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdLessThan(String value) {
            addCriterion("BEF_CELL_PLMN_ID <", value, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdLessThanOrEqualTo(String value) {
            addCriterion("BEF_CELL_PLMN_ID <=", value, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdLike(String value) {
            addCriterion("BEF_CELL_PLMN_ID like", value, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdNotLike(String value) {
            addCriterion("BEF_CELL_PLMN_ID not like", value, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdIn(List<String> values) {
            addCriterion("BEF_CELL_PLMN_ID in", values, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdNotIn(List<String> values) {
            addCriterion("BEF_CELL_PLMN_ID not in", values, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdBetween(String value1, String value2) {
            addCriterion("BEF_CELL_PLMN_ID between", value1, value2, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellPlmnIdNotBetween(String value1, String value2) {
            addCriterion("BEF_CELL_PLMN_ID not between", value1, value2, "befCellPlmnId");
            return (Criteria) this;
        }

        public Criteria andBefCellIdIsNull() {
            addCriterion("BEF_CELL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBefCellIdIsNotNull() {
            addCriterion("BEF_CELL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBefCellIdEqualTo(BigDecimal value) {
            addCriterion("BEF_CELL_ID =", value, "befCellId");
            return (Criteria) this;
        }

        public Criteria andBefCellIdNotEqualTo(BigDecimal value) {
            addCriterion("BEF_CELL_ID <>", value, "befCellId");
            return (Criteria) this;
        }

        public Criteria andBefCellIdGreaterThan(BigDecimal value) {
            addCriterion("BEF_CELL_ID >", value, "befCellId");
            return (Criteria) this;
        }

        public Criteria andBefCellIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BEF_CELL_ID >=", value, "befCellId");
            return (Criteria) this;
        }

        public Criteria andBefCellIdLessThan(BigDecimal value) {
            addCriterion("BEF_CELL_ID <", value, "befCellId");
            return (Criteria) this;
        }

        public Criteria andBefCellIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BEF_CELL_ID <=", value, "befCellId");
            return (Criteria) this;
        }

        public Criteria andBefCellIdIn(List<BigDecimal> values) {
            addCriterion("BEF_CELL_ID in", values, "befCellId");
            return (Criteria) this;
        }

        public Criteria andBefCellIdNotIn(List<BigDecimal> values) {
            addCriterion("BEF_CELL_ID not in", values, "befCellId");
            return (Criteria) this;
        }

        public Criteria andBefCellIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEF_CELL_ID between", value1, value2, "befCellId");
            return (Criteria) this;
        }

        public Criteria andBefCellIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEF_CELL_ID not between", value1, value2, "befCellId");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValIsNull() {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL is null");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValIsNotNull() {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValEqualTo(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL =", value, "eutranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValNotEqualTo(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL <>", value, "eutranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValGreaterThan(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL >", value, "eutranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL >=", value, "eutranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValLessThan(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL <", value, "eutranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL <=", value, "eutranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValIn(List<BigDecimal> values) {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL in", values, "eutranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValNotIn(List<BigDecimal> values) {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL not in", values, "eutranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL between", value1, value2, "eutranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andEutranNcellVldFlagValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EUTRAN_NCELL_VLD_FLAG_VAL not between", value1, value2, "eutranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntIsNull() {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT is null");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntIsNotNull() {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntEqualTo(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT =", value, "eutranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntNotEqualTo(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT <>", value, "eutranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntGreaterThan(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT >", value, "eutranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT >=", value, "eutranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntLessThan(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT <", value, "eutranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT <=", value, "eutranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntIn(List<BigDecimal> values) {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT in", values, "eutranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntNotIn(List<BigDecimal> values) {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT not in", values, "eutranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT between", value1, value2, "eutranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andEutranNcellCarrFreqCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EUTRAN_NCELL_CARR_FREQ_CNT not between", value1, value2, "eutranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValIsNull() {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL is null");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValIsNotNull() {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValEqualTo(BigDecimal value) {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL =", value, "utranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValNotEqualTo(BigDecimal value) {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL <>", value, "utranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValGreaterThan(BigDecimal value) {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL >", value, "utranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL >=", value, "utranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValLessThan(BigDecimal value) {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL <", value, "utranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL <=", value, "utranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValIn(List<BigDecimal> values) {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL in", values, "utranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValNotIn(List<BigDecimal> values) {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL not in", values, "utranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL between", value1, value2, "utranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andUtranNcellVldFlagValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UTRAN_NCELL_VLD_FLAG_VAL not between", value1, value2, "utranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntIsNull() {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT is null");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntIsNotNull() {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntEqualTo(BigDecimal value) {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT =", value, "utranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntNotEqualTo(BigDecimal value) {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT <>", value, "utranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntGreaterThan(BigDecimal value) {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT >", value, "utranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT >=", value, "utranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntLessThan(BigDecimal value) {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT <", value, "utranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT <=", value, "utranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntIn(List<BigDecimal> values) {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT in", values, "utranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntNotIn(List<BigDecimal> values) {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT not in", values, "utranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT between", value1, value2, "utranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andUtranNcellCarrFreqCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UTRAN_NCELL_CARR_FREQ_CNT not between", value1, value2, "utranNcellCarrFreqCnt");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValIsNull() {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL is null");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValIsNotNull() {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValEqualTo(BigDecimal value) {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL =", value, "geranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValNotEqualTo(BigDecimal value) {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL <>", value, "geranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValGreaterThan(BigDecimal value) {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL >", value, "geranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL >=", value, "geranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValLessThan(BigDecimal value) {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL <", value, "geranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL <=", value, "geranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValIn(List<BigDecimal> values) {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL in", values, "geranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValNotIn(List<BigDecimal> values) {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL not in", values, "geranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL between", value1, value2, "geranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andGeranNcellVldFlagValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GERAN_NCELL_VLD_FLAG_VAL not between", value1, value2, "geranNcellVldFlagVal");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntIsNull() {
            addCriterion("GERAN_NCELL_CNT is null");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntIsNotNull() {
            addCriterion("GERAN_NCELL_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntEqualTo(BigDecimal value) {
            addCriterion("GERAN_NCELL_CNT =", value, "geranNcellCnt");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntNotEqualTo(BigDecimal value) {
            addCriterion("GERAN_NCELL_CNT <>", value, "geranNcellCnt");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntGreaterThan(BigDecimal value) {
            addCriterion("GERAN_NCELL_CNT >", value, "geranNcellCnt");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GERAN_NCELL_CNT >=", value, "geranNcellCnt");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntLessThan(BigDecimal value) {
            addCriterion("GERAN_NCELL_CNT <", value, "geranNcellCnt");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GERAN_NCELL_CNT <=", value, "geranNcellCnt");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntIn(List<BigDecimal> values) {
            addCriterion("GERAN_NCELL_CNT in", values, "geranNcellCnt");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntNotIn(List<BigDecimal> values) {
            addCriterion("GERAN_NCELL_CNT not in", values, "geranNcellCnt");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GERAN_NCELL_CNT between", value1, value2, "geranNcellCnt");
            return (Criteria) this;
        }

        public Criteria andGeranNcellCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GERAN_NCELL_CNT not between", value1, value2, "geranNcellCnt");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnIsNull() {
            addCriterion("LOC_INFO_YN is null");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnIsNotNull() {
            addCriterion("LOC_INFO_YN is not null");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnEqualTo(String value) {
            addCriterion("LOC_INFO_YN =", value, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnNotEqualTo(String value) {
            addCriterion("LOC_INFO_YN <>", value, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnGreaterThan(String value) {
            addCriterion("LOC_INFO_YN >", value, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnGreaterThanOrEqualTo(String value) {
            addCriterion("LOC_INFO_YN >=", value, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnLessThan(String value) {
            addCriterion("LOC_INFO_YN <", value, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnLessThanOrEqualTo(String value) {
            addCriterion("LOC_INFO_YN <=", value, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnLike(String value) {
            addCriterion("LOC_INFO_YN like", value, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnNotLike(String value) {
            addCriterion("LOC_INFO_YN not like", value, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnIn(List<String> values) {
            addCriterion("LOC_INFO_YN in", values, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnNotIn(List<String> values) {
            addCriterion("LOC_INFO_YN not in", values, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnBetween(String value1, String value2) {
            addCriterion("LOC_INFO_YN between", value1, value2, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLocInfoYnNotBetween(String value1, String value2) {
            addCriterion("LOC_INFO_YN not between", value1, value2, "locInfoYn");
            return (Criteria) this;
        }

        public Criteria andLatSgnValIsNull() {
            addCriterion("LAT_SGN_VAL is null");
            return (Criteria) this;
        }

        public Criteria andLatSgnValIsNotNull() {
            addCriterion("LAT_SGN_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andLatSgnValEqualTo(BigDecimal value) {
            addCriterion("LAT_SGN_VAL =", value, "latSgnVal");
            return (Criteria) this;
        }

        public Criteria andLatSgnValNotEqualTo(BigDecimal value) {
            addCriterion("LAT_SGN_VAL <>", value, "latSgnVal");
            return (Criteria) this;
        }

        public Criteria andLatSgnValGreaterThan(BigDecimal value) {
            addCriterion("LAT_SGN_VAL >", value, "latSgnVal");
            return (Criteria) this;
        }

        public Criteria andLatSgnValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT_SGN_VAL >=", value, "latSgnVal");
            return (Criteria) this;
        }

        public Criteria andLatSgnValLessThan(BigDecimal value) {
            addCriterion("LAT_SGN_VAL <", value, "latSgnVal");
            return (Criteria) this;
        }

        public Criteria andLatSgnValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT_SGN_VAL <=", value, "latSgnVal");
            return (Criteria) this;
        }

        public Criteria andLatSgnValIn(List<BigDecimal> values) {
            addCriterion("LAT_SGN_VAL in", values, "latSgnVal");
            return (Criteria) this;
        }

        public Criteria andLatSgnValNotIn(List<BigDecimal> values) {
            addCriterion("LAT_SGN_VAL not in", values, "latSgnVal");
            return (Criteria) this;
        }

        public Criteria andLatSgnValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT_SGN_VAL between", value1, value2, "latSgnVal");
            return (Criteria) this;
        }

        public Criteria andLatSgnValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT_SGN_VAL not between", value1, value2, "latSgnVal");
            return (Criteria) this;
        }

        public Criteria andLatValIsNull() {
            addCriterion("LAT_VAL is null");
            return (Criteria) this;
        }

        public Criteria andLatValIsNotNull() {
            addCriterion("LAT_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andLatValEqualTo(BigDecimal value) {
            addCriterion("LAT_VAL =", value, "latVal");
            return (Criteria) this;
        }

        public Criteria andLatValNotEqualTo(BigDecimal value) {
            addCriterion("LAT_VAL <>", value, "latVal");
            return (Criteria) this;
        }

        public Criteria andLatValGreaterThan(BigDecimal value) {
            addCriterion("LAT_VAL >", value, "latVal");
            return (Criteria) this;
        }

        public Criteria andLatValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT_VAL >=", value, "latVal");
            return (Criteria) this;
        }

        public Criteria andLatValLessThan(BigDecimal value) {
            addCriterion("LAT_VAL <", value, "latVal");
            return (Criteria) this;
        }

        public Criteria andLatValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT_VAL <=", value, "latVal");
            return (Criteria) this;
        }

        public Criteria andLatValIn(List<BigDecimal> values) {
            addCriterion("LAT_VAL in", values, "latVal");
            return (Criteria) this;
        }

        public Criteria andLatValNotIn(List<BigDecimal> values) {
            addCriterion("LAT_VAL not in", values, "latVal");
            return (Criteria) this;
        }

        public Criteria andLatValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT_VAL between", value1, value2, "latVal");
            return (Criteria) this;
        }

        public Criteria andLatValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT_VAL not between", value1, value2, "latVal");
            return (Criteria) this;
        }

        public Criteria andLotValIsNull() {
            addCriterion("LOT_VAL is null");
            return (Criteria) this;
        }

        public Criteria andLotValIsNotNull() {
            addCriterion("LOT_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andLotValEqualTo(BigDecimal value) {
            addCriterion("LOT_VAL =", value, "lotVal");
            return (Criteria) this;
        }

        public Criteria andLotValNotEqualTo(BigDecimal value) {
            addCriterion("LOT_VAL <>", value, "lotVal");
            return (Criteria) this;
        }

        public Criteria andLotValGreaterThan(BigDecimal value) {
            addCriterion("LOT_VAL >", value, "lotVal");
            return (Criteria) this;
        }

        public Criteria andLotValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOT_VAL >=", value, "lotVal");
            return (Criteria) this;
        }

        public Criteria andLotValLessThan(BigDecimal value) {
            addCriterion("LOT_VAL <", value, "lotVal");
            return (Criteria) this;
        }

        public Criteria andLotValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOT_VAL <=", value, "lotVal");
            return (Criteria) this;
        }

        public Criteria andLotValIn(List<BigDecimal> values) {
            addCriterion("LOT_VAL in", values, "lotVal");
            return (Criteria) this;
        }

        public Criteria andLotValNotIn(List<BigDecimal> values) {
            addCriterion("LOT_VAL not in", values, "lotVal");
            return (Criteria) this;
        }

        public Criteria andLotValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOT_VAL between", value1, value2, "lotVal");
            return (Criteria) this;
        }

        public Criteria andLotValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOT_VAL not between", value1, value2, "lotVal");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValIsNull() {
            addCriterion("ALTITUDE_SGN_VAL is null");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValIsNotNull() {
            addCriterion("ALTITUDE_SGN_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValEqualTo(BigDecimal value) {
            addCriterion("ALTITUDE_SGN_VAL =", value, "altitudeSgnVal");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValNotEqualTo(BigDecimal value) {
            addCriterion("ALTITUDE_SGN_VAL <>", value, "altitudeSgnVal");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValGreaterThan(BigDecimal value) {
            addCriterion("ALTITUDE_SGN_VAL >", value, "altitudeSgnVal");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALTITUDE_SGN_VAL >=", value, "altitudeSgnVal");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValLessThan(BigDecimal value) {
            addCriterion("ALTITUDE_SGN_VAL <", value, "altitudeSgnVal");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALTITUDE_SGN_VAL <=", value, "altitudeSgnVal");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValIn(List<BigDecimal> values) {
            addCriterion("ALTITUDE_SGN_VAL in", values, "altitudeSgnVal");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValNotIn(List<BigDecimal> values) {
            addCriterion("ALTITUDE_SGN_VAL not in", values, "altitudeSgnVal");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALTITUDE_SGN_VAL between", value1, value2, "altitudeSgnVal");
            return (Criteria) this;
        }

        public Criteria andAltitudeSgnValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALTITUDE_SGN_VAL not between", value1, value2, "altitudeSgnVal");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtIsNull() {
            addCriterion("ALTITUDE_HGHT is null");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtIsNotNull() {
            addCriterion("ALTITUDE_HGHT is not null");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtEqualTo(BigDecimal value) {
            addCriterion("ALTITUDE_HGHT =", value, "altitudeHght");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtNotEqualTo(BigDecimal value) {
            addCriterion("ALTITUDE_HGHT <>", value, "altitudeHght");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtGreaterThan(BigDecimal value) {
            addCriterion("ALTITUDE_HGHT >", value, "altitudeHght");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALTITUDE_HGHT >=", value, "altitudeHght");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtLessThan(BigDecimal value) {
            addCriterion("ALTITUDE_HGHT <", value, "altitudeHght");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALTITUDE_HGHT <=", value, "altitudeHght");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtIn(List<BigDecimal> values) {
            addCriterion("ALTITUDE_HGHT in", values, "altitudeHght");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtNotIn(List<BigDecimal> values) {
            addCriterion("ALTITUDE_HGHT not in", values, "altitudeHght");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALTITUDE_HGHT between", value1, value2, "altitudeHght");
            return (Criteria) this;
        }

        public Criteria andAltitudeHghtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALTITUDE_HGHT not between", value1, value2, "altitudeHght");
            return (Criteria) this;
        }

        public Criteria andUncertyValIsNull() {
            addCriterion("UNCERTY_VAL is null");
            return (Criteria) this;
        }

        public Criteria andUncertyValIsNotNull() {
            addCriterion("UNCERTY_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andUncertyValEqualTo(BigDecimal value) {
            addCriterion("UNCERTY_VAL =", value, "uncertyVal");
            return (Criteria) this;
        }

        public Criteria andUncertyValNotEqualTo(BigDecimal value) {
            addCriterion("UNCERTY_VAL <>", value, "uncertyVal");
            return (Criteria) this;
        }

        public Criteria andUncertyValGreaterThan(BigDecimal value) {
            addCriterion("UNCERTY_VAL >", value, "uncertyVal");
            return (Criteria) this;
        }

        public Criteria andUncertyValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNCERTY_VAL >=", value, "uncertyVal");
            return (Criteria) this;
        }

        public Criteria andUncertyValLessThan(BigDecimal value) {
            addCriterion("UNCERTY_VAL <", value, "uncertyVal");
            return (Criteria) this;
        }

        public Criteria andUncertyValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNCERTY_VAL <=", value, "uncertyVal");
            return (Criteria) this;
        }

        public Criteria andUncertyValIn(List<BigDecimal> values) {
            addCriterion("UNCERTY_VAL in", values, "uncertyVal");
            return (Criteria) this;
        }

        public Criteria andUncertyValNotIn(List<BigDecimal> values) {
            addCriterion("UNCERTY_VAL not in", values, "uncertyVal");
            return (Criteria) this;
        }

        public Criteria andUncertyValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNCERTY_VAL between", value1, value2, "uncertyVal");
            return (Criteria) this;
        }

        public Criteria andUncertyValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNCERTY_VAL not between", value1, value2, "uncertyVal");
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