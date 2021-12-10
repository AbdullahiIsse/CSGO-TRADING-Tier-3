package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.ShoppingCartJoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ShoppingCartJoinRepository extends CrudRepository<ShoppingCartJoin,Long> {




    @Query(nativeQuery = true,value = "select  so.sale_offer_id, a.item_id,a.weaponname, so.sale_price "
            + " from shopping_cart inner join sale_offer so on so.sale_offer_id = shopping_cart.sale_offer_id inner join allitems a on a.item_id = so.item_id where user_id = ?1")
    List<ShoppingCartJoin> GetShopById(long userId);




}
