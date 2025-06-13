package com.pranav.Blog_Post_Backend.service;

import com.pranav.Blog_Post_Backend.entity.Post;
import com.pranav.Blog_Post_Backend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public List<Post> createPost(List<Post> posts){
        return postRepository.saveAll(posts);
    }

    public List<Post> listPost(){
        return postRepository.findAll();
    }

    public List<Post> getPostById(Long postid){
        return postRepository.findByPostid(postid);
    }


}
