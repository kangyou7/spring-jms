package hello.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class M1A201WExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public M1A201WExample() {
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

        public Criteria andMeasIdIsNull() {
            addCriterion("MEAS_ID is null");
            return (Criteria) this;
        }

        public Criteria andMeasIdIsNotNull() {
            addCriterion("MEAS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMeasIdEqualTo(String value) {
            addCriterion("MEAS_ID =", value, "measId");
            return (Criteria) this;
        }

        public Criteria andMeasIdNotEqualTo(String value) {
            addCriterion("MEAS_ID <>", value, "measId");
            return (Criteria) this;
        }

        public Criteria andMeasIdGreaterThan(String value) {
            addCriterion("MEAS_ID >", value, "measId");
            return (Criteria) this;
        }

        public Criteria andMeasIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEAS_ID >=", value, "measId");
            return (Criteria) this;
        }

        public Criteria andMeasIdLessThan(String value) {
            addCriterion("MEAS_ID <", value, "measId");
            return (Criteria) this;
        }

        public Criteria andMeasIdLessThanOrEqualTo(String value) {
            addCriterion("MEAS_ID <=", value, "measId");
            return (Criteria) this;
        }

        public Criteria andMeasIdLike(String value) {
            addCriterion("MEAS_ID like", value, "measId");
            return (Criteria) this;
        }

        public Criteria andMeasIdNotLike(String value) {
            addCriterion("MEAS_ID not like", value, "measId");
            return (Criteria) this;
        }

        public Criteria andMeasIdIn(List<String> values) {
            addCriterion("MEAS_ID in", values, "measId");
            return (Criteria) this;
        }

        public Criteria andMeasIdNotIn(List<String> values) {
            addCriterion("MEAS_ID not in", values, "measId");
            return (Criteria) this;
        }

        public Criteria andMeasIdBetween(String value1, String value2) {
            addCriterion("MEAS_ID between", value1, value2, "measId");
            return (Criteria) this;
        }

        public Criteria andMeasIdNotBetween(String value1, String value2) {
            addCriterion("MEAS_ID not between", value1, value2, "measId");
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