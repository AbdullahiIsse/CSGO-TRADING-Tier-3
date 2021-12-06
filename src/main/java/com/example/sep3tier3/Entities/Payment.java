package com.example.sep3tier3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @Column(name ="payment_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_generator")
    @SequenceGenerator(name = "payment_generator",sequenceName = "payment_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String cardnumber;
    private String expirationdate;
    private String securitycode;
    private long user_id;

    public Payment() {
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
        return "Payment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardNumber='" + cardnumber + '\'' +
                ", expirationDate='" + expirationdate + '\'' +
                ", securityCode='" + securitycode + '\'' +
                '}';
    }
}
