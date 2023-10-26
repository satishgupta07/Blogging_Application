package com.satishgupta.blog_app.security;

import com.satishgupta.blog_app.entities.User;
import com.satishgupta.blog_app.exceptions.ResourceNotFoundException;
import com.satishgupta.blog_app.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //loading user from database by username
        User user = this.userRepo.findByEmail(username).
                orElseThrow(()-> new ResourceNotFoundException("User ", " email : "+username, 0));

        return user;
    }
}
