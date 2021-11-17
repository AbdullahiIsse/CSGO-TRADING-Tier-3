package com.example.sep3tier3.Services.User;

import com.example.sep3tier3.Entities.User;

import java.util.List;

public interface UserService {


    List<User> findAll();

    User validateUser(String username,String password) throws Exception;

    User addUser(User user);


    void DeleteByUserId(Long id);


}
