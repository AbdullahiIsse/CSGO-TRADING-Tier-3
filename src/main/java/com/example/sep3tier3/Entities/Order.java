package com.example.sep3tier3.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(name ="order_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_generator")
    @SequenceGenerator(name = "order_generator",sequenceName = "orders_seq", allocationSize = 1)
    private Long id;
    @NotEmpty
    private long wallet_buyer_id;
    @NotEmpty
    private long sale_id;


    public Order() {



    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getWallet_buyer_id() {
        return wallet_buyer_id;
    }

    public void setWallet_buyer_id(long wallet_buyer_id) {
        this.wallet_buyer_id = wallet_buyer_id;
    }

    public long getSale_id() {
        return sale_id;
    }

    public void setSale_id(long sale_id) {
        this.sale_id = sale_id;
    }
}
