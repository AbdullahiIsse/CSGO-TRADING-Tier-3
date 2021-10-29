package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "weapon")
public class Weapon {
    @Id
    @Column(name = "weapon_Id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weapon_generator")
    @SequenceGenerator(name = "weapon_generator",sequenceName = "weapon_seq", allocationSize = 1)
    private long id;
    private String weaponname;

    public Weapon() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWeaponname() {
        return weaponname;
    }

    public void setWeaponname(String weaponname) {
        this.weaponname = weaponname;
    }
}
