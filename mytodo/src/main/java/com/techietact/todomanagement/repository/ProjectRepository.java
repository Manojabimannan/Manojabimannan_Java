package com.techietact.todomanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techietact.todomanagement.model.Project;
import com.techietact.todomanagement.model.Todo;

public interface ProjectRepository extends JpaRepository<Project, Long> {

	List<Project> findByUserName(String user);

	List<Project> findByUserNameAndProjectNameContaining(String userName, String projectName);

}
