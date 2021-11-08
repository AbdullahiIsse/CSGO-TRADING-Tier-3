package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "allitems")
public class Items {
    @Id
    @Column(name ="item_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_generator")
    @SequenceGenerator(name = "item_generator",sequenceName = "item_seq", allocationSize = 1)
    private Long id;
    private String weaponname;
    private String modelname;
    private String keyname;
    private String casename;
    private String ItemType;
    private int sale_offer_id;
    private int order_id;
    private int payment_id;


    public Items() {




    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeaponname() {
        return weaponname;
    }

    public void setWeaponname(String weaponname) {
        this.weaponname = weaponname;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    public String getCasename() {
        return casename;
    }

    public void setCasename(String casename) {
        this.casename = casename;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String itemType) {
        ItemType = itemType;
    }

    public int getSale_offer_id() {
        return sale_offer_id;
    }

    public void setSale_offer_id(int sale_offer_id) {
        this.sale_offer_id = sale_offer_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }
}
