package com.example.sep3tier3.Services.Order;

import com.example.sep3tier3.Entities.Order;

import java.util.List;

public interface OrderService {


    List<Order>findAll();

    Order findOrderByID(long id);
    Order addOrder(Order o);


}
