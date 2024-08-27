package com.techietact.todomanagement.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import com.techietact.todomanagement.model.Todo;

public interface ITodoService {

	List<Todo> getTodosByUser(String user);

	Optional<Todo> getTodoById(long id);

	void updateTodo(Todo todo);

	void addTodo(String name, String desc, Date targetDate, boolean isDone);

	void deleteTodo(long id);

	void saveTodo(Todo todo);

	List<Todo> getTodosByUserAndProjectName(String projectName);
	
	List<Todo> getTodosByUserAndTaskName( String taskName);
	
	List<Todo> getTodosByUserAndProjectAndTaskName(String projectName,String taskName);

}