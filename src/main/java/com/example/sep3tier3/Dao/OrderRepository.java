package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.Order;
import com.example.sep3tier3.Entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order,Long> {

    @Override
    List<Order> findAll();




}
