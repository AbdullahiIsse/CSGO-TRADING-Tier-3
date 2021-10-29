package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_generator")
    @SequenceGenerator(name = "order_generator",sequenceName = "order_seq", allocationSize = 1)
    private long id;
    private String orders;
    private long item_Id;


    public Orders() {



    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public long getItem_Id() {
        return item_Id;
    }

    public void setItem_Id(long item_Id) {
        this.item_Id = item_Id;
    }
}
