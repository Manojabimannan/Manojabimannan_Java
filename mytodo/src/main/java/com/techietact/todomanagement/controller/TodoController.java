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
import com.techietact.todomanagement.model.Todo;
import com.techietact.todomanagement.service.ITodoService;
import com.techietact.todomanagement.service.ProjectService;
import com.techietact.todomanagement.service.TaskService;

@Controller
public class TodoController {

	@Autowired
	private ITodoService todoService;

	@Autowired
	private ProjectService projectService;

	@Autowired
	private TaskService taskService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("todos", todoService.getTodosByUser(name));
		return "list-todos";
	}

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		String username = getLoggedInUserName(model);
		List<Project> projectList = projectService.getTodosByUser(username);
		List<Task> taskList = taskService.getTasksByUser(username);
		model.addAttribute("taskList", taskList);
		model.addAttribute("projectList", projectList);
		model.addAttribute("todo", new Todo());
		return "todo";
	}

	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam long id) {
		todoService.deleteTodo(id);
		return "redirect:/list-todos";
	}

	@RequestMapping(value = "/update-todo", method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam long id, ModelMap model) {
		Todo todo = todoService.getTodoById(id).get();
		String username = getLoggedInUserName(model);
		List<Project> projectList = projectService.getTodosByUser(username);
		List<Task> taskList = taskService.getTasksByUser(username);
		model.addAttribute("taskList", taskList);
		model.addAttribute("projectList", projectList);
		model.put("todo", todo);
		return "todo";
	}

	@RequestMapping(value = "/update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

		if (result.hasErrors()) {
			return "todo";
		}

		todo.setUserName(getLoggedInUserName(model));
		todoService.updateTodo(todo);
		return "redirect:/list-todos";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

		if (result.hasErrors()) {
			return "todo";
		}

		todo.setUserName(getLoggedInUserName(model));
		todoService.saveTodo(todo);
		return "redirect:/list-todos";
	}


	@RequestMapping(value = "/search-name", method = RequestMethod.GET)
	public String searchTodos(@RequestParam(value = "projectName", required = false) String projectName,
	                          @RequestParam(value = "taskName", required = false) String taskName,
	                          ModelMap model) {
	    List<Todo> todos;
	    String name = getLoggedInUserName(model);
	    if (projectName != null && !projectName.isEmpty() && taskName != null && !taskName.isEmpty()) {
	        todos = todoService.getTodosByUserAndProjectAndTaskName(projectName, taskName);
	    } else if (projectName != null && !projectName.isEmpty()) {
	        todos = todoService.getTodosByUserAndProjectName(projectName);
	    } else if (taskName != null && !taskName.isEmpty()) {
	        todos = todoService.getTodosByUserAndTaskName(taskName);
	    } else {
	        todos = todoService.getTodosByUser(name);
	    }
	    
	    model.put("todos", todos);
	    return "list-todos";
	}


}
