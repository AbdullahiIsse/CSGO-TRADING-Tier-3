package com.example.sep3tier3.Dao;


import com.example.sep3tier3.Entities.SaleOffer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SaleOfferRepository extends CrudRepository<SaleOffer,Long> {


    @Override
    List<SaleOffer> findAll();

}
