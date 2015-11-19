package hello.mybatis.model;

import java.math.BigDecimal;

public class RCEF01W {
    private String workDay;

    private String mdtId;

    private String enbId;

    private String cellId;

    private String calId;

    private String measTmst;

    private BigDecimal failCellId;

    private BigDecimal scellRsrpVal;

    private BigDecimal scellRsrqVal;

    private BigDecimal txPrmbCnt;

    private BigDecimal connDetcFlagVal;

    private BigDecimal maxTxpwFlagVal;

    private BigDecimal failMeasTimeVal;

    private BigDecimal eutranNcellVldFlagVal;

    private BigDecimal eutranNcellCarrFreqCnt;

    private BigDecimal utranNcellVldFlagVal;

    private BigDecimal utranNcellCarrFreqCnt;

    private BigDecimal geranNcellVldFlagVal;

    private BigDecimal geranNcellCnt;

    private String locInfoYn;

    private BigDecimal latSgnVal;

    private BigDecimal latVal;

    private BigDecimal lotVal;

    private BigDecimal altitudeSgnVal;

    private BigDecimal altitudeHght;

    private BigDecimal uncertyVal;

    public RCEF01W(String workDay, String mdtId, String enbId, String cellId, String calId, String measTmst, BigDecimal failCellId, BigDecimal scellRsrpVal, BigDecimal scellRsrqVal, BigDecimal txPrmbCnt, BigDecimal connDetcFlagVal, BigDecimal maxTxpwFlagVal, BigDecimal failMeasTimeVal, BigDecimal eutranNcellVldFlagVal, BigDecimal eutranNcellCarrFreqCnt, BigDecimal utranNcellVldFlagVal, BigDecimal utranNcellCarrFreqCnt, BigDecimal geranNcellVldFlagVal, BigDecimal geranNcellCnt, String locInfoYn, BigDecimal latSgnVal, BigDecimal latVal, BigDecimal lotVal, BigDecimal altitudeSgnVal, BigDecimal altitudeHght, BigDecimal uncertyVal) {
        this.workDay = workDay;
        this.mdtId = mdtId;
        this.enbId = enbId;
        this.cellId = cellId;
        this.calId = calId;
        this.measTmst = measTmst;
        this.failCellId = failCellId;
        this.scellRsrpVal = scellRsrpVal;
        this.scellRsrqVal = scellRsrqVal;
        this.txPrmbCnt = txPrmbCnt;
        this.connDetcFlagVal = connDetcFlagVal;
        this.maxTxpwFlagVal = maxTxpwFlagVal;
        this.failMeasTimeVal = failMeasTimeVal;
        this.eutranNcellVldFlagVal = eutranNcellVldFlagVal;
        this.eutranNcellCarrFreqCnt = eutranNcellCarrFreqCnt;
        this.utranNcellVldFlagVal = utranNcellVldFlagVal;
        this.utranNcellCarrFreqCnt = utranNcellCarrFreqCnt;
        this.geranNcellVldFlagVal = geranNcellVldFlagVal;
        this.geranNcellCnt = geranNcellCnt;
        this.locInfoYn = locInfoYn;
        this.latSgnVal = latSgnVal;
        this.latVal = latVal;
        this.lotVal = lotVal;
        this.altitudeSgnVal = altitudeSgnVal;
        this.altitudeHght = altitudeHght;
        this.uncertyVal = uncertyVal;
    }

    public RCEF01W() {
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

    public String getEnbId() {
        return enbId;
    }

    public void setEnbId(String enbId) {
        this.enbId = enbId;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public String getCalId() {
        return calId;
    }

    public void setCalId(String calId) {
        this.calId = calId;
    }

    public String getMeasTmst() {
        return measTmst;
    }

    public void setMeasTmst(String measTmst) {
        this.measTmst = measTmst;
    }

    public BigDecimal getFailCellId() {
        return failCellId;
    }

    public void setFailCellId(BigDecimal failCellId) {
        this.failCellId = failCellId;
    }

    public BigDecimal getScellRsrpVal() {
        return scellRsrpVal;
    }

    public void setScellRsrpVal(BigDecimal scellRsrpVal) {
        this.scellRsrpVal = scellRsrpVal;
    }

    public BigDecimal getScellRsrqVal() {
        return scellRsrqVal;
    }

    public void setScellRsrqVal(BigDecimal scellRsrqVal) {
        this.scellRsrqVal = scellRsrqVal;
    }

    public BigDecimal getTxPrmbCnt() {
        return txPrmbCnt;
    }

    public void setTxPrmbCnt(BigDecimal txPrmbCnt) {
        this.txPrmbCnt = txPrmbCnt;
    }

    public BigDecimal getConnDetcFlagVal() {
        return connDetcFlagVal;
    }

    public void setConnDetcFlagVal(BigDecimal connDetcFlagVal) {
        this.connDetcFlagVal = connDetcFlagVal;
    }

    public BigDecimal getMaxTxpwFlagVal() {
        return maxTxpwFlagVal;
    }

    public void setMaxTxpwFlagVal(BigDecimal maxTxpwFlagVal) {
        this.maxTxpwFlagVal = maxTxpwFlagVal;
    }

    public BigDecimal getFailMeasTimeVal() {
        return failMeasTimeVal;
    }

    public void setFailMeasTimeVal(BigDecimal failMeasTimeVal) {
        this.failMeasTimeVal = failMeasTimeVal;
    }

    public BigDecimal getEutranNcellVldFlagVal() {
        return eutranNcellVldFlagVal;
    }

    public void setEutranNcellVldFlagVal(BigDecimal eutranNcellVldFlagVal) {
        this.eutranNcellVldFlagVal = eutranNcellVldFlagVal;
    }

    public BigDecimal getEutranNcellCarrFreqCnt() {
        return eutranNcellCarrFreqCnt;
    }

    public void setEutranNcellCarrFreqCnt(BigDecimal eutranNcellCarrFreqCnt) {
        this.eutranNcellCarrFreqCnt = eutranNcellCarrFreqCnt;
    }

    public BigDecimal getUtranNcellVldFlagVal() {
        return utranNcellVldFlagVal;
    }

    public void setUtranNcellVldFlagVal(BigDecimal utranNcellVldFlagVal) {
        this.utranNcellVldFlagVal = utranNcellVldFlagVal;
    }

    public BigDecimal getUtranNcellCarrFreqCnt() {
        return utranNcellCarrFreqCnt;
    }

    public void setUtranNcellCarrFreqCnt(BigDecimal utranNcellCarrFreqCnt) {
        this.utranNcellCarrFreqCnt = utranNcellCarrFreqCnt;
    }

    public BigDecimal getGeranNcellVldFlagVal() {
        return geranNcellVldFlagVal;
    }

    public void setGeranNcellVldFlagVal(BigDecimal geranNcellVldFlagVal) {
        this.geranNcellVldFlagVal = geranNcellVldFlagVal;
    }

    public BigDecimal getGeranNcellCnt() {
        return geranNcellCnt;
    }

    public void setGeranNcellCnt(BigDecimal geranNcellCnt) {
        this.geranNcellCnt = geranNcellCnt;
    }

    public String getLocInfoYn() {
        return locInfoYn;
    }

    public void setLocInfoYn(String locInfoYn) {
        this.locInfoYn = locInfoYn;
    }

    public BigDecimal getLatSgnVal() {
        return latSgnVal;
    }

    public void setLatSgnVal(BigDecimal latSgnVal) {
        this.latSgnVal = latSgnVal;
    }

    public BigDecimal getLatVal() {
        return latVal;
    }

    public void setLatVal(BigDecimal latVal) {
        this.latVal = latVal;
    }

    public BigDecimal getLotVal() {
        return lotVal;
    }

    public void setLotVal(BigDecimal lotVal) {
        this.lotVal = lotVal;
    }

    public BigDecimal getAltitudeSgnVal() {
        return altitudeSgnVal;
    }

    public void setAltitudeSgnVal(BigDecimal altitudeSgnVal) {
        this.altitudeSgnVal = altitudeSgnVal;
    }

    public BigDecimal getAltitudeHght() {
        return altitudeHght;
    }

    public void setAltitudeHght(BigDecimal altitudeHght) {
        this.altitudeHght = altitudeHght;
    }

    public BigDecimal getUncertyVal() {
        return uncertyVal;
    }

    public void setUncertyVal(BigDecimal uncertyVal) {
        this.uncertyVal = uncertyVal;
    }
}