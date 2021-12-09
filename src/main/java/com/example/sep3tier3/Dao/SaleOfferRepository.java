package com.example.sep3tier3.Dao;


import com.example.sep3tier3.Entities.SaleOffer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SaleOfferRepository extends CrudRepository<SaleOffer,Long> {


    @Override
    List<SaleOffer> findAll();
    

    @Query(nativeQuery = true,value = "select * from sale_offer where wallet_id = ?1")
    List<SaleOffer> findOfferByWallet_id(long id);


}
