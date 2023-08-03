package com.satishgupta.blog_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishgupta.blog_app.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    
}
