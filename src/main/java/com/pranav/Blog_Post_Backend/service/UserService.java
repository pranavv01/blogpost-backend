package com.pranav.Blog_Post_Backend.service;

import com.pranav.Blog_Post_Backend.entity.User;
import com.pranav.Blog_Post_Backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public List<User> createUser(){
        List <User> userList = new ArrayList<>();
        userList.add(new User(1L, "Pranav Anand", "Pranavvanandd@gmail.com"));
        return userRepository.saveAll(userList);
    }
}
