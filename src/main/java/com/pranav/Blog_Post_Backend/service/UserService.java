package com.pranav.Blog_Post_Backend.service;

import com.pranav.Blog_Post_Backend.entity.User;
import com.pranav.Blog_Post_Backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public List<User> createUser(List<User> userList){
        return userRepository.saveAll(userList);
    }

    public List<User> getUser(){
        return userRepository.findAll();
    }

    public Optional<User> getUserByID(Long id){
        return userRepository.findById(id);
    }
}
