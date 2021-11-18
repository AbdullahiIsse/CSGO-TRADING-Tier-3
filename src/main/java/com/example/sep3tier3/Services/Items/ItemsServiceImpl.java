package com.example.sep3tier3.Services.Items;

import com.example.sep3tier3.Dao.ItemsRepository;
import com.example.sep3tier3.Entities.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {


    @Autowired
    ItemsRepository itemsRepository;

    @Override
    public List<Items> findAll() {

        return itemsRepository.findAll();
    }
}
