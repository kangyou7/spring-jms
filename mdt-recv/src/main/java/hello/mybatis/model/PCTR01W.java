package hello.mybatis.model;

import java.math.BigDecimal;

public class PCTR01W {
    private String workDay;

    private String mdtId;

    private String enbId;

    private String cellId;

    private String calId;

    private String measTmst;

    private String mmeAsgnUeS1apId;

    private String enbAsgnUeS1apId;

    private BigDecimal trsrVal;

    private String trcId;

    public PCTR01W(String workDay, String mdtId, String enbId, String cellId, String calId, String measTmst, String mmeAsgnUeS1apId, String enbAsgnUeS1apId, BigDecimal trsrVal, String trcId) {
        this.workDay = workDay;
        this.mdtId = mdtId;
        this.enbId = enbId;
        this.cellId = cellId;
        this.calId = calId;
        this.measTmst = measTmst;
        this.mmeAsgnUeS1apId = mmeAsgnUeS1apId;
        this.enbAsgnUeS1apId = enbAsgnUeS1apId;
        this.trsrVal = trsrVal;
        this.trcId = trcId;
    }

    public PCTR01W() {
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

    public String getMmeAsgnUeS1apId() {
        return mmeAsgnUeS1apId;
    }

    public void setMmeAsgnUeS1apId(String mmeAsgnUeS1apId) {
        this.mmeAsgnUeS1apId = mmeAsgnUeS1apId;
    }

    public String getEnbAsgnUeS1apId() {
        return enbAsgnUeS1apId;
    }

    public void setEnbAsgnUeS1apId(String enbAsgnUeS1apId) {
        this.enbAsgnUeS1apId = enbAsgnUeS1apId;
    }

    public BigDecimal getTrsrVal() {
        return trsrVal;
    }

    public void setTrsrVal(BigDecimal trsrVal) {
        this.trsrVal = trsrVal;
    }

    public String getTrcId() {
        return trcId;
    }

    public void setTrcId(String trcId) {
        this.trcId = trcId;
    }
}