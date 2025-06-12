package com.pranav.Blog_Post_Backend.controller;

import com.pranav.Blog_Post_Backend.entity.Post;
import com.pranav.Blog_Post_Backend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping
    public List<Post> createPost(@RequestBody List<Post> posts) {
        // logic here
        return postService.createPost(posts);

    }

    @GetMapping
    public List<Post> listPost() {
        // logic here
        return postService.listPost();
    }

    @GetMapping("/{id}")
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
