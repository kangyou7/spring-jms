package hello.mybatis.model;

import java.math.BigDecimal;

public class M1A201W {
    private String workDay;

    private String mdtId;

    private String enbId;

    private String cellId;

    private String calId;

    private String measTmst;

    private String measId;

    private BigDecimal scellRsrpVal;

    private BigDecimal scellRsrqVal;

    private BigDecimal ncellCnt;

    private String locInfoYn;

    private BigDecimal latSgnVal;

    private BigDecimal latVal;

    private BigDecimal lotVal;

    private BigDecimal altitudeSgnVal;

    private BigDecimal altitudeHght;

    private BigDecimal uncertyVal;

    public M1A201W(String workDay, String mdtId, String enbId, String cellId, String calId, String measTmst, String measId, BigDecimal scellRsrpVal, BigDecimal scellRsrqVal, BigDecimal ncellCnt, String locInfoYn, BigDecimal latSgnVal, BigDecimal latVal, BigDecimal lotVal, BigDecimal altitudeSgnVal, BigDecimal altitudeHght, BigDecimal uncertyVal) {
        this.workDay = workDay;
        this.mdtId = mdtId;
        this.enbId = enbId;
        this.cellId = cellId;
        this.calId = calId;
        this.measTmst = measTmst;
        this.measId = measId;
        this.scellRsrpVal = scellRsrpVal;
        this.scellRsrqVal = scellRsrqVal;
        this.ncellCnt = ncellCnt;
        this.locInfoYn = locInfoYn;
        this.latSgnVal = latSgnVal;
        this.latVal = latVal;
        this.lotVal = lotVal;
        this.altitudeSgnVal = altitudeSgnVal;
        this.altitudeHght = altitudeHght;
        this.uncertyVal = uncertyVal;
    }

    public M1A201W() {
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

    public String getMeasId() {
        return measId;
    }

    public void setMeasId(String measId) {
        this.measId = measId;
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

    public BigDecimal getNcellCnt() {
        return ncellCnt;
    }

    public void setNcellCnt(BigDecimal ncellCnt) {
        this.ncellCnt = ncellCnt;
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