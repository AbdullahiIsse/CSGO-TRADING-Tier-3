package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @Column(name = "payment_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_generator")
    @SequenceGenerator(name = "payment_generator",sequenceName = "payment_seq", allocationSize = 1)
    private long id;
    private int price;
    @Column(name = "cardname")
    private String cardName;
    @Column(name = "carddate")
    private String cardDate;
    private long user_id;


    public Payment() {


    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
