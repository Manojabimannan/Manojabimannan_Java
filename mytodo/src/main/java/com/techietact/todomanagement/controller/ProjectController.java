package com.techietact.todomanagement.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techietact.todomanagement.model.Project;
import com.techietact.todomanagement.model.Task;
import com.techietact.todomanagement.service.ProjectService;

@Controller
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/list-projects", method = RequestMethod.GET)
	public String showProject(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("project", projectService.getTodosByUser(name));
		return "list-projects";
	}

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}

	@RequestMapping(value = "/add-project", method = RequestMethod.GET)
	public String showAddProjectPAge(ModelMap model) {
		model.addAttribute("project", new Project());
		return "project";
	}

	@RequestMapping(value = "/delete-project", method = RequestMethod.GET)
	public String deleteProject(@RequestParam long projectId) {
		projectService.deleteProject(projectId);
		return "redirect:/list-projects";
	}

	@RequestMapping(value = "/update-project", method = RequestMethod.GET)
	public String showUpdateProjectoPage(@RequestParam long projectId, ModelMap model) {
		Project project = projectService.getProjectId(projectId).get();
		model.put("project", project);
		return "project";
	}

	@RequestMapping(value = "/update-project", method = RequestMethod.POST)
	public String updateProject(ModelMap model, @Valid Project project, BindingResult result) {

		if (result.hasErrors()) {
			return "project";
		}
		project.setUserName(getLoggedInUserName(model));
		projectService.updateProject(project);
		return "redirect:/list-projects";
	}

	@RequestMapping(value = "/add-project", method = RequestMethod.POST)
	public String addProject(ModelMap model, @Valid Project project, BindingResult result) {

		if (result.hasErrors()) {
			return "project";
		}

		project.setUserName(getLoggedInUserName(model));
		projectService.saveProject(project);
		return "redirect:/list-projects";
	}

	@RequestMapping(value = "/search-project", method = RequestMethod.GET)
	public String searchTodos(@RequestParam(value = "projectName", required = false) String projectName,
			ModelMap model) {
		String name = getLoggedInUserName(model);
		List<Project> project;
		if (projectName != null && !projectName.isEmpty()) {
			project = projectService.getTodosByUserAndProjectName(name, projectName);
		} else {
			project = projectService.getTodosByUser(name);
		}
		model.put("project", project);
		return "list-projects";
	}

}
