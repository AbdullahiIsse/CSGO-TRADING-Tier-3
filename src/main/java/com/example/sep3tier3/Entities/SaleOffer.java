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
    private String sale_offer_name;
    private int wallet_id;


    public SaleOffer() {


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSale_offer_name() {
        return sale_offer_name;
    }

    public void setSale_offer_name(String sale_offer_name) {
        this.sale_offer_name = sale_offer_name;
    }

    public int getWallet_id() {
        return wallet_id;
    }

    public void setWallet_id(int wallet_id) {
        this.wallet_id = wallet_id;
    }





}
