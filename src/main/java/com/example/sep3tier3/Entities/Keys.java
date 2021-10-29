package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "keys")
public class Keys {
    @Id
    @Column(name = "key_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "key_generator")
    @SequenceGenerator(name = "key_generator",sequenceName = "key_seq", allocationSize = 1)
    private long id;
    private String keyname;


    public Keys() {


    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }
}
