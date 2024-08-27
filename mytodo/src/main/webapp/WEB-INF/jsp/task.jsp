<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>


<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<div class="panel panel-primary">
				<div class="panel-heading">Add TASK</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="task">
						<form:hidden path="taskId" />

						<fieldset class="form-group">
							<form:label path="project.projectId">Project</form:label>
							<form:select path="project.projectId" class="form-control" required="required">
								<option value="">-- Select Project --</option>
								<form:options items="${projectList}" itemValue="projectId"
									itemLabel="projectName" />
							</form:select>
							<form:errors path="project.projectId" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="taskName">Task Name</form:label>
							<form:input path="taskName" type="text" class="form-control"
								required="required" />
							<form:errors path="taskName" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="taskType">Task Type</form:label>
							<form:input path="taskType" type="text" class="form-control"
								required="required" />
							<form:errors path="taskType" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="taskOwner">Task Owner</form:label>
							<form:input path="taskOwner" type="text" class="form-control"
								required="required" />
							<form:errors path="taskOwner" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="startDate">Start Date</form:label>
							<form:input path="startDate" type="date" class="form-control"
								required="required" />
							<form:errors path="startDate" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="endDate">Target Date</form:label>
							<form:input path="endDate" type="date" class="form-control"
								required="required" />
							<form:errors path="endDate" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="taskStatus">Task Status</form:label>
							<form:select path="taskStatus" class="form-control"
								required="required">
								<form:option value="" label="Select Status" />
								<form:option value="started" label="Started" />
								<form:option value="ongoing" label="Ongoing" />
								<form:option value="completed" label="Completed" />
								<form:option value="dropped" label="Dropped" />
							</form:select>
							<form:errors path="taskStatus" cssClass="text-warning" />
						</fieldset>

						<button type="submit" class="btn btn-success">Save</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<br>
<br>
<br><br><br><br><br><br>
 <%@ include file="common/footer.jspf"%> 
