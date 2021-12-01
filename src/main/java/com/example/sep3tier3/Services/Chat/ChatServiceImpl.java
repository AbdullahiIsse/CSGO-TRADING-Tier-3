package com.example.sep3tier3.Services.Chat;

import com.example.sep3tier3.Dao.ChatRepository;
import com.example.sep3tier3.Dao.UserRepository;
import com.example.sep3tier3.Entities.Chat;
import com.example.sep3tier3.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChatServiceImpl implements ChatService{


    @Autowired
    ChatRepository chatRepository;


    public List<Chat> findAll() {

        return chatRepository.findAll();
    }

    @Override
    public Chat findChatByID(long id) {
        return chatRepository.findById(id).get();
    }

    @Override
    public Chat addchat(Chat chat) {

        return chatRepository.save(chat);
    }
}
