package hello.mybatis.model;

import java.math.BigDecimal;

public class LOG002L {
    private String workDay;

    private String fileNm;

    private String mday;

    private String omcId;

    private String neId;

    private BigDecimal readRowCnt;

    private BigDecimal insrtSucCnt;

    private BigDecimal insrtFailCnt;

    private String prcsPsgTimeVal;

    public LOG002L(String workDay, String fileNm, String mday, String omcId, String neId, BigDecimal readRowCnt, BigDecimal insrtSucCnt, BigDecimal insrtFailCnt, String prcsPsgTimeVal) {
        this.workDay = workDay;
        this.fileNm = fileNm;
        this.mday = mday;
        this.omcId = omcId;
        this.neId = neId;
        this.readRowCnt = readRowCnt;
        this.insrtSucCnt = insrtSucCnt;
        this.insrtFailCnt = insrtFailCnt;
        this.prcsPsgTimeVal = prcsPsgTimeVal;
    }

    public LOG002L() {
        super();
    }

    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    public String getFileNm() {
        return fileNm;
    }

    public void setFileNm(String fileNm) {
        this.fileNm = fileNm;
    }

    public String getMday() {
        return mday;
    }

    public void setMday(String mday) {
        this.mday = mday;
    }

    public String getOmcId() {
        return omcId;
    }

    public void setOmcId(String omcId) {
        this.omcId = omcId;
    }

    public String getNeId() {
        return neId;
    }

    public void setNeId(String neId) {
        this.neId = neId;
    }

    public BigDecimal getReadRowCnt() {
        return readRowCnt;
    }

    public void setReadRowCnt(BigDecimal readRowCnt) {
        this.readRowCnt = readRowCnt;
    }

    public BigDecimal getInsrtSucCnt() {
        return insrtSucCnt;
    }

    public void setInsrtSucCnt(BigDecimal insrtSucCnt) {
        this.insrtSucCnt = insrtSucCnt;
    }

    public BigDecimal getInsrtFailCnt() {
        return insrtFailCnt;
    }

    public void setInsrtFailCnt(BigDecimal insrtFailCnt) {
        this.insrtFailCnt = insrtFailCnt;
    }

    public String getPrcsPsgTimeVal() {
        return prcsPsgTimeVal;
    }

    public void setPrcsPsgTimeVal(String prcsPsgTimeVal) {
        this.prcsPsgTimeVal = prcsPsgTimeVal;
    }
}