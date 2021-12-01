package com.example.sep3tier3.Services.Wallet;

import com.example.sep3tier3.Entities.Items;
import com.example.sep3tier3.Entities.Wallet;

import java.util.List;

public interface WalletService {

    List<Wallet> findAll();

    Wallet findWalletByID(long id);



}
