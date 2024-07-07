<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>
		Welcome
		<c:out value="${userName}"></c:out>
	</h1>
	<p>This is the Dashboard nothing to see yet</p>
	<p>
		<a href="/logout">logout</a>
	</p>

	<hr>
	<a href="/project/new">New project</a>
	<hr>

	<h2>All Projects</h2>
	<table class="table">
		<thead>
			<tr>
				<th>Project name</th>
				<th>Team Lead</th>
				<th>Due Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="project" items="${otherProjects}">
				<tr>
					<th><c:out value="${project.title}" /></th>
					<td><c:out value="${project.lead.userName}" /></td>
					<td><fmt:formatDate value="${project.dueDate}"
							pattern="MMM-dd " /></td>
					<td><a href="/jointeam/${project.id}">Join Team</a></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<hr>
	<table class="table">
		<thead>
			<tr>
				<th>Project name</th>
				<th>Team Lead</th>
				<th>Due Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="project" items="${Projects}">
				<tr>
					<th><c:out value="${project.title}" /></th>
					<td><c:out value="${project.lead.userName}" /></td>
					<td><fmt:formatDate value="${project.dueDate}"
							pattern="MMM-dd " /></td>
					<c:if test="${ project.lead.id == Theuser}">
						<td><a href="/projects/edit/${project.id}">Edit</a></td>
					</c:if>
					<c:if test="${ project.lead.id != Theuser}">
						<td><a href="/leaveteam/${project.id}">Leave Team</a></td>
					</c:if>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>