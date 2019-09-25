package com.generate.pojo;

import java.util.Date;

public class GStupro {
    private Integer stuproid;

    private Integer stuid;

    private Integer proid;

    private Date joindate;

    private Integer joinstatus;

    private Integer awardstatus;

    public GStupro(Integer stuproid, Integer stuid, Integer proid, Date joindate, Integer joinstatus, Integer awardstatus) {
        this.stuproid = stuproid;
        this.stuid = stuid;
        this.proid = proid;
        this.joindate = joindate;
        this.joinstatus = joinstatus;
        this.awardstatus = awardstatus;
    }

    public GStupro() {
        super();
    }

    public Integer getStuproid() {
        return stuproid;
    }

    public void setStuproid(Integer stuproid) {
        this.stuproid = stuproid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public Integer getJoinstatus() {
        return joinstatus;
    }

    public void setJoinstatus(Integer joinstatus) {
        this.joinstatus = joinstatus;
    }

    public Integer getAwardstatus() {
        return awardstatus;
    }

    public void setAwardstatus(Integer awardstatus) {
        this.awardstatus = awardstatus;
    }
}