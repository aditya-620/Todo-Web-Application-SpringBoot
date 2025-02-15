package com.adityarastogi.springboot.Todo_Web_Application_SpringBoot.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

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
		todos.add(new Todo(++todosCount, "shaurya","Learn Full Stack Development 1", 
				LocalDate.now().plusYears(3), false ));
	}
	
	public List<Todo> findByUsername(String username){
		Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);

		return todos.stream().filter(predicate).toList();
	}

	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}

	public void deleteById(int id) {
		//lambda expression
		//Predicate is a functional interface, which is used to filter the data
		//todo -> todo.getId() == id   is a lambda expression, which is used to filter the data, and will return the todo object, which has the id equal to the id passed in the method
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}	


	public Todo findById(int id){
		//here, we are using a lambda expression, to filter the data, and will return the todo object, which has the id equal to the id passed in the method
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo){
		deleteById(todo.getId());	
		todos.add(todo);	
	}
}
