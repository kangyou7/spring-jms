package hello.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RCEF01WExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RCEF01WExample() {
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

        public Criteria andFailCellIdIsNull() {
            addCriterion("FAIL_CELL_ID is null");
            return (Criteria) this;
        }

        public Criteria andFailCellIdIsNotNull() {
            addCriterion("FAIL_CELL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFailCellIdEqualTo(BigDecimal value) {
            addCriterion("FAIL_CELL_ID =", value, "failCellId");
            return (Criteria) this;
        }

        public Criteria andFailCellIdNotEqualTo(BigDecimal value) {
            addCriterion("FAIL_CELL_ID <>", value, "failCellId");
            return (Criteria) this;
        }

        public Criteria andFailCellIdGreaterThan(BigDecimal value) {
            addCriterion("FAIL_CELL_ID >", value, "failCellId");
            return (Criteria) this;
        }

        public Criteria andFailCellIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_CELL_ID >=", value, "failCellId");
            return (Criteria) this;
        }

        public Criteria andFailCellIdLessThan(BigDecimal value) {
            addCriterion("FAIL_CELL_ID <", value, "failCellId");
            return (Criteria) this;
        }

        public Criteria andFailCellIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_CELL_ID <=", value, "failCellId");
            return (Criteria) this;
        }

        public Criteria andFailCellIdIn(List<BigDecimal> values) {
            addCriterion("FAIL_CELL_ID in", values, "failCellId");
            return (Criteria) this;
        }

        public Criteria andFailCellIdNotIn(List<BigDecimal> values) {
            addCriterion("FAIL_CELL_ID not in", values, "failCellId");
            return (Criteria) this;
        }

        public Criteria andFailCellIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_CELL_ID between", value1, value2, "failCellId");
            return (Criteria) this;
        }

        public Criteria andFailCellIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_CELL_ID not between", value1, value2, "failCellId");
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

        public Criteria andTxPrmbCntIsNull() {
            addCriterion("TX_PRMB_CNT is null");
            return (Criteria) this;
        }

        public Criteria andTxPrmbCntIsNotNull() {
            addCriterion("TX_PRMB_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andTxPrmbCntEqualTo(BigDecimal value) {
            addCriterion("TX_PRMB_CNT =", value, "txPrmbCnt");
            return (Criteria) this;
        }

        public Criteria andTxPrmbCntNotEqualTo(BigDecimal value) {
            addCriterion("TX_PRMB_CNT <>", value, "txPrmbCnt");
            return (Criteria) this;
        }

        public Criteria andTxPrmbCntGreaterThan(BigDecimal value) {
            addCriterion("TX_PRMB_CNT >", value, "txPrmbCnt");
            return (Criteria) this;
        }

        public Criteria andTxPrmbCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TX_PRMB_CNT >=", value, "txPrmbCnt");
            return (Criteria) this;
        }

        public Criteria andTxPrmbCntLessThan(BigDecimal value) {
            addCriterion("TX_PRMB_CNT <", value, "txPrmbCnt");
            return (Criteria) this;
        }

        public Criteria andTxPrmbCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TX_PRMB_CNT <=", value, "txPrmbCnt");
            return (Criteria) this;
        }

        public Criteria andTxPrmbCntIn(List<BigDecimal> values) {
            addCriterion("TX_PRMB_CNT in", values, "txPrmbCnt");
            return (Criteria) this;
        }

        public Criteria andTxPrmbCntNotIn(List<BigDecimal> values) {
            addCriterion("TX_PRMB_CNT not in", values, "txPrmbCnt");
            return (Criteria) this;
        }

        public Criteria andTxPrmbCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TX_PRMB_CNT between", value1, value2, "txPrmbCnt");
            return (Criteria) this;
        }

        public Criteria andTxPrmbCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TX_PRMB_CNT not between", value1, value2, "txPrmbCnt");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValIsNull() {
            addCriterion("CONN_DETC_FLAG_VAL is null");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValIsNotNull() {
            addCriterion("CONN_DETC_FLAG_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValEqualTo(BigDecimal value) {
            addCriterion("CONN_DETC_FLAG_VAL =", value, "connDetcFlagVal");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValNotEqualTo(BigDecimal value) {
            addCriterion("CONN_DETC_FLAG_VAL <>", value, "connDetcFlagVal");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValGreaterThan(BigDecimal value) {
            addCriterion("CONN_DETC_FLAG_VAL >", value, "connDetcFlagVal");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONN_DETC_FLAG_VAL >=", value, "connDetcFlagVal");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValLessThan(BigDecimal value) {
            addCriterion("CONN_DETC_FLAG_VAL <", value, "connDetcFlagVal");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONN_DETC_FLAG_VAL <=", value, "connDetcFlagVal");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValIn(List<BigDecimal> values) {
            addCriterion("CONN_DETC_FLAG_VAL in", values, "connDetcFlagVal");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValNotIn(List<BigDecimal> values) {
            addCriterion("CONN_DETC_FLAG_VAL not in", values, "connDetcFlagVal");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONN_DETC_FLAG_VAL between", value1, value2, "connDetcFlagVal");
            return (Criteria) this;
        }

        public Criteria andConnDetcFlagValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONN_DETC_FLAG_VAL not between", value1, value2, "connDetcFlagVal");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValIsNull() {
            addCriterion("MAX_TXPW_FLAG_VAL is null");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValIsNotNull() {
            addCriterion("MAX_TXPW_FLAG_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValEqualTo(BigDecimal value) {
            addCriterion("MAX_TXPW_FLAG_VAL =", value, "maxTxpwFlagVal");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValNotEqualTo(BigDecimal value) {
            addCriterion("MAX_TXPW_FLAG_VAL <>", value, "maxTxpwFlagVal");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValGreaterThan(BigDecimal value) {
            addCriterion("MAX_TXPW_FLAG_VAL >", value, "maxTxpwFlagVal");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_TXPW_FLAG_VAL >=", value, "maxTxpwFlagVal");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValLessThan(BigDecimal value) {
            addCriterion("MAX_TXPW_FLAG_VAL <", value, "maxTxpwFlagVal");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_TXPW_FLAG_VAL <=", value, "maxTxpwFlagVal");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValIn(List<BigDecimal> values) {
            addCriterion("MAX_TXPW_FLAG_VAL in", values, "maxTxpwFlagVal");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValNotIn(List<BigDecimal> values) {
            addCriterion("MAX_TXPW_FLAG_VAL not in", values, "maxTxpwFlagVal");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_TXPW_FLAG_VAL between", value1, value2, "maxTxpwFlagVal");
            return (Criteria) this;
        }

        public Criteria andMaxTxpwFlagValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_TXPW_FLAG_VAL not between", value1, value2, "maxTxpwFlagVal");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValIsNull() {
            addCriterion("FAIL_MEAS_TIME_VAL is null");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValIsNotNull() {
            addCriterion("FAIL_MEAS_TIME_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValEqualTo(BigDecimal value) {
            addCriterion("FAIL_MEAS_TIME_VAL =", value, "failMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValNotEqualTo(BigDecimal value) {
            addCriterion("FAIL_MEAS_TIME_VAL <>", value, "failMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValGreaterThan(BigDecimal value) {
            addCriterion("FAIL_MEAS_TIME_VAL >", value, "failMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_MEAS_TIME_VAL >=", value, "failMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValLessThan(BigDecimal value) {
            addCriterion("FAIL_MEAS_TIME_VAL <", value, "failMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_MEAS_TIME_VAL <=", value, "failMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValIn(List<BigDecimal> values) {
            addCriterion("FAIL_MEAS_TIME_VAL in", values, "failMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValNotIn(List<BigDecimal> values) {
            addCriterion("FAIL_MEAS_TIME_VAL not in", values, "failMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_MEAS_TIME_VAL between", value1, value2, "failMeasTimeVal");
            return (Criteria) this;
        }

        public Criteria andFailMeasTimeValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_MEAS_TIME_VAL not between", value1, value2, "failMeasTimeVal");
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