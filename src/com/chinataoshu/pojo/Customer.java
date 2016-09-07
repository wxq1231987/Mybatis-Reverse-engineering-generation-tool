package com.chinataoshu.pojo;

public class Customer {
    private Integer cusid;

    private String loginid;

    private String loginpwd;

    private String custel;

    private String cusemail;

    private String cusname;

    private Float cusbalance;

    private String alipayaccount;

    private byte[] cusphoto;

    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public String getCustel() {
        return custel;
    }

    public void setCustel(String custel) {
        this.custel = custel == null ? null : custel.trim();
    }

    public String getCusemail() {
        return cusemail;
    }

    public void setCusemail(String cusemail) {
        this.cusemail = cusemail == null ? null : cusemail.trim();
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname == null ? null : cusname.trim();
    }

    public Float getCusbalance() {
        return cusbalance;
    }

    public void setCusbalance(Float cusbalance) {
        this.cusbalance = cusbalance;
    }

    public String getAlipayaccount() {
        return alipayaccount;
    }

    public void setAlipayaccount(String alipayaccount) {
        this.alipayaccount = alipayaccount == null ? null : alipayaccount.trim();
    }

    public byte[] getCusphoto() {
        return cusphoto;
    }

    public void setCusphoto(byte[] cusphoto) {
        this.cusphoto = cusphoto;
    }
}