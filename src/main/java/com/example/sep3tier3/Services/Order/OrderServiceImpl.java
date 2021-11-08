package com.example.sep3tier3.Services.Order;

import com.example.sep3tier3.Dao.OrderRepository;
import com.example.sep3tier3.Entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderRepository orderRepository;


    @Override
    public List<Order> findAll() {

        return orderRepository.findAll();

    }
}
