package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "creditcard")
public class CreditCard {

    @Id
    @Column(name ="creditcard_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "creditCard_generator")
    @SequenceGenerator(name = "creditCard_generator",sequenceName = "credit_card_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String cardnumber;
    private String expirationdate;
    private String securitycode;


    public CreditCard() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(String expirationdate) {
        this.expirationdate = expirationdate;
    }

    public String getSecuritycode() {
        return securitycode;
    }

    public void setSecuritycode(String securitycode) {
        this.securitycode = securitycode;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardNumber='" + cardnumber + '\'' +
                ", expirationDate='" + expirationdate + '\'' +
                ", securityCode='" + securitycode + '\'' +
                '}';
    }
}
