package com.techietact.todomanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long taskId;
	private String taskName;
	private String taskType;
	private String taskOwner;
	private Date startDate;
	private Date endDate;
	private String taskStatus;
	private String userName;
	
	@ManyToOne
	@JoinColumn(name = "project_id")
	private Project project;

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskOwner() {
		return taskOwner;
	}

	public void setTaskOwner(String taskOwner) {
		this.taskOwner = taskOwner;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public String isTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Task() {
		super();
	}
	
	public Task(String taskName,String taskType,String taskOwner,Date startDate,Date endDate,String taskStatus,String userName,boolean isDone) {
		
		super();
		this.taskName=taskName;
		this.taskType=taskType;
		this.taskOwner=taskOwner;
		this.startDate=startDate;
		this.endDate=endDate;
		this.taskStatus=taskStatus;
		this.userName=userName;
		
	}
	

}
