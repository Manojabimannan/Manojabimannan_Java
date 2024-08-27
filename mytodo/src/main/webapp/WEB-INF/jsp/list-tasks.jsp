<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="add-task">Add
			Task</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
		<center><h3>List of Tasks</h3></center>
		</div>
		<br>
		<form action="search" method="get" class="form-inline">
			<div class="form-group">
				&nbsp;&nbsp;&nbsp;<label for="search"> </label> <input type="text"
					class="form-control" id="search" name="projectName"
					placeholder="Enter project name">
			</div>
			<button type="submit" class="btn btn-primary">Search</button>
		</form>
		<div class="panel-body">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th width="15%">Project Name</th>
						<th width="15%">Task Name</th>
						<th width="15%">Task Type</th>
						<th width="15%">Task Owner</th>
						<th width="10%">Start Date</th>
						<th width="10%">Target Date</th>
						<th width="10%">Task Status</th>
						<th width="10%">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${task}" var="task">
						<tr>
							<td>${task.project.projectName}</td>
							<td>${task.taskName}</td>
							<td>${task.taskType}</td>
							<td>${task.taskOwner}</td>
							<td><fmt:formatDate value="${task.startDate}"
									pattern="dd/MM/yyyy" /></td>
							<td><fmt:formatDate value="${task.endDate}"
									pattern="dd/MM/yyyy" /></td>
							<td>${task.taskStatus}</td>
							<td><a href="update-task?taskId=${task.taskId}"><i
									class=" fa fa-edit" style="font-size:20px;color:blue"></i></a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete-task?taskId=${task.taskId}"><i
									class="fa fa-trash-o" style="font-size:20px;color:blue"></i></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<br>
<br>
<br>
<br>
<br>
<%@ include file="common/footer.jspf"%>