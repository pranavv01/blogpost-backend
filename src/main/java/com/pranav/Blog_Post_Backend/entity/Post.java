package com.pranav.Blog_Post_Backend.model;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Post {
    private String title;
    private String content;
    private int date;

    public Post(String title, String content, int date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
