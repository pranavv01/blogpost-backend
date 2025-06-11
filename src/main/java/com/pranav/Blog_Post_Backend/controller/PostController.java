package com.pranav.Blog_Post_Backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PostController {

    @PostMapping("/posts")
    public void createPost() {
        // logic here
    }

    @GetMapping("/posts")
    public void listPost() {
        // logic here
    }

    @GetMapping("/post/{id}")
    public void getPostByID(@PathVariable int id) {
        // logic here
    }

    @GetMapping("/posts/byUser/{userId}")
    public void getPostByUser(@PathVariable int userId) {
        // logic here
    }

    @GetMapping("/posts/byCategory/{categoryId}")
    public void getAllPostCategory(@PathVariable int categoryId) {
        // logic here
    }

    @PutMapping("/posts/{id}")
    public void updatePost(@PathVariable int id) {
        // logic here
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable int id) {
        // logic here
    }
}
