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
import com.techietact.todomanagement.service.TaskService;

@Controller
public class TaskController {

	@Autowired
	private TaskService taskService;

	@Autowired
	private ProjectService projectService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/list-tasks", method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("task", taskService.getTasksByUser(name));
		return "list-tasks";
	}

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}

	@RequestMapping(value = "/add-task", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		String username = getLoggedInUserName(model);
		 List<Project> projectList = projectService.getTodosByUser(username);
		model.addAttribute("projectList", projectList);
		model.addAttribute("task", new Task());
		return "task";
	}

	@RequestMapping(value = "/delete-task", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam long taskId) {
		taskService.deleteTask(taskId);
		return "redirect:/list-tasks";
	}

	@RequestMapping(value = "/update-task", method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam long taskId, ModelMap model) {
		Task task = taskService.getTaskById(taskId).get();
		String username = getLoggedInUserName(model);
		List<Project> projectList = projectService.getTodosByUser(username);
		model.addAttribute("projectList", projectList);
		model.put("task", task);
		return "task";
	}

	@RequestMapping(value = "/update-task", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Task task, BindingResult result) {

		if (result.hasErrors()) {
			return "task";
		}
		task.setUserName(getLoggedInUserName(model));
		taskService.updateTask(task);
		return "redirect:/list-tasks";
	}

	@RequestMapping(value = "/add-task", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Task task, BindingResult result) {

		if (result.hasErrors()) {
			return "task";
		}

		task.setUserName(getLoggedInUserName(model));
		taskService.saveTask(task);
		return "redirect:/list-tasks";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchTodos(@RequestParam(value = "projectName", required = false) String projectName,
			ModelMap model) {
		String name = getLoggedInUserName(model);
		List<Task> task;
		if (projectName != null && !projectName.isEmpty()) {
			task = taskService.getTodosByUserAndProjectName(name, projectName);
		} else {
			task = taskService.getTasksByUser(name);
		}
		model.put("task", task);
		return "list-tasks";
	}

}
