package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "player_model")
public class Player_Model {
    @Id
    @Column(name = "player_model_Id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_model_generator")
    @SequenceGenerator(name = "player_model_generator",sequenceName = "player_model_seq", allocationSize = 1)
    private long id;
    private String modelname;


    public Player_Model() {


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }
}