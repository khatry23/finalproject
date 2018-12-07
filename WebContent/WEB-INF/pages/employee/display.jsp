<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EMPLOYEE LIST</title>
</head>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" 
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	 crossorigin="anonymous"> </script>
<body>
	<div class="bg-dark text-white" align="center"><h1><span class="badge badge-warning">${requestScope.status}</span></h1></div>
	<table class="table table-condensed table-hover ">
		<thead class="thead-dark text-dark">
			<tr>
				<th>Id</th>
				<th>Emp Name</th>
				<th>Salary</th>
				<th>Department</th>
				<th>Delete</th>
				
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="e" items="${sessionScope.emp_dtls}">
				<tr class="table-dark text-dark">
					
					<td>${e.id}</td>
					<td>${e.empName}</td>
					<td>${e.sal}</td>
					<td>${e.dept}</td>
					<td><a href="<spring:url value='/employee/delete?eid=${e.id}'/>" " class="btn btn-primary">Delete</a></td>
					
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	
	<div align="center"><a href="<spring:url value='/'/>"class="btn btn-primary" >Back</a></div>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>

	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

	
</body>
</html>