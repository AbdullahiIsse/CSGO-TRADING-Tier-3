package com.example.sep3tier3.DaoJOIN;

import com.example.sep3tier3.Entities.ShoppingCartJoin;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ShopImpl implements Shop {

    private static ShopImpl daoInstance;

    public static synchronized ShopImpl getInstance(){

        if (daoInstance == null){
            daoInstance = new ShopImpl();
        }
        return daoInstance;
    }


    public List<ShoppingCartJoin> GetShopById(long userId)  {

        try{

            try (Connection connection = daoConnection.getConnection()) {
                PreparedStatement statement = connection.prepareStatement("select so.sale_offer_id,a.item_id ,weaponname,sale_price from shopping_cart inner join sale_offer so on so.sale_offer_id = shopping_cart.sale_offer_id inner join allitems a on a.item_id = so.item_id where user_id = ?");
                statement.setLong(1,userId);
                ResultSet resultSet = statement.executeQuery();

                ArrayList<ShoppingCartJoin> shoppingCartJoinArrayList = new ArrayList<>();
                while (resultSet.next()) {


                    long sale_offer_id = resultSet.getLong("sale_offer_id");
                    long item_id = resultSet.getLong("item_id");

                    String weaponname = resultSet.getString("weaponname");
                    long sale_price = resultSet.getLong("sale_price");



                    ShoppingCartJoin shoppingCartJoin = new ShoppingCartJoin(sale_offer_id,item_id,weaponname,sale_price);

                    shoppingCartJoinArrayList.add(shoppingCartJoin);
                }
                return shoppingCartJoinArrayList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public long countTotalPriceById(long userId)  {

        try{

            try (Connection connection = daoConnection.getConnection()) {
                PreparedStatement statement = connection.prepareStatement("select sum(sale_price) from shopping_cart join sale_offer so on so.sale_offer_id = shopping_cart.sale_offer_id where user_id = ?");
                statement.setLong(1,userId);
                ResultSet resultSet = statement.executeQuery();

                resultSet.next();

                long count = resultSet.getLong("sum") ;


                   return count;


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }




















}
