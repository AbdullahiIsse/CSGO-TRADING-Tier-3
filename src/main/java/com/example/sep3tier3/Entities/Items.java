package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "allitems")
public class Items {
    @Id
    @Column(name ="item_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_generator")
    @SequenceGenerator(name = "item_generator",sequenceName = "item_seq", allocationSize = 1)

    private Long id;
    private String weaponname;
    private String weaponURL;


    public Items() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getWeaponname() {
        return weaponname;
    }

    public void setWeaponname(String weaponname) {
        this.weaponname = weaponname;
    }

    public String getWeaponURL() {
        return weaponURL;
    }

    public void setWeaponURL(String weaponURL) {
        this.weaponURL = weaponURL;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", weaponname='" + weaponname + '\'' +
                ", weaponURL='" + weaponURL + '\'' +
                '}';
    }
}
