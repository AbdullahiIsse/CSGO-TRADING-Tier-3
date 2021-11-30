package com.example.sep3tier3.Services.Chat;

import com.example.sep3tier3.Entities.Chat;

import java.util.List;

public interface ChatService {


    List<Chat> findAll();

    Chat findChatByID(long id);

}
