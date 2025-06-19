package com.pranav.Blog_Post_Backend.service;

import com.pranav.Blog_Post_Backend.entity.Comment;
import com.pranav.Blog_Post_Backend.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public List<Comment> getComment(List<Comment> comments){
        return commentRepository.saveAll(comments);
    }
}
