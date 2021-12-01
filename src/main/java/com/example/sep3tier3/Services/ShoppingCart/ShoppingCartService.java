package com.example.sep3tier3.Services.ShoppingCart;
import com.example.sep3tier3.Entities.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {



    List<ShoppingCart> findAll();

    long countCartById(long id);




}
