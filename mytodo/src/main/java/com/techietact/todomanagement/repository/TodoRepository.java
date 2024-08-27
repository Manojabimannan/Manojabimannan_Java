package com.techietact.todomanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techietact.todomanagement.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

	List<Todo> findByUserName(String user);

	List<Todo> findByProjectProjectNameContaining(String projectName);

	List<Todo> findByTaskTaskNameContaining( String taskName);
	
	List<Todo> findByProjectProjectNameAndTaskTaskName(String projectName,String taskName);

}
