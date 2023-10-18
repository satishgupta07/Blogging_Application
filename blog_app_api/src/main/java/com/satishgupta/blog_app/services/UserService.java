package com.satishgupta.blog_app.services;

import java.util.List;

import com.satishgupta.blog_app.payloads.UserDto;

public interface UserService {

    UserDto registerNewUser(UserDto user);
    
    UserDto createUser(UserDto user);

    UserDto updateUser(UserDto user, Integer userId);

    UserDto getUserById(Integer userId);

    List<UserDto> getAllUsers();

    void deleteUser(Integer userId);
}
