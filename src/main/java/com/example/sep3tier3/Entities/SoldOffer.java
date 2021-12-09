package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "sold_offer")
public class SoldOffer {

    @Id
    @Column(name ="sold_offer_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sold_offer_generator")
    @SequenceGenerator(name = "sold_offer_generator",sequenceName = "sold_offer_seq", allocationSize = 1)
    private Long id;
    private long item_id;
    private long order_id;
    private int sale_price;
    private long seller_wallet_id;


    public SoldOffer() {




    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public int getSale_price() {
        return sale_price;
    }

    public void setSale_price(int sale_price) {
        this.sale_price = sale_price;
    }

    public long getSeller_wallet_id() {
        return seller_wallet_id;
    }

    public void setSeller_wallet_id(long seller_wallet_id) {
        this.seller_wallet_id = seller_wallet_id;
    }
}
