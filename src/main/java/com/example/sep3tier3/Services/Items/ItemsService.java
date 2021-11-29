package com.example.sep3tier3.Services.Items;

import com.example.sep3tier3.Entities.Items;

import java.util.List;

public interface ItemsService {

    List<Items> findAll();

    Items findItemByID(long id);


}
