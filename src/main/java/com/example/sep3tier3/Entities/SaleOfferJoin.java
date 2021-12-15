package com.example.sep3tier3.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class SaleOfferJoin {

    @Id
    @NotEmpty
    private long sale_offer_id;
    @NotEmpty

    private String weaponname;
    @NotEmpty

    private String weaponURL;
    @NotEmpty

    private int sale_price;


    public SaleOfferJoin() {


    }


    public SaleOfferJoin(long sale_offer_id, String weaponname, String weaponURL, int sale_price) {
        this.sale_offer_id = sale_offer_id;
        this.weaponname = weaponname;
        this.weaponURL = weaponURL;
        this.sale_price = sale_price;
    }



    public long getSale_offer_id() {
        return sale_offer_id;
    }

    public void setSale_offer_id(long sale_offer_id) {
        this.sale_offer_id = sale_offer_id;
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
