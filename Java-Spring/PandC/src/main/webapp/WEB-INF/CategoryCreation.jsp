<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creating Product</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>


	<h1 class="text-center">New Category</h1>
	<a href="/">Home</a>
	<hr>
	<form:form action="/categories/new" method="post"
		modelAttribute="Categories">
		<p>
			<form:label path="name">Category Name</form:label>

			<form:input path="name" />
		</p>

		<p>
			<form:errors path="name" />
		</p>

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>