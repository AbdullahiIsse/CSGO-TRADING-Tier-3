package com.example.sep3tier3.Controller;

import com.example.sep3tier3.Entities.User;
import com.example.sep3tier3.Services.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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





    @GetMapping("/validate")
    public ResponseEntity<User> validateUser(@RequestParam String username,@RequestParam String password)  {

        User user = null;
        try {
            user = userService.validateUser(username,password);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return  new ResponseEntity<User>(user,HttpStatus.FOUND);

        }

        @PostMapping(consumes = "application/json")
        @ResponseStatus(HttpStatus.CREATED)
        public User addUser(@RequestBody User user){
             return userService.addUser(user);
        }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id){

        userService.DeleteByUserId(id);


    }












}
