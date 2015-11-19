package hello.mybatis.model;

import java.math.BigDecimal;

public class LOGD01W {
    private String workDay;

    private String mdtId;

    private String enbId;

    private String cellId;

    private String calId;

    private String measTmst;

    private BigDecimal scellRsrpVal;

    private BigDecimal scellRsrqVal;

    private String eutranNcellInfoYn;

    private BigDecimal eutranNcellCarrFreqCnt;

    private String utranNcellInfoYn;

    private BigDecimal utranNcellCarrFreqCnt;

    private String geranNcellInfoYn;

    private BigDecimal geranNcellCnt;

    private String trcRefYn;

    private String userPlmnId;

    private String trcPlmnId;

    private String trcId;

    private BigDecimal trsrVal;

    private String locInfoYn;

    private BigDecimal latSgnVal;

    private BigDecimal latVal;

    private BigDecimal lotVal;

    private BigDecimal altitudeSgnVal;

    private BigDecimal altitudeHght;

    private BigDecimal uncertyVal;

    public LOGD01W(String workDay, String mdtId, String enbId, String cellId, String calId, String measTmst, BigDecimal scellRsrpVal, BigDecimal scellRsrqVal, String eutranNcellInfoYn, BigDecimal eutranNcellCarrFreqCnt, String utranNcellInfoYn, BigDecimal utranNcellCarrFreqCnt, String geranNcellInfoYn, BigDecimal geranNcellCnt, String trcRefYn, String userPlmnId, String trcPlmnId, String trcId, BigDecimal trsrVal, String locInfoYn, BigDecimal latSgnVal, BigDecimal latVal, BigDecimal lotVal, BigDecimal altitudeSgnVal, BigDecimal altitudeHght, BigDecimal uncertyVal) {
        this.workDay = workDay;
        this.mdtId = mdtId;
        this.enbId = enbId;
        this.cellId = cellId;
        this.calId = calId;
        this.measTmst = measTmst;
        this.scellRsrpVal = scellRsrpVal;
        this.scellRsrqVal = scellRsrqVal;
        this.eutranNcellInfoYn = eutranNcellInfoYn;
        this.eutranNcellCarrFreqCnt = eutranNcellCarrFreqCnt;
        this.utranNcellInfoYn = utranNcellInfoYn;
        this.utranNcellCarrFreqCnt = utranNcellCarrFreqCnt;
        this.geranNcellInfoYn = geranNcellInfoYn;
        this.geranNcellCnt = geranNcellCnt;
        this.trcRefYn = trcRefYn;
        this.userPlmnId = userPlmnId;
        this.trcPlmnId = trcPlmnId;
        this.trcId = trcId;
        this.trsrVal = trsrVal;
        this.locInfoYn = locInfoYn;
        this.latSgnVal = latSgnVal;
        this.latVal = latVal;
        this.lotVal = lotVal;
        this.altitudeSgnVal = altitudeSgnVal;
        this.altitudeHght = altitudeHght;
        this.uncertyVal = uncertyVal;
    }

    public LOGD01W() {
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

    public String getEutranNcellInfoYn() {
        return eutranNcellInfoYn;
    }

    public void setEutranNcellInfoYn(String eutranNcellInfoYn) {
        this.eutranNcellInfoYn = eutranNcellInfoYn;
    }

    public BigDecimal getEutranNcellCarrFreqCnt() {
        return eutranNcellCarrFreqCnt;
    }

    public void setEutranNcellCarrFreqCnt(BigDecimal eutranNcellCarrFreqCnt) {
        this.eutranNcellCarrFreqCnt = eutranNcellCarrFreqCnt;
    }

    public String getUtranNcellInfoYn() {
        return utranNcellInfoYn;
    }

    public void setUtranNcellInfoYn(String utranNcellInfoYn) {
        this.utranNcellInfoYn = utranNcellInfoYn;
    }

    public BigDecimal getUtranNcellCarrFreqCnt() {
        return utranNcellCarrFreqCnt;
    }

    public void setUtranNcellCarrFreqCnt(BigDecimal utranNcellCarrFreqCnt) {
        this.utranNcellCarrFreqCnt = utranNcellCarrFreqCnt;
    }

    public String getGeranNcellInfoYn() {
        return geranNcellInfoYn;
    }

    public void setGeranNcellInfoYn(String geranNcellInfoYn) {
        this.geranNcellInfoYn = geranNcellInfoYn;
    }

    public BigDecimal getGeranNcellCnt() {
        return geranNcellCnt;
    }

    public void setGeranNcellCnt(BigDecimal geranNcellCnt) {
        this.geranNcellCnt = geranNcellCnt;
    }

    public String getTrcRefYn() {
        return trcRefYn;
    }

    public void setTrcRefYn(String trcRefYn) {
        this.trcRefYn = trcRefYn;
    }

    public String getUserPlmnId() {
        return userPlmnId;
    }

    public void setUserPlmnId(String userPlmnId) {
        this.userPlmnId = userPlmnId;
    }

    public String getTrcPlmnId() {
        return trcPlmnId;
    }

    public void setTrcPlmnId(String trcPlmnId) {
        this.trcPlmnId = trcPlmnId;
    }

    public String getTrcId() {
        return trcId;
    }

    public void setTrcId(String trcId) {
        this.trcId = trcId;
    }

    public BigDecimal getTrsrVal() {
        return trsrVal;
    }

    public void setTrsrVal(BigDecimal trsrVal) {
        this.trsrVal = trsrVal;
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