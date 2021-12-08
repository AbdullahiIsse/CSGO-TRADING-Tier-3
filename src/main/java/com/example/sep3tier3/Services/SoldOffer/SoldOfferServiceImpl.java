package com.example.sep3tier3.Services.SoldOffer;

import com.example.sep3tier3.Dao.SoldOfferRepository;
import com.example.sep3tier3.Dao.WalletRepository;
import com.example.sep3tier3.Entities.SoldOffer;
import com.example.sep3tier3.Entities.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldOfferServiceImpl implements SoldOfferService {

    @Autowired
    SoldOfferRepository soldOfferRepository;



    public List<SoldOffer>findAll(){
        return soldOfferRepository.findAll();
    }

    @Override
    public SoldOffer findSoldOfferById(long id) {
        return soldOfferRepository.findById(id).get();
    }

    @Override
    public SoldOffer addSoldOffer(SoldOffer saleOffer) {
        return soldOfferRepository.save(saleOffer);
    }


}
