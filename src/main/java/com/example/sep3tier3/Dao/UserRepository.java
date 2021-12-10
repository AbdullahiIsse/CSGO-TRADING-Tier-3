package com.example.sep3tier3.Dao;


import com.example.sep3tier3.Entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

    @Override
    List<User> findAll();

    User findByUsernameAndPassword(String username,String password);

    User deleteUserById(User id);

    @Query(nativeQuery = true,value = "select w.user_id,username,password,securitylevel from sale_offer join wallet w on w.wallet_Id = sale_offer.wallet_Id join user_accounts ua on ua.user_id = w.user_id where sale_offer_id = ?1")
    User getUserBySaleOfferId(long id);





}
