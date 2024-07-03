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
<title>Book Details</title>
</head>
<body>
	<div>
		<h1>
			<c:out value="${book.title }"></c:out>
		</h1>
		<a href="/welcome">Back to the Shelves!</a>
	</div>
	<div>
		<p>
			<c:if test="${userid eq book.user.id}">
		You read the 
			
			</c:if>
			<c:if test="${!(userid eq book.user.id)}">
			<c:out value="${book.user.userName }"/>
			</c:if>
			<c:out value="${book.title }"></c:out>
			by
			<c:out value="${ book.author}"></c:out>
		</p>
		<p>
			here are
			<c:out value="${book.user.userName }" />
		</p>
		<hr>
		<p>
			<c:out value="${book.thoughts }" />
		</p>

		<hr>
		<c:if test="${userid eq book.user.id}">
			<a href="/books/${id}/editbook">Edit</a>
			<a href="/books/${id}/delete">Delete</a>
		</c:if>


	</div>


</body>
</html>