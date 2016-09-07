package com.chinataoshu.pojo;

public class SellerWithBLOBs extends Seller {
    private byte[] cardphoto;

    private byte[] photo;

    public byte[] getCardphoto() {
        return cardphoto;
    }

    public void setCardphoto(byte[] cardphoto) {
        this.cardphoto = cardphoto;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}