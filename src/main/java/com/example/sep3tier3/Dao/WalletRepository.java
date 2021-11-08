package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.Wallet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WalletRepository extends CrudRepository<Wallet,Long> {

    @Override
    List<Wallet> findAll();



}
