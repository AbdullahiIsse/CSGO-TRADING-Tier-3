package com.example.sep3tier3.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "sale_offer")
public class  SaleOffer {

    @Id
    @Column(name ="sale_offer_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sale_offer_generator")
    @SequenceGenerator(name = "sale_offer_generator",sequenceName = "sale_offer_seq", allocationSize = 1)
    private long id;

    private long item_id;

    private int sale_price;

    private long wallet_id;


    private boolean available;




    public SaleOffer() {



    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public int getSale_price() {
        return sale_price;
    }

    public void setSale_price(int sale_price) {
        this.sale_price = sale_price;
    }

    public long getWallet_id() {
        return wallet_id;
    }

    public void setWallet_id(long wallet_id) {
        this.wallet_id = wallet_id;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
