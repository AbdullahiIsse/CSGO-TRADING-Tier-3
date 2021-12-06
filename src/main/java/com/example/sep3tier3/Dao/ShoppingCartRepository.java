package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.ShoppingCart;
import com.example.sep3tier3.Entities.ShoppingCartJoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.persistence.TypedQuery;
import java.util.List;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart,Long> {

    @Override
    List<ShoppingCart> findAll();

    long countShoppingCartByUserId(long id);









}
