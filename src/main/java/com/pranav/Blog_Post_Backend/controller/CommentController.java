package com.pranav.Blog_Post_Backend.controller;

import com.pranav.Blog_Post_Backend.entity.Comment;
import com.pranav.Blog_Post_Backend.service.CommentService;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping
    public List<Comment> addComment(@RequestBody Comment comments){
        return commentService.getComment((comments));
   }

   @GetMapping("/comments/byPost/{postId}")
   public void getAllComment(){

   }
   @DeleteMapping("/comments/{id}")
   public void deleteComment(){

   }
}
