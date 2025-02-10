package com.adityarastogi.springboot.Todo_Web_Application_SpringBoot.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    
    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("aditya");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");

        return isValidUserName && isValidPassword;
    }
}
