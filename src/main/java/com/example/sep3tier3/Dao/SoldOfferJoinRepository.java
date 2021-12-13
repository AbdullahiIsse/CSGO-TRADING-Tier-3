package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.SoldOfferJoin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SoldOfferJoinRepository extends CrudRepository<SoldOfferJoin,Long> {


    @Query(nativeQuery = true,value = "select sold_offer_id,WeaponName,weaponURL,sale_price from sold_offer  join allitems a on sold_offer.item_Id = a.item_id join wallet w on w.wallet_Id = sold_offer.seller_wallet_Id join user_accounts ua on ua.user_id = w.user_id where seller_wallet_Id = ?1 ")
    List<SoldOfferJoin>GetSoldItemsById(long id);









}
