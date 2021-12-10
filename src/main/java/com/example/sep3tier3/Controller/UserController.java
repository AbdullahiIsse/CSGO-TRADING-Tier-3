package com.example.sep3tier3.Controller;


import com.example.sep3tier3.Entities.User;
import com.example.sep3tier3.Util.SaveInfo;
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
    public List<User> getAllUsers() {

        return userService.findAll();
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getUserById(@PathVariable("id") long id) {
        return userService.findUserByID(id);
    }

    @GetMapping("/sale/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getUserBySaleOfferId(@PathVariable("id") long id) {
        return userService.getUserBySaleOfferId(id);
    }




    @GetMapping("/validate")
    public ResponseEntity<User> validateUser(@RequestParam String username, @RequestParam String password) {

        User user = null;
        try {
            user = userService.validateUser(username, password);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.FOUND);

    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {

        User user1 = userService.addUser(user);
        SaveInfo.getInstance().setUser(user1);
        return user1;
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {

        userService.DeleteByUserId(id);

    }


    @PatchMapping("/{id}")
    public User UpdateUser(@RequestBody User user, @PathVariable("id") long id) {

        User user1 = userService.findUserByID(id);


        if (user.getUsername() != null) {

            user1.setUsername(user.getUsername());
        }

        if (user.getPassword() != null) {

            user1.setPassword(user.getPassword());
        }

        if (user.getSecuritylevel() != 0) {

            user1.setSecuritylevel(user.getSecuritylevel());
        }

        return userService.addUser(user1);

    }


}
