package com.pranav.Blog_Post_Backend.repository;

import com.pranav.Blog_Post_Backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {



}
