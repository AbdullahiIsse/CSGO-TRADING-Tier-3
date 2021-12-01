package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Items;
import com.example.sep3tier3.Entities.ShoppingCart;
import com.example.sep3tier3.Entities.User;
import com.example.sep3tier3.Services.ShoppingCart.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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






}
