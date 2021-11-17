package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.Receipt;
import com.example.sep3tier3.Services.Receipt.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/receipt")
public class ReceiptController {


    @Autowired
    ReceiptService receiptService;


    @GetMapping
    @ResponseStatus(HttpStatus.CONFLICT)
    public  List<Receipt>getAllReceipts(){

        return receiptService.findAll();
    }




}
