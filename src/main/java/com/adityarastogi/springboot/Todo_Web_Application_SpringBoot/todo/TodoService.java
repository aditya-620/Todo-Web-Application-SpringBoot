package com.adityarastogi.springboot.Todo_Web_Application_SpringBoot.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//this is a todo service, which will be used to manage the todos, as we are not using any database, we are using a static list of todos
//this is a spring bean, so that we can autowire it with the TodoController
@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;
	
    //this is a static block, which will be executed when the class is loaded
	static {
		todos.add(new Todo(++todosCount, "aditya","Get AWS Certified 1", 
							LocalDate.now().plusYears(1), false ));
		todos.add(new Todo(++todosCount, "aditya","Learn DevOps 1", 
				LocalDate.now().plusYears(2), false ));
		todos.add(new Todo(++todosCount, "aditya","Learn Full Stack Development 1", 
				LocalDate.now().plusYears(3), false ));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
}
