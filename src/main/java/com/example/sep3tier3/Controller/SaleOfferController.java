package com.example.sep3tier3.Controller;


import com.example.sep3tier3.Entities.SaleOffer;
import com.example.sep3tier3.Services.SaleOffer.SaleOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


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
}
