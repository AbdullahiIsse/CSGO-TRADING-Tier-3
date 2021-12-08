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

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public void setWallet_id(long wallet_id) {
        this.seller_wallet_id = wallet_id;
    }

    public long getOrder_id(){
        return order_id;
    }
    public void setOrder_id(long id){
        this.order_id = id;
    }

    public long getUser_id() {
        //return user_id;
        return 0;
    }

    public void setUser_id(long user_id) {
        //this.user_id = user_id;
    }

    public SoldOffer() {




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

    public long getItem_id() {
        return item_id;
    }
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public long getWallet_id() {
        return seller_wallet_id;
    }
    public void setWallet_id(int wallet_id) {
        this.seller_wallet_id = wallet_id;
    }

}
