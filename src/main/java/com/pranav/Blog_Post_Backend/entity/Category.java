package com.pranav.Blog_Post_Backend.model;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Category {
    private String title;
    private String description;

    public Category(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
