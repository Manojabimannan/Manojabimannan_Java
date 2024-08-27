package com.techietact.todomanagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.techietact.todomanagement.model.Project;
import com.techietact.todomanagement.model.Todo;

public interface ProjectService {

	List<Project> getTodosByUser(String user);

	List<Project> getAllProjects();

	Optional<Project> getProjectId(long projectId);

	void updateProject(Project project);

	void Project(String projectName, String projectManager, Date startDate, Date endDate,String userName,String status, boolean isDone);

	void deleteProject(long projectId);

	void saveProject(Project project);

	List<Project> getTodosByUserAndProjectName(String name, String projectName);

}
