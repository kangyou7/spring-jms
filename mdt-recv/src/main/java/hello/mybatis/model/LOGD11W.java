package hello.mybatis.model;

import java.math.BigDecimal;

public class LOGD11W {
    private String workDay;

    private String mdtId;

    private BigDecimal carrFreqSeq;

    private BigDecimal ncellSeq;

    private BigDecimal pciVal;

    private BigDecimal rsrpVal;

    private BigDecimal rsrqVal;

    public LOGD11W(String workDay, String mdtId, BigDecimal carrFreqSeq, BigDecimal ncellSeq, BigDecimal pciVal, BigDecimal rsrpVal, BigDecimal rsrqVal) {
        this.workDay = workDay;
        this.mdtId = mdtId;
        this.carrFreqSeq = carrFreqSeq;
        this.ncellSeq = ncellSeq;
        this.pciVal = pciVal;
        this.rsrpVal = rsrpVal;
        this.rsrqVal = rsrqVal;
    }

    public LOGD11W() {
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

    public BigDecimal getNcellSeq() {
        return ncellSeq;
    }

    public void setNcellSeq(BigDecimal ncellSeq) {
        this.ncellSeq = ncellSeq;
    }

    public BigDecimal getPciVal() {
        return pciVal;
    }

    public void setPciVal(BigDecimal pciVal) {
        this.pciVal = pciVal;
    }

    public BigDecimal getRsrpVal() {
        return rsrpVal;
    }

    public void setRsrpVal(BigDecimal rsrpVal) {
        this.rsrpVal = rsrpVal;
    }

    public BigDecimal getRsrqVal() {
        return rsrqVal;
    }

    public void setRsrqVal(BigDecimal rsrqVal) {
        this.rsrqVal = rsrqVal;
    }
}