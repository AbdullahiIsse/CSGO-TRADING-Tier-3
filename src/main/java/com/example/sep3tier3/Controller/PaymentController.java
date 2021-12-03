package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Payment;
import com.example.sep3tier3.Services.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Payment addPayment(@RequestBody Payment payment){
        return paymentService.addPayment(payment);
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Payment getPaymentByUserId(@PathVariable("id") long id){

        return paymentService.findPaymentByUserId(id);
    }








}
