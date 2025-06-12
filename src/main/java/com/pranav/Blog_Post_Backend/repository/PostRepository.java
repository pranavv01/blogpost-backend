package com.pranav.Blog_Post_Backend.repository;

import com.pranav.Blog_Post_Backend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {



}
