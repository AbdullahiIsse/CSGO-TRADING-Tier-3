package com.example.sep3tier3.Services.Receipt;

import com.example.sep3tier3.Dao.ReceiptRepository;
import com.example.sep3tier3.Entities.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptServiceImpl implements ReceiptService {


    @Autowired
    ReceiptRepository receiptRepository;


    public List<Receipt>findAll(){

        return receiptRepository.findAll();
    }





}
