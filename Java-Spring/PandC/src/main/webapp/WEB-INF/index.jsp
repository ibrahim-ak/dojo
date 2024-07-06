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
<title>Home Page</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>

	<h1 class="text-center">Home page</h1>
	<a href="/products/new">New Product</a>
	<br>
	<a href="/categories/new">New Category</a>
	<hr>
	<table>
		<thead>
			<tr>
				<th>Products</th>
				<th>Categories</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>
					<ul>
						<c:forEach var="product" items="${products}">
							<li><a href="products/${product.id}"><c:out
										value="${product.name}" /></a></li>
						</c:forEach>
					</ul>
				</td>
				<td>
					<ul>
						<c:forEach var="category" items="${categories}">
							<li><a href="categories/<c:out value="${category.id}"/>"><c:out
										value="${category.name}" /></a></li>
						</c:forEach>
					</ul>
				</td>
			</tr>
		</tbody>
	</table>

</body>
</html>