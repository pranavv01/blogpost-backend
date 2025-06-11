package com.pranav.Blog_Post_Backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class CategoryController {
    @PostMapping("/categories")
    public void newCategory(){

    }
    @GetMapping("/categories")
    public void getCategory(){

    }
    @GetMapping("/categories/{id}")
    public void getSpecificCategory(){

    }
    @PutMapping("/categories/{id}")
    public void updateCategory(){

    }
    @DeleteMapping("/categories/{id}")
    public void deleteCategory(){

    }


}
