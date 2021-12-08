package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.Order;
import com.example.sep3tier3.Entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order,Long> {

    @Override
    List<Order> findAll();

    @Query(nativeQuery = true,value = "select * from orders where sale_id = ?1")
    Order findBySaleId(long id);




}
