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


	<h1 class="text-center">New Product</h1>
	<a href="/">Home</a>
	<hr>
	<form:form action="/products/new" method="post"
		modelAttribute="Products">
		<p>
			<form:label path="name">Product Name</form:label>

			<form:input path="name" />
		</p>
		<p>
			<form:label path="description">Description</form:label>

			<form:textarea path="description" />
		</p>
		<p>
			<form:label path="price">Price $</form:label>

			<form:input type="double" path="price" value="0.0" />
		</p>
		<p>
			<form:errors path="name" />
		</p>
		<p>
			<form:errors path="description" />
		</p>
		<p>
			<form:errors path="price" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>