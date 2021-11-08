package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.Receipt;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReceiptRepository extends CrudRepository<Receipt,Long> {

    @Override
    List<Receipt> findAll();




}
