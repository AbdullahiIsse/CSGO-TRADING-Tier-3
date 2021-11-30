package com.example.sep3tier3.Services.ShoppingCart;

import com.example.sep3tier3.Dao.SaleOfferRepository;
import com.example.sep3tier3.Dao.ShoppingCartRepository;
import com.example.sep3tier3.Entities.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{


    @Autowired
    ShoppingCartRepository shoppingCartRepository;


    @Override
    public List<ShoppingCart> findAll() {
        return shoppingCartRepository.findAll();
    }

    @Override
    public long countCartById(long id) {
        return shoppingCartRepository.countShoppingCartByUserId(id);
    }
}
