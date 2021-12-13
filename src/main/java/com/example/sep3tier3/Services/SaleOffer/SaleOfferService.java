package com.example.sep3tier3.Services.SaleOffer;

import com.example.sep3tier3.Entities.Items;
import com.example.sep3tier3.Entities.SaleOffer;
import com.example.sep3tier3.Entities.SaleOfferJoin;

import java.util.List;

public interface SaleOfferService {

    void updateSaleOfferToFalse(long id);


    List<SaleOffer> findAll();

    List<SaleOffer> findOfferByUserId(long id);

    SaleOffer findOfferBySaleOfferId(long id);

    SaleOffer addSaleOffer(SaleOffer saleOffer);

    List<SaleOfferJoin>GetSaleOfferByWalletId(long id);

   void DeleteBySaleOfferId (long id);


}
