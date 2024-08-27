<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>


<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<div class="panel panel-primary">
				<div class="panel-heading">Add TODO</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="todo">
						<form:hidden path="id" />
						
						<fieldset class="form-group">
							<form:label path="project.projectId">Project</form:label>
							<form:select path="project.projectId" class="form-control"
								required="required">
								<option value="">-- Select Project --</option>
								<form:options items="${projectList}" itemValue="projectId"
									itemLabel="projectName" />
							</form:select>
							<form:errors path="project.projectId" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="task.taskId">Task</form:label>
							<form:select path="task.taskId" class="form-control"
								required="required">
								<option value="">-- Select Task --</option>
								<form:options items="${taskList}" itemValue="taskId"
									itemLabel="taskName" />
							</form:select>
							<form:errors path="task.taskId" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="description">Description</form:label>
							<form:input path="description" type="text" class="form-control"
								required="required" />
							<form:errors path="description" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="targetDate">Target Date</form:label>
							<form:input path="targetDate" type="text" class="form-control"
								required="required" />
							<form:errors path="targetDate" cssClass="text-warning" />
						</fieldset>

						<button type="submit" class="btn btn-success">Save</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div><br><br><br><br><br>
<%@ include file="common/footer.jspf"%>
