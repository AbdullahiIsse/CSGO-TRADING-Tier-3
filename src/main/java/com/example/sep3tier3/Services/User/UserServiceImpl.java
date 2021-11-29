package com.example.sep3tier3.Services.User;

import com.example.sep3tier3.Dao.UserRepository;
import com.example.sep3tier3.Entities.User;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;


    public List<User> findAll() {

        return userRepository.findAll();
    }

    @Override
    public User validateUser(String username, String password) throws Exception {

        User users = userRepository.findByUsernameAndPassword(username, password);
        if (users == null){
            throw new Exception("user not found");
        }

        return users;

    }

    @Override
    public User addUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public void DeleteByUserId(Long id) {

        userRepository.deleteById(id);
    }


}
