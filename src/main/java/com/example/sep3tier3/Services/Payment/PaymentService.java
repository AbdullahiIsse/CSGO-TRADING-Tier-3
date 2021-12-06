package com.example.sep3tier3.Services.Payment;

import com.example.sep3tier3.Entities.Payment;

import java.util.List;

public interface PaymentService {

    List<Payment> findAll();

    Payment addPayment(Payment payment);


    Payment findPaymentByUserId(long id);
}
