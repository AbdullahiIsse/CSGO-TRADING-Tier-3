package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Payment;
import com.example.sep3tier3.Services.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Payment>getAllPayments(){

        return paymentService.findAll();
    }







}
