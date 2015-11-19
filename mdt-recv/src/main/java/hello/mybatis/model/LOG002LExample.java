package hello.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LOG002LExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LOG002LExample() {
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

        public Criteria andFileNmIsNull() {
            addCriterion("FILE_NM is null");
            return (Criteria) this;
        }

        public Criteria andFileNmIsNotNull() {
            addCriterion("FILE_NM is not null");
            return (Criteria) this;
        }

        public Criteria andFileNmEqualTo(String value) {
            addCriterion("FILE_NM =", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmNotEqualTo(String value) {
            addCriterion("FILE_NM <>", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmGreaterThan(String value) {
            addCriterion("FILE_NM >", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NM >=", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmLessThan(String value) {
            addCriterion("FILE_NM <", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmLessThanOrEqualTo(String value) {
            addCriterion("FILE_NM <=", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmLike(String value) {
            addCriterion("FILE_NM like", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmNotLike(String value) {
            addCriterion("FILE_NM not like", value, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmIn(List<String> values) {
            addCriterion("FILE_NM in", values, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmNotIn(List<String> values) {
            addCriterion("FILE_NM not in", values, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmBetween(String value1, String value2) {
            addCriterion("FILE_NM between", value1, value2, "fileNm");
            return (Criteria) this;
        }

        public Criteria andFileNmNotBetween(String value1, String value2) {
            addCriterion("FILE_NM not between", value1, value2, "fileNm");
            return (Criteria) this;
        }

        public Criteria andMdayIsNull() {
            addCriterion("MDAY is null");
            return (Criteria) this;
        }

        public Criteria andMdayIsNotNull() {
            addCriterion("MDAY is not null");
            return (Criteria) this;
        }

        public Criteria andMdayEqualTo(String value) {
            addCriterion("MDAY =", value, "mday");
            return (Criteria) this;
        }

        public Criteria andMdayNotEqualTo(String value) {
            addCriterion("MDAY <>", value, "mday");
            return (Criteria) this;
        }

        public Criteria andMdayGreaterThan(String value) {
            addCriterion("MDAY >", value, "mday");
            return (Criteria) this;
        }

        public Criteria andMdayGreaterThanOrEqualTo(String value) {
            addCriterion("MDAY >=", value, "mday");
            return (Criteria) this;
        }

        public Criteria andMdayLessThan(String value) {
            addCriterion("MDAY <", value, "mday");
            return (Criteria) this;
        }

        public Criteria andMdayLessThanOrEqualTo(String value) {
            addCriterion("MDAY <=", value, "mday");
            return (Criteria) this;
        }

        public Criteria andMdayLike(String value) {
            addCriterion("MDAY like", value, "mday");
            return (Criteria) this;
        }

        public Criteria andMdayNotLike(String value) {
            addCriterion("MDAY not like", value, "mday");
            return (Criteria) this;
        }

        public Criteria andMdayIn(List<String> values) {
            addCriterion("MDAY in", values, "mday");
            return (Criteria) this;
        }

        public Criteria andMdayNotIn(List<String> values) {
            addCriterion("MDAY not in", values, "mday");
            return (Criteria) this;
        }

        public Criteria andMdayBetween(String value1, String value2) {
            addCriterion("MDAY between", value1, value2, "mday");
            return (Criteria) this;
        }

        public Criteria andMdayNotBetween(String value1, String value2) {
            addCriterion("MDAY not between", value1, value2, "mday");
            return (Criteria) this;
        }

        public Criteria andOmcIdIsNull() {
            addCriterion("OMC_ID is null");
            return (Criteria) this;
        }

        public Criteria andOmcIdIsNotNull() {
            addCriterion("OMC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOmcIdEqualTo(String value) {
            addCriterion("OMC_ID =", value, "omcId");
            return (Criteria) this;
        }

        public Criteria andOmcIdNotEqualTo(String value) {
            addCriterion("OMC_ID <>", value, "omcId");
            return (Criteria) this;
        }

        public Criteria andOmcIdGreaterThan(String value) {
            addCriterion("OMC_ID >", value, "omcId");
            return (Criteria) this;
        }

        public Criteria andOmcIdGreaterThanOrEqualTo(String value) {
            addCriterion("OMC_ID >=", value, "omcId");
            return (Criteria) this;
        }

        public Criteria andOmcIdLessThan(String value) {
            addCriterion("OMC_ID <", value, "omcId");
            return (Criteria) this;
        }

        public Criteria andOmcIdLessThanOrEqualTo(String value) {
            addCriterion("OMC_ID <=", value, "omcId");
            return (Criteria) this;
        }

        public Criteria andOmcIdLike(String value) {
            addCriterion("OMC_ID like", value, "omcId");
            return (Criteria) this;
        }

        public Criteria andOmcIdNotLike(String value) {
            addCriterion("OMC_ID not like", value, "omcId");
            return (Criteria) this;
        }

        public Criteria andOmcIdIn(List<String> values) {
            addCriterion("OMC_ID in", values, "omcId");
            return (Criteria) this;
        }

        public Criteria andOmcIdNotIn(List<String> values) {
            addCriterion("OMC_ID not in", values, "omcId");
            return (Criteria) this;
        }

        public Criteria andOmcIdBetween(String value1, String value2) {
            addCriterion("OMC_ID between", value1, value2, "omcId");
            return (Criteria) this;
        }

        public Criteria andOmcIdNotBetween(String value1, String value2) {
            addCriterion("OMC_ID not between", value1, value2, "omcId");
            return (Criteria) this;
        }

        public Criteria andNeIdIsNull() {
            addCriterion("NE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNeIdIsNotNull() {
            addCriterion("NE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNeIdEqualTo(String value) {
            addCriterion("NE_ID =", value, "neId");
            return (Criteria) this;
        }

        public Criteria andNeIdNotEqualTo(String value) {
            addCriterion("NE_ID <>", value, "neId");
            return (Criteria) this;
        }

        public Criteria andNeIdGreaterThan(String value) {
            addCriterion("NE_ID >", value, "neId");
            return (Criteria) this;
        }

        public Criteria andNeIdGreaterThanOrEqualTo(String value) {
            addCriterion("NE_ID >=", value, "neId");
            return (Criteria) this;
        }

        public Criteria andNeIdLessThan(String value) {
            addCriterion("NE_ID <", value, "neId");
            return (Criteria) this;
        }

        public Criteria andNeIdLessThanOrEqualTo(String value) {
            addCriterion("NE_ID <=", value, "neId");
            return (Criteria) this;
        }

        public Criteria andNeIdLike(String value) {
            addCriterion("NE_ID like", value, "neId");
            return (Criteria) this;
        }

        public Criteria andNeIdNotLike(String value) {
            addCriterion("NE_ID not like", value, "neId");
            return (Criteria) this;
        }

        public Criteria andNeIdIn(List<String> values) {
            addCriterion("NE_ID in", values, "neId");
            return (Criteria) this;
        }

        public Criteria andNeIdNotIn(List<String> values) {
            addCriterion("NE_ID not in", values, "neId");
            return (Criteria) this;
        }

        public Criteria andNeIdBetween(String value1, String value2) {
            addCriterion("NE_ID between", value1, value2, "neId");
            return (Criteria) this;
        }

        public Criteria andNeIdNotBetween(String value1, String value2) {
            addCriterion("NE_ID not between", value1, value2, "neId");
            return (Criteria) this;
        }

        public Criteria andReadRowCntIsNull() {
            addCriterion("READ_ROW_CNT is null");
            return (Criteria) this;
        }

        public Criteria andReadRowCntIsNotNull() {
            addCriterion("READ_ROW_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andReadRowCntEqualTo(BigDecimal value) {
            addCriterion("READ_ROW_CNT =", value, "readRowCnt");
            return (Criteria) this;
        }

        public Criteria andReadRowCntNotEqualTo(BigDecimal value) {
            addCriterion("READ_ROW_CNT <>", value, "readRowCnt");
            return (Criteria) this;
        }

        public Criteria andReadRowCntGreaterThan(BigDecimal value) {
            addCriterion("READ_ROW_CNT >", value, "readRowCnt");
            return (Criteria) this;
        }

        public Criteria andReadRowCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("READ_ROW_CNT >=", value, "readRowCnt");
            return (Criteria) this;
        }

        public Criteria andReadRowCntLessThan(BigDecimal value) {
            addCriterion("READ_ROW_CNT <", value, "readRowCnt");
            return (Criteria) this;
        }

        public Criteria andReadRowCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("READ_ROW_CNT <=", value, "readRowCnt");
            return (Criteria) this;
        }

        public Criteria andReadRowCntIn(List<BigDecimal> values) {
            addCriterion("READ_ROW_CNT in", values, "readRowCnt");
            return (Criteria) this;
        }

        public Criteria andReadRowCntNotIn(List<BigDecimal> values) {
            addCriterion("READ_ROW_CNT not in", values, "readRowCnt");
            return (Criteria) this;
        }

        public Criteria andReadRowCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("READ_ROW_CNT between", value1, value2, "readRowCnt");
            return (Criteria) this;
        }

        public Criteria andReadRowCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("READ_ROW_CNT not between", value1, value2, "readRowCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntIsNull() {
            addCriterion("INSRT_SUC_CNT is null");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntIsNotNull() {
            addCriterion("INSRT_SUC_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntEqualTo(BigDecimal value) {
            addCriterion("INSRT_SUC_CNT =", value, "insrtSucCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntNotEqualTo(BigDecimal value) {
            addCriterion("INSRT_SUC_CNT <>", value, "insrtSucCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntGreaterThan(BigDecimal value) {
            addCriterion("INSRT_SUC_CNT >", value, "insrtSucCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSRT_SUC_CNT >=", value, "insrtSucCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntLessThan(BigDecimal value) {
            addCriterion("INSRT_SUC_CNT <", value, "insrtSucCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSRT_SUC_CNT <=", value, "insrtSucCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntIn(List<BigDecimal> values) {
            addCriterion("INSRT_SUC_CNT in", values, "insrtSucCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntNotIn(List<BigDecimal> values) {
            addCriterion("INSRT_SUC_CNT not in", values, "insrtSucCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSRT_SUC_CNT between", value1, value2, "insrtSucCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtSucCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSRT_SUC_CNT not between", value1, value2, "insrtSucCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntIsNull() {
            addCriterion("INSRT_FAIL_CNT is null");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntIsNotNull() {
            addCriterion("INSRT_FAIL_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntEqualTo(BigDecimal value) {
            addCriterion("INSRT_FAIL_CNT =", value, "insrtFailCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntNotEqualTo(BigDecimal value) {
            addCriterion("INSRT_FAIL_CNT <>", value, "insrtFailCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntGreaterThan(BigDecimal value) {
            addCriterion("INSRT_FAIL_CNT >", value, "insrtFailCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSRT_FAIL_CNT >=", value, "insrtFailCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntLessThan(BigDecimal value) {
            addCriterion("INSRT_FAIL_CNT <", value, "insrtFailCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSRT_FAIL_CNT <=", value, "insrtFailCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntIn(List<BigDecimal> values) {
            addCriterion("INSRT_FAIL_CNT in", values, "insrtFailCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntNotIn(List<BigDecimal> values) {
            addCriterion("INSRT_FAIL_CNT not in", values, "insrtFailCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSRT_FAIL_CNT between", value1, value2, "insrtFailCnt");
            return (Criteria) this;
        }

        public Criteria andInsrtFailCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSRT_FAIL_CNT not between", value1, value2, "insrtFailCnt");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValIsNull() {
            addCriterion("PRCS_PSG_TIME_VAL is null");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValIsNotNull() {
            addCriterion("PRCS_PSG_TIME_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValEqualTo(String value) {
            addCriterion("PRCS_PSG_TIME_VAL =", value, "prcsPsgTimeVal");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValNotEqualTo(String value) {
            addCriterion("PRCS_PSG_TIME_VAL <>", value, "prcsPsgTimeVal");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValGreaterThan(String value) {
            addCriterion("PRCS_PSG_TIME_VAL >", value, "prcsPsgTimeVal");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValGreaterThanOrEqualTo(String value) {
            addCriterion("PRCS_PSG_TIME_VAL >=", value, "prcsPsgTimeVal");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValLessThan(String value) {
            addCriterion("PRCS_PSG_TIME_VAL <", value, "prcsPsgTimeVal");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValLessThanOrEqualTo(String value) {
            addCriterion("PRCS_PSG_TIME_VAL <=", value, "prcsPsgTimeVal");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValLike(String value) {
            addCriterion("PRCS_PSG_TIME_VAL like", value, "prcsPsgTimeVal");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValNotLike(String value) {
            addCriterion("PRCS_PSG_TIME_VAL not like", value, "prcsPsgTimeVal");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValIn(List<String> values) {
            addCriterion("PRCS_PSG_TIME_VAL in", values, "prcsPsgTimeVal");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValNotIn(List<String> values) {
            addCriterion("PRCS_PSG_TIME_VAL not in", values, "prcsPsgTimeVal");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValBetween(String value1, String value2) {
            addCriterion("PRCS_PSG_TIME_VAL between", value1, value2, "prcsPsgTimeVal");
            return (Criteria) this;
        }

        public Criteria andPrcsPsgTimeValNotBetween(String value1, String value2) {
            addCriterion("PRCS_PSG_TIME_VAL not between", value1, value2, "prcsPsgTimeVal");
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