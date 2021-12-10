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

    @Query(nativeQuery = true,value = "select sum(sale_price) from shopping_cart join sale_offer so on so.sale_offer_id = shopping_cart.sale_offer_id where user_id = ?1")
    long countTotalPriceById(long userId);




    @Query(nativeQuery = true,value = "DELETE FROM shopping_cart WHERE user_id=?1 and sale_offer_id = ?2")
    void deleteShoppingCart(long user_id,long sale_offer_id);











}
