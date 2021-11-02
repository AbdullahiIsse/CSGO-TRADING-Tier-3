package com.example.sep3tier3.Entities;

import com.example.sep3tier3.Dao.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Items {
    @Id
    @Column(name = "item_Id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_generator")
    @SequenceGenerator(name = "item_generator",sequenceName = "item_seq", allocationSize = 1)
    private long id;

    private long weapon_Id;

    private long player_model_Id;

    private long key_id;

    private long case_Id;


    public Items() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWeapon_Id() {
        return weapon_Id;
    }

    public void setWeapon_Id(long weapon_Id) {
        this.weapon_Id = weapon_Id;
    }

    public long getPlayer_model_Id() {
        return player_model_Id;
    }

    public void setPlayer_model_Id(long player_model_Id) {
        this.player_model_Id = player_model_Id;
    }

    public long getKey_id() {
        return key_id;
    }

    public void setKey_id(long key_id) {
        this.key_id = key_id;
    }

    public long getCase_Id() {
        return case_Id;
    }

    public void setCase_Id(long case_Id) {
        this.case_Id = case_Id;
    }
}
