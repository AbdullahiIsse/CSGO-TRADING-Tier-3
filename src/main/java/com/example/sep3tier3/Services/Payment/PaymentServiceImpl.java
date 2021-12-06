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

    @Override
    public Payment addPayment(Payment payment) {

        return paymentRepository.save(payment);
    }

    @Override
    public Payment findPaymentByUserId(long id) {

        return paymentRepository.findPaymentByUser_id(id);
    }


}
