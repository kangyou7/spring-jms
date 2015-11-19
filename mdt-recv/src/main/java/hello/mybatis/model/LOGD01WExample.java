package hello.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LOGD01WExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LOGD01WExample() {
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

        public Criteria andEutranNcellInfoYnIsNull() {
            addCriterion("EUTRAN_NCELL_INFO_YN is null");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnIsNotNull() {
            addCriterion("EUTRAN_NCELL_INFO_YN is not null");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnEqualTo(String value) {
            addCriterion("EUTRAN_NCELL_INFO_YN =", value, "eutranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnNotEqualTo(String value) {
            addCriterion("EUTRAN_NCELL_INFO_YN <>", value, "eutranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnGreaterThan(String value) {
            addCriterion("EUTRAN_NCELL_INFO_YN >", value, "eutranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnGreaterThanOrEqualTo(String value) {
            addCriterion("EUTRAN_NCELL_INFO_YN >=", value, "eutranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnLessThan(String value) {
            addCriterion("EUTRAN_NCELL_INFO_YN <", value, "eutranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnLessThanOrEqualTo(String value) {
            addCriterion("EUTRAN_NCELL_INFO_YN <=", value, "eutranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnLike(String value) {
            addCriterion("EUTRAN_NCELL_INFO_YN like", value, "eutranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnNotLike(String value) {
            addCriterion("EUTRAN_NCELL_INFO_YN not like", value, "eutranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnIn(List<String> values) {
            addCriterion("EUTRAN_NCELL_INFO_YN in", values, "eutranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnNotIn(List<String> values) {
            addCriterion("EUTRAN_NCELL_INFO_YN not in", values, "eutranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnBetween(String value1, String value2) {
            addCriterion("EUTRAN_NCELL_INFO_YN between", value1, value2, "eutranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andEutranNcellInfoYnNotBetween(String value1, String value2) {
            addCriterion("EUTRAN_NCELL_INFO_YN not between", value1, value2, "eutranNcellInfoYn");
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

        public Criteria andUtranNcellInfoYnIsNull() {
            addCriterion("UTRAN_NCELL_INFO_YN is null");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnIsNotNull() {
            addCriterion("UTRAN_NCELL_INFO_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnEqualTo(String value) {
            addCriterion("UTRAN_NCELL_INFO_YN =", value, "utranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnNotEqualTo(String value) {
            addCriterion("UTRAN_NCELL_INFO_YN <>", value, "utranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnGreaterThan(String value) {
            addCriterion("UTRAN_NCELL_INFO_YN >", value, "utranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnGreaterThanOrEqualTo(String value) {
            addCriterion("UTRAN_NCELL_INFO_YN >=", value, "utranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnLessThan(String value) {
            addCriterion("UTRAN_NCELL_INFO_YN <", value, "utranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnLessThanOrEqualTo(String value) {
            addCriterion("UTRAN_NCELL_INFO_YN <=", value, "utranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnLike(String value) {
            addCriterion("UTRAN_NCELL_INFO_YN like", value, "utranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnNotLike(String value) {
            addCriterion("UTRAN_NCELL_INFO_YN not like", value, "utranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnIn(List<String> values) {
            addCriterion("UTRAN_NCELL_INFO_YN in", values, "utranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnNotIn(List<String> values) {
            addCriterion("UTRAN_NCELL_INFO_YN not in", values, "utranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnBetween(String value1, String value2) {
            addCriterion("UTRAN_NCELL_INFO_YN between", value1, value2, "utranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andUtranNcellInfoYnNotBetween(String value1, String value2) {
            addCriterion("UTRAN_NCELL_INFO_YN not between", value1, value2, "utranNcellInfoYn");
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

        public Criteria andGeranNcellInfoYnIsNull() {
            addCriterion("GERAN_NCELL_INFO_YN is null");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnIsNotNull() {
            addCriterion("GERAN_NCELL_INFO_YN is not null");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnEqualTo(String value) {
            addCriterion("GERAN_NCELL_INFO_YN =", value, "geranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnNotEqualTo(String value) {
            addCriterion("GERAN_NCELL_INFO_YN <>", value, "geranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnGreaterThan(String value) {
            addCriterion("GERAN_NCELL_INFO_YN >", value, "geranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnGreaterThanOrEqualTo(String value) {
            addCriterion("GERAN_NCELL_INFO_YN >=", value, "geranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnLessThan(String value) {
            addCriterion("GERAN_NCELL_INFO_YN <", value, "geranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnLessThanOrEqualTo(String value) {
            addCriterion("GERAN_NCELL_INFO_YN <=", value, "geranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnLike(String value) {
            addCriterion("GERAN_NCELL_INFO_YN like", value, "geranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnNotLike(String value) {
            addCriterion("GERAN_NCELL_INFO_YN not like", value, "geranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnIn(List<String> values) {
            addCriterion("GERAN_NCELL_INFO_YN in", values, "geranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnNotIn(List<String> values) {
            addCriterion("GERAN_NCELL_INFO_YN not in", values, "geranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnBetween(String value1, String value2) {
            addCriterion("GERAN_NCELL_INFO_YN between", value1, value2, "geranNcellInfoYn");
            return (Criteria) this;
        }

        public Criteria andGeranNcellInfoYnNotBetween(String value1, String value2) {
            addCriterion("GERAN_NCELL_INFO_YN not between", value1, value2, "geranNcellInfoYn");
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

        public Criteria andTrcRefYnIsNull() {
            addCriterion("TRC_REF_YN is null");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnIsNotNull() {
            addCriterion("TRC_REF_YN is not null");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnEqualTo(String value) {
            addCriterion("TRC_REF_YN =", value, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnNotEqualTo(String value) {
            addCriterion("TRC_REF_YN <>", value, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnGreaterThan(String value) {
            addCriterion("TRC_REF_YN >", value, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnGreaterThanOrEqualTo(String value) {
            addCriterion("TRC_REF_YN >=", value, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnLessThan(String value) {
            addCriterion("TRC_REF_YN <", value, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnLessThanOrEqualTo(String value) {
            addCriterion("TRC_REF_YN <=", value, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnLike(String value) {
            addCriterion("TRC_REF_YN like", value, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnNotLike(String value) {
            addCriterion("TRC_REF_YN not like", value, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnIn(List<String> values) {
            addCriterion("TRC_REF_YN in", values, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnNotIn(List<String> values) {
            addCriterion("TRC_REF_YN not in", values, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnBetween(String value1, String value2) {
            addCriterion("TRC_REF_YN between", value1, value2, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andTrcRefYnNotBetween(String value1, String value2) {
            addCriterion("TRC_REF_YN not between", value1, value2, "trcRefYn");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdIsNull() {
            addCriterion("USER_PLMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdIsNotNull() {
            addCriterion("USER_PLMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdEqualTo(String value) {
            addCriterion("USER_PLMN_ID =", value, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdNotEqualTo(String value) {
            addCriterion("USER_PLMN_ID <>", value, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdGreaterThan(String value) {
            addCriterion("USER_PLMN_ID >", value, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PLMN_ID >=", value, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdLessThan(String value) {
            addCriterion("USER_PLMN_ID <", value, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdLessThanOrEqualTo(String value) {
            addCriterion("USER_PLMN_ID <=", value, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdLike(String value) {
            addCriterion("USER_PLMN_ID like", value, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdNotLike(String value) {
            addCriterion("USER_PLMN_ID not like", value, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdIn(List<String> values) {
            addCriterion("USER_PLMN_ID in", values, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdNotIn(List<String> values) {
            addCriterion("USER_PLMN_ID not in", values, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdBetween(String value1, String value2) {
            addCriterion("USER_PLMN_ID between", value1, value2, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andUserPlmnIdNotBetween(String value1, String value2) {
            addCriterion("USER_PLMN_ID not between", value1, value2, "userPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdIsNull() {
            addCriterion("TRC_PLMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdIsNotNull() {
            addCriterion("TRC_PLMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdEqualTo(String value) {
            addCriterion("TRC_PLMN_ID =", value, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdNotEqualTo(String value) {
            addCriterion("TRC_PLMN_ID <>", value, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdGreaterThan(String value) {
            addCriterion("TRC_PLMN_ID >", value, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRC_PLMN_ID >=", value, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdLessThan(String value) {
            addCriterion("TRC_PLMN_ID <", value, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdLessThanOrEqualTo(String value) {
            addCriterion("TRC_PLMN_ID <=", value, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdLike(String value) {
            addCriterion("TRC_PLMN_ID like", value, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdNotLike(String value) {
            addCriterion("TRC_PLMN_ID not like", value, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdIn(List<String> values) {
            addCriterion("TRC_PLMN_ID in", values, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdNotIn(List<String> values) {
            addCriterion("TRC_PLMN_ID not in", values, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdBetween(String value1, String value2) {
            addCriterion("TRC_PLMN_ID between", value1, value2, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcPlmnIdNotBetween(String value1, String value2) {
            addCriterion("TRC_PLMN_ID not between", value1, value2, "trcPlmnId");
            return (Criteria) this;
        }

        public Criteria andTrcIdIsNull() {
            addCriterion("TRC_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrcIdIsNotNull() {
            addCriterion("TRC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrcIdEqualTo(String value) {
            addCriterion("TRC_ID =", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdNotEqualTo(String value) {
            addCriterion("TRC_ID <>", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdGreaterThan(String value) {
            addCriterion("TRC_ID >", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRC_ID >=", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdLessThan(String value) {
            addCriterion("TRC_ID <", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdLessThanOrEqualTo(String value) {
            addCriterion("TRC_ID <=", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdLike(String value) {
            addCriterion("TRC_ID like", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdNotLike(String value) {
            addCriterion("TRC_ID not like", value, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdIn(List<String> values) {
            addCriterion("TRC_ID in", values, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdNotIn(List<String> values) {
            addCriterion("TRC_ID not in", values, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdBetween(String value1, String value2) {
            addCriterion("TRC_ID between", value1, value2, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrcIdNotBetween(String value1, String value2) {
            addCriterion("TRC_ID not between", value1, value2, "trcId");
            return (Criteria) this;
        }

        public Criteria andTrsrValIsNull() {
            addCriterion("TRSR_VAL is null");
            return (Criteria) this;
        }

        public Criteria andTrsrValIsNotNull() {
            addCriterion("TRSR_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andTrsrValEqualTo(BigDecimal value) {
            addCriterion("TRSR_VAL =", value, "trsrVal");
            return (Criteria) this;
        }

        public Criteria andTrsrValNotEqualTo(BigDecimal value) {
            addCriterion("TRSR_VAL <>", value, "trsrVal");
            return (Criteria) this;
        }

        public Criteria andTrsrValGreaterThan(BigDecimal value) {
            addCriterion("TRSR_VAL >", value, "trsrVal");
            return (Criteria) this;
        }

        public Criteria andTrsrValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRSR_VAL >=", value, "trsrVal");
            return (Criteria) this;
        }

        public Criteria andTrsrValLessThan(BigDecimal value) {
            addCriterion("TRSR_VAL <", value, "trsrVal");
            return (Criteria) this;
        }

        public Criteria andTrsrValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRSR_VAL <=", value, "trsrVal");
            return (Criteria) this;
        }

        public Criteria andTrsrValIn(List<BigDecimal> values) {
            addCriterion("TRSR_VAL in", values, "trsrVal");
            return (Criteria) this;
        }

        public Criteria andTrsrValNotIn(List<BigDecimal> values) {
            addCriterion("TRSR_VAL not in", values, "trsrVal");
            return (Criteria) this;
        }

        public Criteria andTrsrValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRSR_VAL between", value1, value2, "trsrVal");
            return (Criteria) this;
        }

        public Criteria andTrsrValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRSR_VAL not between", value1, value2, "trsrVal");
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