package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.Wallet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WalletRepository extends CrudRepository<Wallet,Long> {

    @Override
    List<Wallet> findAll();

    @Query(nativeQuery = true,value = "select * from wallet where payment_id = ?1")
    Wallet findWalletsById(long id);

    @Query(nativeQuery = true,value = "select sum(price) from wallet where payment_id = ?1")
    long sumOfPrice(long paymentId);






}
