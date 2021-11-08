package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.User;
import com.example.sep3tier3.Services.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<User>getAllUsers(){

        return userService.findAll();
    }






}