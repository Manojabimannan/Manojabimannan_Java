<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="add-project">Add
			Project</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<center><h3>List of Projects</h3></center>
		</div><br>
		<form action="search-project" method="get" class="form-inline">
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
						<th width="20%">Project Name</th>
						<th width="20%">Project Manager</th>
						<th width="15%">Start Date</th>
						<th width="15%">Target Date</th>
						<th width="20%">Project Status</th>
						<th width="10%">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${project}" var="project">
						<tr>
							<td>${project.projectName}</td>
							<td>${project.projectManager}</td>
							<td><fmt:formatDate value="${project.startDate}"
									pattern="MM/dd/yyyy" /></td>
							<td><fmt:formatDate value="${project.endDate}"
									pattern="MM/dd/yyyy" /></td>
							<td>${project.status}</td>
							<td><a href="update-project?projectId=${project.projectId}"><i
									class=" fa fa-edit" style="font-size:20px;color:blue"></i></a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete-project?projectId=${project.projectId}"><i
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
<br>
<%@ include file="common/footer.jspf"%>