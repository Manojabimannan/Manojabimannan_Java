package com.techietact.todomanagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techietact.todomanagement.model.Task;
import com.techietact.todomanagement.repository.TaskRepository;

@Service
public class TaskServiceI implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public List<Task> getTasksByUser(String user) {
		return taskRepository.findByUserName(user);
	}

	@Override
	public Optional<Task> getTaskById(long taskId) {
		return taskRepository.findById(taskId);
	}

	@Override
	public void updateTask(Task task) {
		taskRepository.save(task);
	}

	@Override
	public void addTask(String taskName, String taskType, String taskOwner, Date startDate, Date endDate,
			String taskStatus, String userName, boolean isDone) {
		taskRepository.save(new Task(taskName, taskType, taskOwner, startDate, endDate, taskStatus, userName, isDone));
	}

	@Override
	public void deleteTask(long taskId) {
		Optional<Task> task = taskRepository.findById(taskId);
		if (task.isPresent()) {
			taskRepository.delete(task.get());
		}
	}

	@Override
	public void saveTask(Task task) {
		taskRepository.save(task);
	}

	@Override
	public List<Task> getAllProjects() {
		return taskRepository.findAll();
	}

	@Override
	public List<Task> getTodosByUserAndProjectName(String name, String projectName) {
		return taskRepository.findByUserNameAndProjectProjectNameContaining(name, projectName);
	}

}
