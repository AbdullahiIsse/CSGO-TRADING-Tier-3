package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.OrderJoin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderJoinRepository extends CrudRepository<OrderJoin,Long> {


    @Query(nativeQuery = true,value = "select order_id,WeaponName,weaponURL,sale_price from orders join sale_offer so on so.sale_offer_id = orders.sale_id join allitems a on so.item_Id = a.item_id join wallet w on w.wallet_Id = orders.wallet_buyer_id join user_accounts ua on ua.user_id = w.user_id where wallet_buyer_id = ?1 ")
    List<OrderJoin>GetBoughtItems(long id);










}
