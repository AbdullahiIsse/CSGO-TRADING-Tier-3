package com.example.sep3tier3.Controller;


import com.example.sep3tier3.Entities.Chat;
import com.example.sep3tier3.Entities.User;
import com.example.sep3tier3.Services.Chat.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    ChatService chatService;

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Chat> getAllChat(){

        return chatService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Chat getChatById(@PathVariable("id") long id){
        return chatService.findChatByID(id); }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Chat addChat(@RequestBody Chat chat) {
        return chatService.addchat(chat);
    }


}
