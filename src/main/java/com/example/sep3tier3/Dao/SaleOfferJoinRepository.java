package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.SaleOfferJoin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SaleOfferJoinRepository extends CrudRepository<SaleOfferJoin,Long> {

    @Query(nativeQuery = true,value = "select sale_offer_id,WeaponName,weaponURL,sale_price from sale_offer join allitems a on sale_offer.item_Id = a.item_id where wallet_Id = ?1 ")
    List<SaleOfferJoin>GetSaleOfferByWalletId(long id);













}
