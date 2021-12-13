package com.example.sep3tier3.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderJoin {

    @Id
    private Long order_id;

    private String weaponname;

    private String weaponURL;

    private int sale_price;


    public OrderJoin() {

    }

    public OrderJoin(Long order_id, String weaponname, String weaponURL, int sale_price) {
        this.order_id = order_id;
        this.weaponname = weaponname;
        this.weaponURL = weaponURL;
        this.sale_price = sale_price;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long id) {
        this.order_id = id;
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
