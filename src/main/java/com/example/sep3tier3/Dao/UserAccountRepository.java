package com.example.sep3tier3.Dao;

import com.example.sep3tier3.Entities.UserAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserAccountRepository extends CrudRepository<UserAccount,Long> {


  @Override
  public List<UserAccount> findAll();




  UserAccount findByUsername(@Param("username") String username);








}
