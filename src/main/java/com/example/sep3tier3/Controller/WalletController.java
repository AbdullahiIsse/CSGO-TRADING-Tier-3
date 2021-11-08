package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Wallet;
import com.example.sep3tier3.Services.Wallet.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    WalletService walletService;



    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Wallet> getAllWallets(){

        return walletService.findAll();
    }











}
