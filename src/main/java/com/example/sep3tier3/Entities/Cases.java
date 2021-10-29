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
    private String caseName;


    public Cases() {


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }
}
