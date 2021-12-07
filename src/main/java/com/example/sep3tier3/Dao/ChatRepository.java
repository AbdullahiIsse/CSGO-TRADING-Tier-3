package com.example.sep3tier3.Dao;


import com.example.sep3tier3.Entities.Chat;
import com.example.sep3tier3.Entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChatRepository extends CrudRepository<Chat,Long> {



    @Override
    List<Chat> findAll();



   
}
