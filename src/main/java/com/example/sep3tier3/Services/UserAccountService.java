package com.example.sep3tier3.Services;

import com.example.sep3tier3.Dao.UserAccountRepository;
import com.example.sep3tier3.Entities.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountService {


    @Autowired
    UserAccountRepository userAccountRepository;


    public UserAccount save(UserAccount userAccount){

        return userAccountRepository.save(userAccount);
    }

    public List<UserAccount>findAll(){
        return userAccountRepository.findAll();
    }

    public void deleteById(long id){
        userAccountRepository.deleteById(id);
    }


    public UserAccount findById(long id){

        return userAccountRepository.findById(id).get();


    }









}
