<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="add-todo">Add
			Todo</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<center><h3>List of Todos</h3></center>
		</div>
		<br>
		<form action="search-name" method="get" class="form-inline">
    <div class="form-group">
        &nbsp;&nbsp;&nbsp;<label for="projectName"></label>
        <input type="text" class="form-control" id="projectName" name="projectName" placeholder="Enter project name">
    </div>
    <div class="form-group">
        <label for="taskName"> </label>
        <input type="text" class="form-control" id="taskName" name="taskName" placeholder="Enter task name">
    </div>
    <button type="submit" class="btn btn-primary">Search</button>
</form>
		
		<div class="panel-body">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th width="20%">Project Name</th>
						<th width="20%">Task Name</th>
						<th width="35%">Description</th>
						<th width="15%">Target Date</th>
						<th width="10%">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.project.projectName}</td>
							<td>${todo.task.taskName}</td>
							<td>${todo.description}</td>
							<td><fmt:formatDate value="${todo.targetDate}"
									pattern="dd/MM/yyyy" /></td>
							<td><a href="update-todo?id=${todo.id}"><i
									class=" fa fa-edit" style="font-size:20px;color:blue"></i></a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete-todo?id=${todo.id}"><i
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
<br>
<br>
<br>
<br>
<%@ include file="common/footer.jspf"%>