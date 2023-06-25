package id.contools.dto.masterdata.mail.temporary;

public class temporaryRequest {
    private Integer tempId;
    private String mailTemp;
    private Integer status;

    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public String getMailTemp() {
        return mailTemp;
    }

    public void setMailTemp(String mailTemp) {
        this.mailTemp = mailTemp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
