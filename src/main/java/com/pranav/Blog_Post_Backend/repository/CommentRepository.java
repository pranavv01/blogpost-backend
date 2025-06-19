package com.pranav.Blog_Post_Backend.repository;

import com.pranav.Blog_Post_Backend.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
