package com.generate.pojo;

public class GStudent {
    private Integer stuid;

    private String stuname;

    private String stupic;

    private String stusex;

    private String stutel;

    private String stuschool;

    private String stugrade;

    private String stuaddr;

    private String stuemail;

    private String stucode;

    private String stupass;

    private Integer stustatus;

    public GStudent(Integer stuid, String stuname, String stupic, String stusex, String stutel, String stuschool, String stugrade, String stuaddr, String stuemail, String stucode, String stupass, Integer stustatus) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stupic = stupic;
        this.stusex = stusex;
        this.stutel = stutel;
        this.stuschool = stuschool;
        this.stugrade = stugrade;
        this.stuaddr = stuaddr;
        this.stuemail = stuemail;
        this.stucode = stucode;
        this.stupass = stupass;
        this.stustatus = stustatus;
    }

    public GStudent() {
        super();
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getStupic() {
        return stupic;
    }

    public void setStupic(String stupic) {
        this.stupic = stupic == null ? null : stupic.trim();
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex == null ? null : stusex.trim();
    }

    public String getStutel() {
        return stutel;
    }

    public void setStutel(String stutel) {
        this.stutel = stutel == null ? null : stutel.trim();
    }

    public String getStuschool() {
        return stuschool;
    }

    public void setStuschool(String stuschool) {
        this.stuschool = stuschool == null ? null : stuschool.trim();
    }

    public String getStugrade() {
        return stugrade;
    }

    public void setStugrade(String stugrade) {
        this.stugrade = stugrade == null ? null : stugrade.trim();
    }

    public String getStuaddr() {
        return stuaddr;
    }

    public void setStuaddr(String stuaddr) {
        this.stuaddr = stuaddr == null ? null : stuaddr.trim();
    }

    public String getStuemail() {
        return stuemail;
    }

    public void setStuemail(String stuemail) {
        this.stuemail = stuemail == null ? null : stuemail.trim();
    }

    public String getStucode() {
        return stucode;
    }

    public void setStucode(String stucode) {
        this.stucode = stucode == null ? null : stucode.trim();
    }

    public String getStupass() {
        return stupass;
    }

    public void setStupass(String stupass) {
        this.stupass = stupass == null ? null : stupass.trim();
    }

    public Integer getStustatus() {
        return stustatus;
    }

    public void setStustatus(Integer stustatus) {
        this.stustatus = stustatus;
    }
}