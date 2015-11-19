package hello.mybatis.model;

import java.math.BigDecimal;

public class ITEF10W {
    private String workDay;

    private String mdtId;

    private BigDecimal ncellSeq;

    private BigDecimal ncellId;

    private BigDecimal pciVal;

    private BigDecimal carrFreqVal;

    private BigDecimal rsrpVal;

    private BigDecimal rsrqVal;

    public ITEF10W(String workDay, String mdtId, BigDecimal ncellSeq, BigDecimal ncellId, BigDecimal pciVal, BigDecimal carrFreqVal, BigDecimal rsrpVal, BigDecimal rsrqVal) {
        this.workDay = workDay;
        this.mdtId = mdtId;
        this.ncellSeq = ncellSeq;
        this.ncellId = ncellId;
        this.pciVal = pciVal;
        this.carrFreqVal = carrFreqVal;
        this.rsrpVal = rsrpVal;
        this.rsrqVal = rsrqVal;
    }

    public ITEF10W() {
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

    public BigDecimal getNcellSeq() {
        return ncellSeq;
    }

    public void setNcellSeq(BigDecimal ncellSeq) {
        this.ncellSeq = ncellSeq;
    }

    public BigDecimal getNcellId() {
        return ncellId;
    }

    public void setNcellId(BigDecimal ncellId) {
        this.ncellId = ncellId;
    }

    public BigDecimal getPciVal() {
        return pciVal;
    }

    public void setPciVal(BigDecimal pciVal) {
        this.pciVal = pciVal;
    }

    public BigDecimal getCarrFreqVal() {
        return carrFreqVal;
    }

    public void setCarrFreqVal(BigDecimal carrFreqVal) {
        this.carrFreqVal = carrFreqVal;
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