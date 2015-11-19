package hello.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PCTR01WExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PCTR01WExample() {
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

        public Criteria andMmeAsgnUeS1apIdIsNull() {
            addCriterion("MME_ASGN_UE_S1AP_ID is null");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdIsNotNull() {
            addCriterion("MME_ASGN_UE_S1AP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdEqualTo(String value) {
            addCriterion("MME_ASGN_UE_S1AP_ID =", value, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdNotEqualTo(String value) {
            addCriterion("MME_ASGN_UE_S1AP_ID <>", value, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdGreaterThan(String value) {
            addCriterion("MME_ASGN_UE_S1AP_ID >", value, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdGreaterThanOrEqualTo(String value) {
            addCriterion("MME_ASGN_UE_S1AP_ID >=", value, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdLessThan(String value) {
            addCriterion("MME_ASGN_UE_S1AP_ID <", value, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdLessThanOrEqualTo(String value) {
            addCriterion("MME_ASGN_UE_S1AP_ID <=", value, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdLike(String value) {
            addCriterion("MME_ASGN_UE_S1AP_ID like", value, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdNotLike(String value) {
            addCriterion("MME_ASGN_UE_S1AP_ID not like", value, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdIn(List<String> values) {
            addCriterion("MME_ASGN_UE_S1AP_ID in", values, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdNotIn(List<String> values) {
            addCriterion("MME_ASGN_UE_S1AP_ID not in", values, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdBetween(String value1, String value2) {
            addCriterion("MME_ASGN_UE_S1AP_ID between", value1, value2, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andMmeAsgnUeS1apIdNotBetween(String value1, String value2) {
            addCriterion("MME_ASGN_UE_S1AP_ID not between", value1, value2, "mmeAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdIsNull() {
            addCriterion("ENB_ASGN_UE_S1AP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdIsNotNull() {
            addCriterion("ENB_ASGN_UE_S1AP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdEqualTo(String value) {
            addCriterion("ENB_ASGN_UE_S1AP_ID =", value, "enbAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdNotEqualTo(String value) {
            addCriterion("ENB_ASGN_UE_S1AP_ID <>", value, "enbAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdGreaterThan(String value) {
            addCriterion("ENB_ASGN_UE_S1AP_ID >", value, "enbAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENB_ASGN_UE_S1AP_ID >=", value, "enbAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdLessThan(String value) {
            addCriterion("ENB_ASGN_UE_S1AP_ID <", value, "enbAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdLessThanOrEqualTo(String value) {
            addCriterion("ENB_ASGN_UE_S1AP_ID <=", value, "enbAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdLike(String value) {
            addCriterion("ENB_ASGN_UE_S1AP_ID like", value, "enbAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdNotLike(String value) {
            addCriterion("ENB_ASGN_UE_S1AP_ID not like", value, "enbAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdIn(List<String> values) {
            addCriterion("ENB_ASGN_UE_S1AP_ID in", values, "enbAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdNotIn(List<String> values) {
            addCriterion("ENB_ASGN_UE_S1AP_ID not in", values, "enbAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdBetween(String value1, String value2) {
            addCriterion("ENB_ASGN_UE_S1AP_ID between", value1, value2, "enbAsgnUeS1apId");
            return (Criteria) this;
        }

        public Criteria andEnbAsgnUeS1apIdNotBetween(String value1, String value2) {
            addCriterion("ENB_ASGN_UE_S1AP_ID not between", value1, value2, "enbAsgnUeS1apId");
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