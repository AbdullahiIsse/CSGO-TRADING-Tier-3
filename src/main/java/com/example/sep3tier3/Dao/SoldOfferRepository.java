package com.example.sep3tier3.Dao;


import com.example.sep3tier3.Entities.SaleOffer;
import com.example.sep3tier3.Entities.SoldOffer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SoldOfferRepository extends CrudRepository<SoldOffer,Long> {


    @Override
    List<SoldOffer> findAll();

    @Query(nativeQuery = true,value = "select * from sold_offer where order_id = ?1")
    SoldOffer findSoldOfferByOrderId(long id);

    @Query(nativeQuery = true,value = "select * from sold_offer where seller_wallet_id = ?1")
    List<SoldOffer> findSoldOfferBySellerWalletId(long id);




}
