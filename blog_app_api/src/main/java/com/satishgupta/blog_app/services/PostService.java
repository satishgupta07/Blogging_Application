package com.satishgupta.blog_app.services;

import java.util.List;

import com.satishgupta.blog_app.payloads.PostDto;

public interface PostService {
    
    // create
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    // update
    PostDto updatePost(PostDto postDto, Integer postId);

    // delete
    void deletePost(Integer postId);

    // get all posts
    List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);

    // get post by id
    PostDto getPostById(Integer postId);

    // get all posts by category
    List<PostDto> getPostsByCategory(Integer categoryId);

    // get all posts by user
    List<PostDto> getPostsByUser(Integer userId);

    // search a post
    List<PostDto> searchPosts(String keyword);
}
