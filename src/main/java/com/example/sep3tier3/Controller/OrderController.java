package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Order;
import com.example.sep3tier3.Services.Order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Order addOrder(@RequestBody Order o){
        return orderService.addOrder(o);
    }


}
