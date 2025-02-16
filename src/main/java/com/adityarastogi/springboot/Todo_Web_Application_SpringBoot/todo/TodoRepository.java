package com.adityarastogi.springboot.Todo_Web_Application_SpringBoot.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//this is a repository, which is used to interact with the database
//JpaRepository is a spring data interface, which is used to interact with the database
//Todo is a bean, and Integer is the type of the primary key of the Todo bean
public interface TodoRepository extends JpaRepository<Todo, Integer>{

    //this method is used to find all the todos of a particular user
	public List<Todo> findByUsername(String username);
}