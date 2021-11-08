package com.example.sep3tier3.Services.User;

import com.example.sep3tier3.Dao.UserRepository;
import com.example.sep3tier3.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;


    public List<User> findAll() {

        return userRepository.findAll();
    }




}
