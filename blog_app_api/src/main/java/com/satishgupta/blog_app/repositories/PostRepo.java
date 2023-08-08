package com.satishgupta.blog_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishgupta.blog_app.entities.Category;
import com.satishgupta.blog_app.entities.Post;
import com.satishgupta.blog_app.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer>{

    List<Post> findByUser(User user);

    List<Post> findByCategory(Category category);

    List<Post> findByTitleContaining(String title);

//    @Query("select p from Post p where p.title like :key")
//    List<Post> searchByTitle(@Param("key") String title);
    
}
