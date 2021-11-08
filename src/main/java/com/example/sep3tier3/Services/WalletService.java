package com.example.sep3tier3.Services;

import com.example.sep3tier3.Dao.WalletRepository;
import com.example.sep3tier3.Entities.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletService implements IWalletService{

    @Autowired
    WalletRepository walletRepository;


    public List<Wallet>findAll(){


        return walletRepository.findAll();
    }








}
