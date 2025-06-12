package com.pranav.Blog_Post_Backend.controller;

import com.pranav.Blog_Post_Backend.entity.User;
import com.pranav.Blog_Post_Backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public List<User> createUser(@RequestBody List<User> userList) {
        System.out.println("Inside controller. Received list size: " + userList.size());
        return userService.createUser(userList);
    }
    @GetMapping
    public List<User> getUser(){
        return userService.getUser();
    }
    @GetMapping("/{id}")
    public Optional<User> getUserInfo(@PathVariable Long id){
        return userService.getUserByID(id);
    }

}
