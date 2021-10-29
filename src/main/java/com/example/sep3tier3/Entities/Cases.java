package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "cases")
public class Cases {
    @Id
    @Column(name = "case_Id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "case_generator")
    @SequenceGenerator(name = "case_generator",sequenceName = "case_seq", allocationSize = 1)
    private long id;
    private String casename;


    public Cases() {


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCasename() {
        return casename;
    }

    public void setCasename(String casename) {
        this.casename = casename;
    }
}
