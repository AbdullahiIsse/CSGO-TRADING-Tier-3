package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Items;
import com.example.sep3tier3.Entities.Wallet;
import com.example.sep3tier3.Services.Wallet.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Wallet findWalletById(@PathVariable("id") long id){
        return walletService.findWalletByID(id);
    }











}
