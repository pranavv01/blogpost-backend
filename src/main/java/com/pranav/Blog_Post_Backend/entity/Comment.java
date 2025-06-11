package com.pranav.Blog_Post_Backend.model;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Comment {
    private String comment;
    private int date;

    public Comment(String comment, int date){
        this.comment = comment;
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
