package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Items;
import com.example.sep3tier3.Services.Items.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    ItemsService itemsService;

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)

    public List<Items>getAllItems(){
        return itemsService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Items getItemById(@PathVariable("id") long id){
        return itemsService.findItemByID(id);
    }
}
