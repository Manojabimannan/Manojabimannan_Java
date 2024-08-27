package com.techietact.todomanagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.techietact.todomanagement.model.Task;


public interface TaskService {
	
	List<Task> getTasksByUser(String user);

	Optional<Task> getTaskById(long taskId);
	
	List<Task> getAllProjects();

	void updateTask(Task task);

	void addTask(String taskName,String taskType,String taskOwner,Date startDate,Date endDate,String taskStatus,String userName,boolean isDone);

	void deleteTask(long taskId);

	void saveTask(Task task);

	List<Task> getTodosByUserAndProjectName(String name, String projectName);


}
