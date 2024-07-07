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
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>


	<form:form action="/projects/edit/${Eproject.id}" method="post"
		modelAttribute="Eproject">
		<input type="hidden" name="_method" value="patch">
		<div>
			<form:label path="title">Title</form:label>
			<form:input path="title" />
		</div>
		<div>
			<form:label path="description">description</form:label>
			<form:textarea path="description" />
		</div>
		<div>
			<form:label path="dueDate">Date</form:label>
			<form:input type="date" path="dueDate" />
		</div>

		<input type="submit" value="Submit">

		<a class="btn btn-primary" href="/welcome">goback</a>
		
		<a class="btn btn-danger" href="/delete/${Eproject.id}">delete</a> 

		<p>
			<form:errors path="title" />
		</p>
		<p>
			<form:errors path="description" />
		</p>
		<p>
			<form:errors path="dueDate" />
		</p>

	</form:form>
</body>
</html>