package com.adityarastogi.springboot.Todo_Web_Application_SpringBoot.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
    //LDAP or Database is used to authenticate the user(store the user credentials, like username and password)
    //In memory configuration is used to store the user credentials in the memory

    //InMemoryConfiguration

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {
               
        UserDetails userDetails1 = createNewUser("aditya", "dummy");
        UserDetails userDetails2 = createNewUser("shaurya", "dummy");
        
        return new InMemoryUserDetailsManager(userDetails1, userDetails2);
    }

    
    private UserDetails createNewUser(String username, String password) {

        //now this is not used
        // UserDetails userDetails = User.withDefaultPasswordEncoder()
        // .username("aditya")
        // .password("aditya")
        // .roles("USER","ADMIN")
        // .build();


        //this is a lambda expression, it is used to encode the password
        Function<String, String> passwordEncoder 
        = input -> passwordEncoder().encode(input);
        
        UserDetails userDetails = User.builder()
                                    .passwordEncoder(passwordEncoder)
                                    .username(username)
                                    .password(password)
                                    .roles("USER","ADMIN")
                                    .build();

        return userDetails;
    }


    //BCryptPasswordEncoder is used to encode the password
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}