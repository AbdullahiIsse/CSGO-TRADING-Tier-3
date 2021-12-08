package com.example.sep3tier3.Services.SaleOffer;
import com.example.sep3tier3.Entities.Chat;
import com.example.sep3tier3.Entities.Items;
import com.example.sep3tier3.Entities.SaleOffer;

import java.util.List;

public interface SaleOfferService {


    List<SaleOffer> findAll();

    SaleOffer findOfferById(long id);

    SaleOffer addSaleOffer(SaleOffer saleOffer);


}
