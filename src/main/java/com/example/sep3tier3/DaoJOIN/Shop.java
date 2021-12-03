package com.example.sep3tier3.DaoJOIN;

import com.example.sep3tier3.Entities.ShoppingCartJoin;

import java.util.List;

public interface Shop {


    List<ShoppingCartJoin> GetShopById(long userId);

    long countTotalPriceById(long userId);


}
