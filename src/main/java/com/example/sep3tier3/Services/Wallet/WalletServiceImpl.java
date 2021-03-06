package com.example.sep3tier3.Services.Wallet;

import com.example.sep3tier3.Dao.WalletRepository;
import com.example.sep3tier3.Entities.Items;
import com.example.sep3tier3.Entities.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    WalletRepository walletRepository;


    public List<Wallet>findAll(){


        return walletRepository.findAll();
    }

    @Override
    public Wallet findWalletByID(long id) {
        return walletRepository.findById(id).get();
    }

    @Override
    public long sumOfPrice(long paymentId) {
        return walletRepository.sumOfPrice(paymentId);
    }


    public Wallet addWallet(Wallet wallet){
        return walletRepository.save(wallet);
    }

    @Override
    public Wallet findWalletsById(long id) {
        return walletRepository.findWalletsById(id);
    }




}
