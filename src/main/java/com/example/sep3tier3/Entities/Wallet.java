package com.example.sep3tier3.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "wallet")
public class Wallet {
    @Id
    @Column(name = "wallet_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wallet_generator")
    @SequenceGenerator(name = "wallet_generator", sequenceName = "wallet_seq", allocationSize = 1)
    private Long id;

    private int balance;

    private long creditcard_id;

    private long user_id;


    public Wallet() {







    }


    public Wallet(int balance, long creditcard_id, long user_id) {
        this.balance = balance;
        this.creditcard_id = creditcard_id;
        this.user_id = user_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getCreditcard_id() {
        return creditcard_id;
    }

    public void setCreditcard_id(long creditcard_id) {
        this.creditcard_id = creditcard_id;
    }
}
