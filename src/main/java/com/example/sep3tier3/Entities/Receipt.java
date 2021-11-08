package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "receipt")
public class Receipt {

    @Id
    @Column(name ="receipt_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "receipt_generator")
    @SequenceGenerator(name = "receipt_generator",sequenceName = "receipt_seq", allocationSize = 1)
    private Long id;
    private String receipt_name;
    private int user_id;

    public Receipt() {


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceipt_name() {
        return receipt_name;
    }

    public void setReceipt_name(String receipt_name) {
        this.receipt_name = receipt_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
