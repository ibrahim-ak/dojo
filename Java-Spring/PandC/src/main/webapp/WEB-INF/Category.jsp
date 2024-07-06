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
<title>Viewing product</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<h1 class="text-center">
		<c:out value="${cid.name }"></c:out>
	</h1>
	<a href="/">Home</a>
	<hr>

	<ul>
		<c:forEach var="product" items="${categoriesinclude}">
			<li><a href="/products/${product.id}"><c:out
						value="${product.name}" /></a></li>
		</c:forEach>
	</ul>

	<hr>

	<form action="/categories/${id}" method="post">
		<h4>Add Product:</h4>
		<select name="productId" id="productId">
			<c:forEach var="product" items="${categoriesNotinclude}">
				<option value="${product.id}">${product.name}</option>
			</c:forEach>
		</select> <input class="input" class="button" type="submit" value="Add" />
	</form>
</body>
</html>