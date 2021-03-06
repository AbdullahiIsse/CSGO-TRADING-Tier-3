package com.example.sep3tier3.Services.ShoppingCart;
import com.example.sep3tier3.Entities.ShoppingCart;
import com.example.sep3tier3.Entities.ShoppingCartJoin;

import java.util.List;

public interface ShoppingCartService {


    List<ShoppingCart> findAll();

    long countCartById(long id);

    List<ShoppingCartJoin> findShoppingCartItemsById(long id);

    ShoppingCart addShoppingCart(ShoppingCart shoppingCart);

    void deleteShoppingCart(long user_id,long sale_offer_id);

     long countTotalPriceById(long id);











}
