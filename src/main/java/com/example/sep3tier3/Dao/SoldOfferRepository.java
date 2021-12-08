package com.example.sep3tier3.Dao;


import com.example.sep3tier3.Entities.SaleOffer;
import com.example.sep3tier3.Entities.SoldOffer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SoldOfferRepository extends CrudRepository<SoldOffer,Long> {


    @Override
    List<SoldOffer> findAll();



}
