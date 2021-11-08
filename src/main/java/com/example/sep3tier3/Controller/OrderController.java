package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Order;
import com.example.sep3tier3.Services.Order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;


    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Order>getAllOrders(){

        return orderService.findAll();
    }



}
