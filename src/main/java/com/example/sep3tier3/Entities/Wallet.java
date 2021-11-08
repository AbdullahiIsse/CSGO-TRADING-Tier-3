package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "wallet")
public class Wallet {
    @Id
    @Column(name ="wallet_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wallet_generator")
    @SequenceGenerator(name = "wallet_generator",sequenceName = "wallet_seq", allocationSize = 1)
    private Long id;
    private int price;
    private long user_id;


    public Wallet() {


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
