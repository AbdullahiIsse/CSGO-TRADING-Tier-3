package com.example.sep3tier3.Services.Order;

import com.example.sep3tier3.Entities.Order;
import com.example.sep3tier3.Entities.SoldOffer;

import java.util.List;

public interface OrderService {


    List<Order>findAll();

    List<Order> findOrderByWalletBuyerId(long id);


    Order findOrderByID(long id);
    Order addOrder(Order o);

    Order findOrderBySaleId(long id);
}
