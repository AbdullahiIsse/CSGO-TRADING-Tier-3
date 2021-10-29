package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "sale_offer")
public class Sale_Offer {
    @Id
    @Column(name ="sale_offer_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sale_offer_generator")
    @SequenceGenerator(name = "sale_offer_generator",sequenceName = "sale_offer_seq", allocationSize = 1)
    private long id;
    private String sale_offer;
    private long item_Id;


    public Sale_Offer() {


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSale_offer() {
        return sale_offer;
    }

    public void setSale_offer(String sale_offer) {
        this.sale_offer = sale_offer;
    }

    public long getItem_Id() {
        return item_Id;
    }

    public void setItem_Id(long item_Id) {
        this.item_Id = item_Id;
    }
}
