package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "sale_offer")
public class SaleOffer {

    @Id
    @Column(name ="sale_offer_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sale_offer_generator")
    @SequenceGenerator(name = "sale_offer_generator",sequenceName = "sale_offer_seq", allocationSize = 1)
    private Long id;
    private int item_id;
    private int sale_price;
    private int wallet_id;


    public SaleOffer() {




    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public int getSale_price() {
        return sale_price;
    }
    public void setSale_price(int id) {
        this.sale_price = id;
    }

    public int getItem_id() {
        return item_id;
    }
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getWallet_id() {
        return wallet_id;
    }
    public void setWallet_id(int wallet_id) {
        this.wallet_id = wallet_id;
    }

}
