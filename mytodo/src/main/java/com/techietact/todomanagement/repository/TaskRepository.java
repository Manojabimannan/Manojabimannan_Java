package com.techietact.todomanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techietact.todomanagement.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

	List<Task> findByUserName(String user);

	List<Task> findByUserNameAndProjectProjectNameContaining(String userName, String projectName);

}
