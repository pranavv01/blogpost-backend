package com.pranav.Blog_Post_Backend.controller;

import jakarta.persistence.OneToMany;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class CommentController {
    @PostMapping("/comments")
    public void addComment(){

   }
   @OneToMany
   @GetMapping("/comments/byPost/{postId}")
   public void getAllComment(){

   }
   @DeleteMapping("/comments/{id}")
   public void deleteComment(){

   }
}
