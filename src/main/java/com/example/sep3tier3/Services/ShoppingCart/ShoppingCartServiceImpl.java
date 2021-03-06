package com.example.sep3tier3.Services.ShoppingCart;

import com.example.sep3tier3.Dao.ShoppingCartRepository;
import com.example.sep3tier3.Dao.ShoppingCartJoinRepository;
import com.example.sep3tier3.Entities.ShoppingCart;
import com.example.sep3tier3.Entities.ShoppingCartJoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{


    @Autowired
    ShoppingCartRepository shoppingCartRepository;
    @Autowired
    ShoppingCartJoinRepository shoppingCartJoinRepository;

    @Override
    public List<ShoppingCart> findAll() {
        return shoppingCartRepository.findAll();
    }

    @Override
    public long countCartById(long id) {
        return shoppingCartRepository.countShoppingCartByUserId(id);
    }

    @Override
    public List<ShoppingCartJoin> findShoppingCartItemsById(long id) {


        return shoppingCartJoinRepository.GetShopById(id);
    }

    @Override
    public ShoppingCart addShoppingCart(ShoppingCart shoppingCart) {

        return shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public void deleteShoppingCart(long user_id, long sale_offer_id) {

        shoppingCartRepository.deleteShoppingCart(user_id,sale_offer_id);

    }


    public long countTotalPriceById(long id){

        return shoppingCartRepository.countTotalPriceById(id);

    }

}
