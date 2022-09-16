package com.example.zoraweb.services;

import com.example.zoraweb.Repository.UserRepository;
import com.example.zoraweb.frymaster.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsLoader extends User implements UserDetailsService {

    private final UserRepository user;
    public UserDetailsLoader(UserRepository user) {
        this.user = user;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = user.findByfry_user(username);
        if (user == null) {
            throw new UsernameNotFoundException("No user found for " + username);
        }
        return new com.example.capstone.models.UserWithRoles(user);
    }
}