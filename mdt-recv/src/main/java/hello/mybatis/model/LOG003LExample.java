package hello.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class LOG003LExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LOG003LExample() {
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

        public Criteria andPgmNmIsNull() {
            addCriterion("PGM_NM is null");
            return (Criteria) this;
        }

        public Criteria andPgmNmIsNotNull() {
            addCriterion("PGM_NM is not null");
            return (Criteria) this;
        }

        public Criteria andPgmNmEqualTo(String value) {
            addCriterion("PGM_NM =", value, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andPgmNmNotEqualTo(String value) {
            addCriterion("PGM_NM <>", value, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andPgmNmGreaterThan(String value) {
            addCriterion("PGM_NM >", value, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andPgmNmGreaterThanOrEqualTo(String value) {
            addCriterion("PGM_NM >=", value, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andPgmNmLessThan(String value) {
            addCriterion("PGM_NM <", value, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andPgmNmLessThanOrEqualTo(String value) {
            addCriterion("PGM_NM <=", value, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andPgmNmLike(String value) {
            addCriterion("PGM_NM like", value, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andPgmNmNotLike(String value) {
            addCriterion("PGM_NM not like", value, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andPgmNmIn(List<String> values) {
            addCriterion("PGM_NM in", values, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andPgmNmNotIn(List<String> values) {
            addCriterion("PGM_NM not in", values, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andPgmNmBetween(String value1, String value2) {
            addCriterion("PGM_NM between", value1, value2, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andPgmNmNotBetween(String value1, String value2) {
            addCriterion("PGM_NM not between", value1, value2, "pgmNm");
            return (Criteria) this;
        }

        public Criteria andErrContsIsNull() {
            addCriterion("ERR_CONTS is null");
            return (Criteria) this;
        }

        public Criteria andErrContsIsNotNull() {
            addCriterion("ERR_CONTS is not null");
            return (Criteria) this;
        }

        public Criteria andErrContsEqualTo(String value) {
            addCriterion("ERR_CONTS =", value, "errConts");
            return (Criteria) this;
        }

        public Criteria andErrContsNotEqualTo(String value) {
            addCriterion("ERR_CONTS <>", value, "errConts");
            return (Criteria) this;
        }

        public Criteria andErrContsGreaterThan(String value) {
            addCriterion("ERR_CONTS >", value, "errConts");
            return (Criteria) this;
        }

        public Criteria andErrContsGreaterThanOrEqualTo(String value) {
            addCriterion("ERR_CONTS >=", value, "errConts");
            return (Criteria) this;
        }

        public Criteria andErrContsLessThan(String value) {
            addCriterion("ERR_CONTS <", value, "errConts");
            return (Criteria) this;
        }

        public Criteria andErrContsLessThanOrEqualTo(String value) {
            addCriterion("ERR_CONTS <=", value, "errConts");
            return (Criteria) this;
        }

        public Criteria andErrContsLike(String value) {
            addCriterion("ERR_CONTS like", value, "errConts");
            return (Criteria) this;
        }

        public Criteria andErrContsNotLike(String value) {
            addCriterion("ERR_CONTS not like", value, "errConts");
            return (Criteria) this;
        }

        public Criteria andErrContsIn(List<String> values) {
            addCriterion("ERR_CONTS in", values, "errConts");
            return (Criteria) this;
        }

        public Criteria andErrContsNotIn(List<String> values) {
            addCriterion("ERR_CONTS not in", values, "errConts");
            return (Criteria) this;
        }

        public Criteria andErrContsBetween(String value1, String value2) {
            addCriterion("ERR_CONTS between", value1, value2, "errConts");
            return (Criteria) this;
        }

        public Criteria andErrContsNotBetween(String value1, String value2) {
            addCriterion("ERR_CONTS not between", value1, value2, "errConts");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdIsNull() {
            addCriterion("DEFT_GBN_CD is null");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdIsNotNull() {
            addCriterion("DEFT_GBN_CD is not null");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdEqualTo(String value) {
            addCriterion("DEFT_GBN_CD =", value, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdNotEqualTo(String value) {
            addCriterion("DEFT_GBN_CD <>", value, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdGreaterThan(String value) {
            addCriterion("DEFT_GBN_CD >", value, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdGreaterThanOrEqualTo(String value) {
            addCriterion("DEFT_GBN_CD >=", value, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdLessThan(String value) {
            addCriterion("DEFT_GBN_CD <", value, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdLessThanOrEqualTo(String value) {
            addCriterion("DEFT_GBN_CD <=", value, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdLike(String value) {
            addCriterion("DEFT_GBN_CD like", value, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdNotLike(String value) {
            addCriterion("DEFT_GBN_CD not like", value, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdIn(List<String> values) {
            addCriterion("DEFT_GBN_CD in", values, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdNotIn(List<String> values) {
            addCriterion("DEFT_GBN_CD not in", values, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdBetween(String value1, String value2) {
            addCriterion("DEFT_GBN_CD between", value1, value2, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andDeftGbnCdNotBetween(String value1, String value2) {
            addCriterion("DEFT_GBN_CD not between", value1, value2, "deftGbnCd");
            return (Criteria) this;
        }

        public Criteria andSmsYnIsNull() {
            addCriterion("SMS_YN is null");
            return (Criteria) this;
        }

        public Criteria andSmsYnIsNotNull() {
            addCriterion("SMS_YN is not null");
            return (Criteria) this;
        }

        public Criteria andSmsYnEqualTo(String value) {
            addCriterion("SMS_YN =", value, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsYnNotEqualTo(String value) {
            addCriterion("SMS_YN <>", value, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsYnGreaterThan(String value) {
            addCriterion("SMS_YN >", value, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsYnGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_YN >=", value, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsYnLessThan(String value) {
            addCriterion("SMS_YN <", value, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsYnLessThanOrEqualTo(String value) {
            addCriterion("SMS_YN <=", value, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsYnLike(String value) {
            addCriterion("SMS_YN like", value, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsYnNotLike(String value) {
            addCriterion("SMS_YN not like", value, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsYnIn(List<String> values) {
            addCriterion("SMS_YN in", values, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsYnNotIn(List<String> values) {
            addCriterion("SMS_YN not in", values, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsYnBetween(String value1, String value2) {
            addCriterion("SMS_YN between", value1, value2, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsYnNotBetween(String value1, String value2) {
            addCriterion("SMS_YN not between", value1, value2, "smsYn");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsIsNull() {
            addCriterion("SMS_MSG_CONTS is null");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsIsNotNull() {
            addCriterion("SMS_MSG_CONTS is not null");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsEqualTo(String value) {
            addCriterion("SMS_MSG_CONTS =", value, "smsMsgConts");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsNotEqualTo(String value) {
            addCriterion("SMS_MSG_CONTS <>", value, "smsMsgConts");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsGreaterThan(String value) {
            addCriterion("SMS_MSG_CONTS >", value, "smsMsgConts");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_MSG_CONTS >=", value, "smsMsgConts");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsLessThan(String value) {
            addCriterion("SMS_MSG_CONTS <", value, "smsMsgConts");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsLessThanOrEqualTo(String value) {
            addCriterion("SMS_MSG_CONTS <=", value, "smsMsgConts");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsLike(String value) {
            addCriterion("SMS_MSG_CONTS like", value, "smsMsgConts");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsNotLike(String value) {
            addCriterion("SMS_MSG_CONTS not like", value, "smsMsgConts");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsIn(List<String> values) {
            addCriterion("SMS_MSG_CONTS in", values, "smsMsgConts");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsNotIn(List<String> values) {
            addCriterion("SMS_MSG_CONTS not in", values, "smsMsgConts");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsBetween(String value1, String value2) {
            addCriterion("SMS_MSG_CONTS between", value1, value2, "smsMsgConts");
            return (Criteria) this;
        }

        public Criteria andSmsMsgContsNotBetween(String value1, String value2) {
            addCriterion("SMS_MSG_CONTS not between", value1, value2, "smsMsgConts");
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