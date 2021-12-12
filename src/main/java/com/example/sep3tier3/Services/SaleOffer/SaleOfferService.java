package com.example.sep3tier3.Services.SaleOffer;

import com.example.sep3tier3.Entities.Items;
import com.example.sep3tier3.Entities.SaleOffer;

import java.util.List;

public interface SaleOfferService {


    List<SaleOffer> findAll();

    List<SaleOffer> findOfferByUserId(long id);

    SaleOffer findOfferBySaleOfferId(long id);

    SaleOffer addSaleOffer(SaleOffer saleOffer);

   void DeleteBySaleOfferId (long id);

    void setAvaliablity(long id, boolean status);
}
