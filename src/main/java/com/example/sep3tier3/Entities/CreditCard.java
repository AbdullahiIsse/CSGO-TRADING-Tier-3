package com.example.sep3tier3.Entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "creditcard")
public class CreditCard {

    @Id
    @Column(name ="creditcard_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "creditCard_generator")
    @SequenceGenerator(name = "creditCard_generator",sequenceName = "credit_card_seq", allocationSize = 1)
    private Long id;

    @NotEmpty(message = "name can not be empty")
    @Size(min = 4,message = "name must be more than 3 characters")
    @Size(max = 12, message = "name must be less than 13 characters")
    private String name;
    @NotEmpty(message = "CardNumber can not be empty")
    @Size(min = 16 ,max = 16,message = "CardNumber must contain 16 characters")
    private String cardnumber;

    @NotEmpty(message = "expirationdate can not be empty")
    private String expirationdate;

    @NotEmpty(message = "Securitycode can not be empty")
    @Size(min = 3,max = 3,message = "Securitycode must contain 3 characters")
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
