package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.UserAccount;
import com.example.sep3tier3.Services.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserAccountController {

    @Autowired
    UserAccountService userAccountService;



    @GetMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<UserAccount>getAllUsers(){

        return userAccountService.findAll();

    }












}
