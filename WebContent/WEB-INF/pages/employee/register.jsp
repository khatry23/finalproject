<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>REGISTER EMPLOYEE</title>
</head>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" 
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	 crossorigin="anonymous">
</script>
<body>
	<div class="bg-dark text-white" align="center"><h1><span class="badge badge-warning">${requestScope.status}</span></h1></div>
	<form:form method="post" modelAttribute="employee">
		<div style="width: 70%" class="container-fluid" >
			<table class="table table-condensed table-hover "  >
				<thead class="thead-dark">
				
				</thead>
				<tbody>
					<tr class="table-dark" >
						<td ><span class="text-dark">Employee ID</span></td>
						<td ><form:input class="form-control" path="id" /></td>
					</tr>
					<tr class="table-dark">
						<td><span class="text-dark">Employee Name</span></td>
						<td><form:input class="form-control" path="empName" /></td>
					</tr>
					<tr class="table-dark">
						<td><span class="text-dark">Employee Salary</span></td>
						<td><form:input class="form-control" path="sal" /></td>
					</tr>
					<tr class="table-dark">
						<td><span class="text-dark">Employee Department</span></td>
						<td><form:input class="form-control" path="dept" /></td>
					</tr>
				</tbody>
				
	
			</table>
		</div>
		<div align="center"><input type="submit" value="Add Employee" class="btn btn-primary" /> <a href="<spring:url value='/'/>"class="btn btn-primary" >Back</a></div>
		
	</form:form>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>

	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	
</body>
</html>