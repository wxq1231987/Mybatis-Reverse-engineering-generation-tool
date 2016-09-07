package com.chinataoshu.pojo;

public class Order {
    private String orderid;

    private Integer cusid;

    private Integer bookno;

    private String ispad;

    private String isdelivery;

    private String isevaluated;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    public Integer getBookno() {
        return bookno;
    }

    public void setBookno(Integer bookno) {
        this.bookno = bookno;
    }

    public String getIspad() {
        return ispad;
    }

    public void setIspad(String ispad) {
        this.ispad = ispad == null ? null : ispad.trim();
    }

    public String getIsdelivery() {
        return isdelivery;
    }

    public void setIsdelivery(String isdelivery) {
        this.isdelivery = isdelivery == null ? null : isdelivery.trim();
    }

    public String getIsevaluated() {
        return isevaluated;
    }

    public void setIsevaluated(String isevaluated) {
        this.isevaluated = isevaluated == null ? null : isevaluated.trim();
    }
}