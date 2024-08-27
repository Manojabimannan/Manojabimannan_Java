package com.techietact.todomanagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techietact.todomanagement.model.Todo;
import com.techietact.todomanagement.repository.TodoRepository;

@Service
public class TodoService implements ITodoService {

	@Autowired
	private TodoRepository todoRepository;

	@Override
	public List<Todo> getTodosByUser(String user) {
		return todoRepository.findByUserName(user);
	}

	@Override
	public Optional<Todo> getTodoById(long id) {
		return todoRepository.findById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		todoRepository.save(todo);
	}

	@Override
	public void addTodo(String name, String desc,Date  targetDate, boolean isDone) {
		todoRepository.save(new Todo(name, desc, targetDate, isDone));
	}

	@Override
	public void deleteTodo(long id) {
		Optional<Todo> todo = todoRepository.findById(id);
		if (todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(Todo todo) {
		todoRepository.save(todo);
	}
	
	@Override
    public List<Todo> getTodosByUserAndProjectName(String projectName) {
        return todoRepository.findByProjectProjectNameContaining( projectName);
    }

	@Override
	public List<Todo> getTodosByUserAndTaskName(String taskName) {
		return todoRepository.findByTaskTaskNameContaining(taskName);
	}

	@Override
	public List<Todo> getTodosByUserAndProjectAndTaskName(String projectName, String taskName) {
		return todoRepository.findByProjectProjectNameAndTaskTaskName(projectName, taskName);
	}
	
}