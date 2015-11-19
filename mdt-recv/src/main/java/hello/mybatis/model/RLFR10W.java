package hello.mybatis.model;

import java.math.BigDecimal;

public class RLFR10W {
    private String workDay;

    private String mdtId;

    private BigDecimal carrFreqSeq;

    private BigDecimal arfcnVal;

    private BigDecimal ncellCnt;

    public RLFR10W(String workDay, String mdtId, BigDecimal carrFreqSeq, BigDecimal arfcnVal, BigDecimal ncellCnt) {
        this.workDay = workDay;
        this.mdtId = mdtId;
        this.carrFreqSeq = carrFreqSeq;
        this.arfcnVal = arfcnVal;
        this.ncellCnt = ncellCnt;
    }

    public RLFR10W() {
        super();
    }

    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    public String getMdtId() {
        return mdtId;
    }

    public void setMdtId(String mdtId) {
        this.mdtId = mdtId;
    }

    public BigDecimal getCarrFreqSeq() {
        return carrFreqSeq;
    }

    public void setCarrFreqSeq(BigDecimal carrFreqSeq) {
        this.carrFreqSeq = carrFreqSeq;
    }

    public BigDecimal getArfcnVal() {
        return arfcnVal;
    }

    public void setArfcnVal(BigDecimal arfcnVal) {
        this.arfcnVal = arfcnVal;
    }

    public BigDecimal getNcellCnt() {
        return ncellCnt;
    }

    public void setNcellCnt(BigDecimal ncellCnt) {
        this.ncellCnt = ncellCnt;
    }
}