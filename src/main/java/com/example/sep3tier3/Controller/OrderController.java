package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Order;
import com.example.sep3tier3.Entities.OrderJoin;
import com.example.sep3tier3.Entities.SoldOffer;
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

    @GetMapping("/wallet_buyer_id/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Order> findOrderByWalletBuyerId(@PathVariable("id") long id){
        return orderService.findOrderByWalletBuyerId(id);
    }

   /* @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Order getOrderById(@PathVariable("id") long id){
        return orderService.findOrderByID(id);
    }*/

    @GetMapping("/saleid/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Order getOrderBySaleId(@PathVariable("id") long id){
        return orderService.findOrderBySaleId(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Order addOrder(@RequestBody Order o){
        return orderService.addOrder(o);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<OrderJoin> GetBoughtItems(@PathVariable("id") long id){

        return orderService.GetBoughtItems(id);
    }


}
