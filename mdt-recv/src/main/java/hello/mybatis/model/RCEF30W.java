package hello.mybatis.model;

import java.math.BigDecimal;

public class RCEF30W {
    private String workDay;

    private String mdtId;

    private BigDecimal ncellSeq;

    private String nwColorCd;

    private String btsColorCd;

    private BigDecimal arfcnVal;

    private BigDecimal bandIndVal;

    private BigDecimal rssiVal;

    public RCEF30W(String workDay, String mdtId, BigDecimal ncellSeq, String nwColorCd, String btsColorCd, BigDecimal arfcnVal, BigDecimal bandIndVal, BigDecimal rssiVal) {
        this.workDay = workDay;
        this.mdtId = mdtId;
        this.ncellSeq = ncellSeq;
        this.nwColorCd = nwColorCd;
        this.btsColorCd = btsColorCd;
        this.arfcnVal = arfcnVal;
        this.bandIndVal = bandIndVal;
        this.rssiVal = rssiVal;
    }

    public RCEF30W() {
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

    public String getNwColorCd() {
        return nwColorCd;
    }

    public void setNwColorCd(String nwColorCd) {
        this.nwColorCd = nwColorCd;
    }

    public String getBtsColorCd() {
        return btsColorCd;
    }

    public void setBtsColorCd(String btsColorCd) {
        this.btsColorCd = btsColorCd;
    }

    public BigDecimal getArfcnVal() {
        return arfcnVal;
    }

    public void setArfcnVal(BigDecimal arfcnVal) {
        this.arfcnVal = arfcnVal;
    }

    public BigDecimal getBandIndVal() {
        return bandIndVal;
    }

    public void setBandIndVal(BigDecimal bandIndVal) {
        this.bandIndVal = bandIndVal;
    }

    public BigDecimal getRssiVal() {
        return rssiVal;
    }

    public void setRssiVal(BigDecimal rssiVal) {
        this.rssiVal = rssiVal;
    }
}