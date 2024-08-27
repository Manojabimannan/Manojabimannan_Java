package com.techietact.todomanagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techietact.todomanagement.model.Project;
import com.techietact.todomanagement.repository.ProjectRepository;

@Service
public class ProjectServiceI implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public List<Project> getTodosByUser(String user) {
		return projectRepository.findByUserName(user);
	}

	@Override
	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}

	@Override
	public Optional<Project> getProjectId(long projectId) {
		return projectRepository.findById(projectId);
	}

	@Override
	public void updateProject(Project project) {
		projectRepository.save(project);
	}

	@Override
	public void Project(String projectName, String projectManager, Date startDate, Date endDate, String userName,
			String status, boolean isDone) {
		projectRepository.save(new Project(projectName, projectManager, startDate, endDate, userName, status, isDone));
	}

	@Override
	public void deleteProject(long projectId) {
		Optional<Project> project = projectRepository.findById(projectId);
		if (project.isPresent()) {
			projectRepository.delete(project.get());
		}
	}

	@Override
	public void saveProject(Project project) {
		projectRepository.save(project);
	}

	@Override
	public List<Project> getTodosByUserAndProjectName(String name, String projectName) {
		return projectRepository.findByUserNameAndProjectNameContaining(name, projectName);
	}

}
