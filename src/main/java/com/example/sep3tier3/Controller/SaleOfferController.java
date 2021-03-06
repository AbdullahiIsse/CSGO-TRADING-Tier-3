package com.example.sep3tier3.Controller;


import com.example.sep3tier3.Entities.SaleOffer;
import com.example.sep3tier3.Entities.SaleOfferJoin;
import com.example.sep3tier3.Entities.Wallet;
import com.example.sep3tier3.Services.SaleOffer.SaleOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;

@RestController
@RequestMapping("/saleoffer")
public class SaleOfferController {


    @Autowired
    SaleOfferService saleOfferService;

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<SaleOffer>getAllSaleOffers(){

        return saleOfferService.findAll();

    }

    @GetMapping("/user/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<SaleOffer> findOfferByUserId(@PathVariable("id") long id){
        return saleOfferService.findOfferByUserId(id);
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public SaleOffer findOfferBySaleOfferId(@PathVariable("id") long id){
        return saleOfferService.findOfferBySaleOfferId(id);
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public SaleOffer addSaleOffer(@RequestBody SaleOffer saleOffer) {
        return saleOfferService.addSaleOffer(saleOffer);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) {
        saleOfferService.DeleteBySaleOfferId(id);
    }


    @PutMapping ("/{id}")
    public void updateSaleOfferToFalse(@PathVariable("id") long id){
        try {
             saleOfferService.updateSaleOfferToFalse(id);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }

    }

    @GetMapping("/wallet/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<SaleOfferJoin> GetSaleOfferByWalletId(@PathVariable("id") long id){

        return saleOfferService.GetSaleOfferByWalletId(id);
    }

    @PatchMapping("/{id}")
    public SaleOffer UpdateSaleOffer(@RequestBody SaleOffer saleOffer, @PathVariable("id") long id){

        SaleOffer offer = saleOfferService.findOfferBySaleOfferId(id);


        if (saleOffer.getSale_price()!= 0){

            offer.setSale_price(saleOffer.getSale_price());
        }

        if (saleOffer.getAvailable()!= false){
            offer.setAvailable(saleOffer.getAvailable());
        }


        return saleOfferService.addSaleOffer(offer);


    }




}
