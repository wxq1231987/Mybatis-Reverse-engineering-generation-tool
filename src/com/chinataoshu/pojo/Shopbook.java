package com.chinataoshu.pojo;

public class Shopbook {
    private Integer shopid;

    private Integer bookno;

    private String booktile;

    private Float price;

    private String itemstatus;

    private String frighttemplate;

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getBookno() {
        return bookno;
    }

    public void setBookno(Integer bookno) {
        this.bookno = bookno;
    }

    public String getBooktile() {
        return booktile;
    }

    public void setBooktile(String booktile) {
        this.booktile = booktile == null ? null : booktile.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getItemstatus() {
        return itemstatus;
    }

    public void setItemstatus(String itemstatus) {
        this.itemstatus = itemstatus == null ? null : itemstatus.trim();
    }

    public String getFrighttemplate() {
        return frighttemplate;
    }

    public void setFrighttemplate(String frighttemplate) {
        this.frighttemplate = frighttemplate == null ? null : frighttemplate.trim();
    }
}