package com.example.sep3tier3.Entities;


import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class ShoppingCartJoin {

    @Id
    @NotEmpty
    private long sale_offer_id;
    @NotEmpty

    private long item_id;
    @NotEmpty

    private String weaponname;
    @NotEmpty

    private long sale_price;


    public ShoppingCartJoin() {

    }

    public ShoppingCartJoin(long sale_offer_id, long item_id, String weaponname, long sale_price) {
        this.sale_offer_id = sale_offer_id;
        this.item_id = item_id;
        this.weaponname = weaponname;
        this.sale_price = sale_price;
    }


    public long getSale_offer_id() {
        return sale_offer_id;
    }

    public void setSale_offer_id(long sale_offer_id) {
        this.sale_offer_id = sale_offer_id;
    }

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public String getWeaponname() {
        return weaponname;
    }

    public void setWeaponname(String weaponname) {
        this.weaponname = weaponname;
    }

    public long getSale_price() {
        return sale_price;
    }

    public void setSale_price(long sale_price) {
        this.sale_price = sale_price;
    }

    @Override
    public String toString() {
        return "ShoppingCartJoin{" +
                "sale_offer_id=" + sale_offer_id +
                ", item_id=" + item_id +
                ", weaponname='" + weaponname + '\'' +
                ", sale_price=" + sale_price +
                '}';
    }
}
