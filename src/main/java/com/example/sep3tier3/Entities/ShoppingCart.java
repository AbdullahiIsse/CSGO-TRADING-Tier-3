package com.example.sep3tier3.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@IdClass(ShoppingCartId.class)
@Table(name = "shopping_cart")
public class ShoppingCart   {

    @Id
    @Column(name ="sale_offer_id")

    private long saleOfferId;

    @Id
    @Column(name ="user_id")

    private long userId;


    public ShoppingCart() {


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
