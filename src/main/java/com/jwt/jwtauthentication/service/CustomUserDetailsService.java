package com.jwt.jwtauthentication.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        //Fake User i.e. without DB
        if(userName.equals("oggy")) {
            return new User("oggy","oggy123",new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found !!");
        }
    }
}
