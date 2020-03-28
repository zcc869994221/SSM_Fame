package com.bjsxt.pojo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author ZhangHaoyu
 * @description
 * @date 2020/3/27 14:14
 */
@Component
public class Email implements Serializable {

    private int eid;
    private String etitle;
    private String ecno;
    private String filename;
    private int recid;
    private int sendid;

    @DateTimeFormat(pattern = "yyyy-MM-ss")
    private Date edate;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Email{" +
                "eid=" + eid +
                ", etitle='" + etitle + '\'' +
                ", ecno='" + ecno + '\'' +
                ", filename='" + filename + '\'' +
                ", recid=" + recid +
                ", sendid=" + sendid +
                ", edate=" + edate +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEtitle() {
        return etitle;
    }

    public void setEtitle(String etitle) {
        this.etitle = etitle;
    }

    public String getEecno() {
        return ecno;
    }

    public void setEecno(String ecno) {
        this.ecno = ecno;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getRecid() {
        return recid;
    }

    public void setRecid(int recid) {
        this.recid = recid;
    }

    public int getSendid() {
        return sendid;
    }

    public void setSendid(int sendid) {
        this.sendid = sendid;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    public Email() {}

    public Email(int eid, String etitle, String ecno, String filename, int recid, int sendid, Date edate) {
        this.eid = eid;
        this.etitle = etitle;
        this.ecno = ecno;
        this.filename = filename;
        this.recid = recid;
        this.sendid = sendid;
        this.edate = edate;
    }
}
