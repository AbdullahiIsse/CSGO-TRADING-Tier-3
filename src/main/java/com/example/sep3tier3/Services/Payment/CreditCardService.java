package com.example.sep3tier3.Services.Payment;

import com.example.sep3tier3.Entities.CreditCard;

import java.util.List;

public interface CreditCardService {

    List<CreditCard> findAll();

    CreditCard addPayment(CreditCard creditCard);


    CreditCard findPaymentById(long id);



    CreditCard findPaymentByName(String name);







}
