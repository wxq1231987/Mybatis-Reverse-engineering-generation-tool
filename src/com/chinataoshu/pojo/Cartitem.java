package com.chinataoshu.pojo;

public class Cartitem {
    private Integer cartitemid;

    private Integer cartid;

    private Integer bookno;

    private Integer quantity;

    private Float price;

    public Integer getCartitemid() {
        return cartitemid;
    }

    public void setCartitemid(Integer cartitemid) {
        this.cartitemid = cartitemid;
    }

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getBookno() {
        return bookno;
    }

    public void setBookno(Integer bookno) {
        this.bookno = bookno;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}