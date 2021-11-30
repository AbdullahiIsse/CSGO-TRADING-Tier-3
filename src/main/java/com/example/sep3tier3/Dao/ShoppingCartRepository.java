package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart,Long> {

    @Override
    List<ShoppingCart> findAll();

    long countShoppingCartByUserId(long id);







}
