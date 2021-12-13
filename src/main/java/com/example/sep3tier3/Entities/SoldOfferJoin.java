package com.example.sep3tier3.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SoldOfferJoin {

    @Id
    private long sold_offer_id;

    private String weaponname;

    private String weaponURL;

    private int sale_price;


    public SoldOfferJoin() {


    }

    public SoldOfferJoin(long sold_offer_id, String weaponname, String weaponURL, int sale_price) {
        this.sold_offer_id = sold_offer_id;
        this.weaponname = weaponname;
        this.weaponURL = weaponURL;
        this.sale_price = sale_price;
    }


    public long getSold_offer_id() {
        return sold_offer_id;
    }

    public void setSold_offer_id(long sold_offer_id) {
        this.sold_offer_id = sold_offer_id;
    }

    public String getWeaponname() {
        return weaponname;
    }

    public void setWeaponname(String weaponname) {
        this.weaponname = weaponname;
    }

    public String getWeaponURL() {
        return weaponURL;
    }

    public void setWeaponURL(String weaponURL) {
        this.weaponURL = weaponURL;
    }

    public int getSale_price() {
        return sale_price;
    }

    public void setSale_price(int sale_price) {
        this.sale_price = sale_price;
    }
}
