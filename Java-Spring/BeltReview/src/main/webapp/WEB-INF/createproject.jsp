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
<title>Add project</title>
</head>
<body>

<h1>add project</h1>

<form:form action="/project/new" method="post" modelAttribute="newproject">

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
				<button><a href="/welcome">goback</a></button> 

			<p>	<form:errors path="title" /></p>
			<p>	<form:errors path="description" /></p>
			<p>	<form:errors path="dueDate" /></p>
			
			</form:form>


</body>
</html>