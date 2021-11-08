package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.Items;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemsRepository extends CrudRepository<Items,Long> {

    @Override
    List<Items>findAll();








}
