package com.example.sep3tier3.Services.Order;

import com.example.sep3tier3.Dao.OrderJoinRepository;
import com.example.sep3tier3.Dao.OrderRepository;
import com.example.sep3tier3.Entities.Items;
import com.example.sep3tier3.Entities.Order;
import com.example.sep3tier3.Entities.OrderJoin;
import com.example.sep3tier3.Entities.SoldOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderJoinRepository orderJoinRepository;


    @Override
    public List<Order> findAll() {

        return orderRepository.findAll();

    }

    @Override
    public List<Order> findOrderByWalletBuyerId(long id) {
        return orderRepository.findOrderByWalletBuyerId(id);
    }



    @Override
    public Order findOrderByID(long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public Order addOrder(Order o) {
        return orderRepository.save(o);
    }

    @Override
    public Order findOrderBySaleId(long id) {
        return orderRepository.findBySaleId(id);
    }

    @Override
    public List<OrderJoin> GetBoughtItems(long id) {
        return orderJoinRepository.GetBoughtItems(id);
    }
}
