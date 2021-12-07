package com.example.sep3tier3.Services.Payment;

import com.example.sep3tier3.Dao.CreditCardRepository;
import com.example.sep3tier3.Entities.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
    CreditCardRepository creditCardRepository;

    public List<CreditCard> findAll(){

        return creditCardRepository.findAll();
    }

    @Override
    public CreditCard addPayment(CreditCard creditCard) {

        return creditCardRepository.save(creditCard);
    }

    @Override
    public CreditCard findPaymentById(long id) {

        return creditCardRepository.findCreditCardById(id);
    }

    @Override
    public CreditCard findPaymentByName(String name) {

        return creditCardRepository.findCreditCardByName(name);



    }


}
