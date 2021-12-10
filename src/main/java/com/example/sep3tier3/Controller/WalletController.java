package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Order;
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
    public List<Wallet> getAllWallets() {

        return walletService.findAll();
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Wallet getWalletById(@PathVariable("id") long id) {
        return walletService.findWalletsById(id);
    }

    @GetMapping("/price/{id}")
    @ResponseStatus(HttpStatus.OK)
    public long sumOfPrice(@PathVariable("id") long id) {

        return walletService.sumOfPrice(id);
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Wallet addWallet(@RequestBody Wallet wallet) {
        return walletService.addWallet(wallet);
    }

    @PatchMapping("/{id}")
    public Wallet UpdatePriceByPaymentId(@RequestBody Wallet wallet,@PathVariable("id") long id){

       Wallet wallets = walletService.findWalletsById(id);


       if (wallet.getBalance() != 0){

           wallets.setBalance(wallet.getBalance());
       }

       return walletService.addWallet(wallets);


    }







}
