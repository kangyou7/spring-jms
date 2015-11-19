package hello.mybatis.model;

public class LOG003L {
    private String workDay;

    private String pgmNm;

    private String errConts;

    private String deftGbnCd;

    private String smsYn;

    private String smsMsgConts;

    public LOG003L(String workDay, String pgmNm, String errConts, String deftGbnCd, String smsYn, String smsMsgConts) {
        this.workDay = workDay;
        this.pgmNm = pgmNm;
        this.errConts = errConts;
        this.deftGbnCd = deftGbnCd;
        this.smsYn = smsYn;
        this.smsMsgConts = smsMsgConts;
    }

    public LOG003L() {
        super();
    }

    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    public String getPgmNm() {
        return pgmNm;
    }

    public void setPgmNm(String pgmNm) {
        this.pgmNm = pgmNm;
    }

    public String getErrConts() {
        return errConts;
    }

    public void setErrConts(String errConts) {
        this.errConts = errConts;
    }

    public String getDeftGbnCd() {
        return deftGbnCd;
    }

    public void setDeftGbnCd(String deftGbnCd) {
        this.deftGbnCd = deftGbnCd;
    }

    public String getSmsYn() {
        return smsYn;
    }

    public void setSmsYn(String smsYn) {
        this.smsYn = smsYn;
    }

    public String getSmsMsgConts() {
        return smsMsgConts;
    }

    public void setSmsMsgConts(String smsMsgConts) {
        this.smsMsgConts = smsMsgConts;
    }
}