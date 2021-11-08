package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.SaleOffer;
import com.example.sep3tier3.Services.SaleOffer.SaleOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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










}
