package com.example.sep3tier3.Entities;

import java.io.Serializable;

public class ShoppingCartId implements Serializable {

    private long saleOfferId;

    private long userId;



    public ShoppingCartId() {


    }

    public ShoppingCartId(long saleOfferId, long userId) {
        this.saleOfferId = saleOfferId;
        this.userId = userId;
    }


    public long getSaleOfferId() {
        return saleOfferId;
    }

    public void setSaleOfferId(long saleOfferId) {
        this.saleOfferId = saleOfferId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
