package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.SaleOffer;
import com.example.sep3tier3.Entities.SoldOffer;
import com.example.sep3tier3.Services.SaleOffer.SaleOfferService;
import com.example.sep3tier3.Services.SoldOffer.SoldOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/soldoffer")
public class SoldOfferController {


    @Autowired
    SoldOfferService soldOfferService;

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<SoldOffer>getAllSoldOffers(){
        return soldOfferService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public SoldOffer findSoldOfferById(@PathVariable("id") long id){
        return soldOfferService.findSoldOfferById(id);
    }


    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public SoldOffer addSoldOffer(@RequestBody SoldOffer soldOffer) {
        return soldOfferService.addSoldOffer(soldOffer);
    }
}
