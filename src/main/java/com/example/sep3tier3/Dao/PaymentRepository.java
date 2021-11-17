package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentRepository extends CrudRepository<Payment,Long> {

    @Override
    List<Payment>findAll();




















}
