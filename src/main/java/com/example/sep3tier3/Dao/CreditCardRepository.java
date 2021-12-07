package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.CreditCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CreditCardRepository extends CrudRepository<CreditCard,Long> {

    @Override
    List<CreditCard>findAll();



    CreditCard findCreditCardById(long id);

    CreditCard findCreditCardByName(String name);




















}
