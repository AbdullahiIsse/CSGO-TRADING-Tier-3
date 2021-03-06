package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Items;
import com.example.sep3tier3.Entities.ShoppingCart;
import com.example.sep3tier3.Entities.ShoppingCartJoin;
import com.example.sep3tier3.Entities.User;
import com.example.sep3tier3.Services.ShoppingCart.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    @Autowired
    ShoppingCartService shoppingCartService;


    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<ShoppingCart> getAllCarts() {

        return shoppingCartService.findAll();
    }



    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public long getCartCountById(@PathVariable("id") long id){

        return shoppingCartService.countCartById(id);
    }


    @GetMapping("/shop/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<ShoppingCartJoin> getCartById(@PathVariable("id") long id){

        return shoppingCartService.findShoppingCartItemsById(id);
    }


    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ShoppingCart addShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        return shoppingCartService.addShoppingCart(shoppingCart);
    }


    @GetMapping("/price/{id}")
    @ResponseStatus(HttpStatus.OK)
    public long getTotalPriceById(@PathVariable("id") long id){

        return shoppingCartService.countTotalPriceById(id);
    }


    @DeleteMapping("/{user_id}/{sale_offer_id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteShoppingCart(@PathVariable("user_id") long user_id, @PathVariable("sale_offer_id") long sale_offer_id ){
        try {
            shoppingCartService.deleteShoppingCart(user_id,sale_offer_id);
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }








}
