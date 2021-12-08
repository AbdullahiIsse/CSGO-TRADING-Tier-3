package com.example.sep3tier3.Services.SaleOffer;

import com.example.sep3tier3.Dao.SaleOfferRepository;
import com.example.sep3tier3.Entities.Items;
import com.example.sep3tier3.Entities.SaleOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleOfferServiceImpl implements SaleOfferService {


    @Autowired
    SaleOfferRepository saleOfferRepository;


    @Override
    public List<SaleOffer> findAll() {

        return saleOfferRepository.findAll();
    }

    @Override
    public SaleOffer findOfferById(long id) {
        return saleOfferRepository.findOfferByWallet_id(id);
    }

    @Override
    public SaleOffer addSaleOffer(SaleOffer saleOffer) {
        return saleOfferRepository.save(saleOffer);
    }

}
