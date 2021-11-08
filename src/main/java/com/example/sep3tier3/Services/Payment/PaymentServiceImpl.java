package com.example.sep3tier3.Services.Payment;

import com.example.sep3tier3.Dao.PaymentRepository;
import com.example.sep3tier3.Entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;



    public List<Payment> findAll(){

        return paymentRepository.findAll();
    }









}
