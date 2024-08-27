<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Add Project</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="project">
						<form:hidden path="projectId" />
						<fieldset class="form-group">
							<form:label path="projectName">Project Name</form:label>
							<form:input path="projectName" type="text" class="form-control"
								required="required" />
							<form:errors path="projectName" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="projectManager">Project Manager</form:label>
							<form:input path="projectManager" type="text"
								class="form-control" required="required" />
							<form:errors path="projectManager" cssClass="text-warning" />
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
							<form:label path="status">Project Status</form:label>
							<form:select path="status" class="form-control"
								required="required">
								<form:option value="" label="Select Status" />
								<form:option value="Initial" label="Initial" />
								<form:option value="Upcoming" label="Upcoming" />
								<form:option value="Ongoing" label="Ongoing" />
								<form:option value="Completed" label="Completed" />
								<form:option value="Dropped" label="Dropped" />
							</form:select>
							<form:errors path="status" cssClass="text-warning" />
						</fieldset>

						<button type="submit" class="btn btn-success">Save</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div><br><br><br><br><br>
<%@ include file="common/footer.jspf"%>