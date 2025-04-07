package com.example.Food.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Food.Entity.User;
import com.example.Food.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser (User user) {
        // You can add password encryption here
        return userRepository.save(user);
    }
}