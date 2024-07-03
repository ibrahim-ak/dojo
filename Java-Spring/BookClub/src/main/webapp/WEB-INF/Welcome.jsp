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
<title>Welcome</title>
<link rel="stylesheet" href="/readshare.css">
</head>

<body>
	<div class="container">
		<div>
			<h1>
				Welcome
				<c:out value="${Theuser.userName }"></c:out>
			</h1>
			<p>Books From everyone shelves</p>
		</div>
		<div>
			<p>
				<a href="/logout">logout</a>
			</p>
			<p>
				<a href="/createbook">+ Add a book to my shelf!</a>
			</p>
		</div>
	</div>

	<div>
		<table>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author name</th>
				<th>Posted By</th>
			</tr>
			
			 <c:forEach var="book" items="${books}">
				<tr>
					<td><c:out value="${book.id}"></c:out></td>
					<td><a href="/books/${book.id}"><c:out value="${book.title }"></c:out> </a> </td>
					<td><c:out value="${book.author }"></c:out></td>
					<td><c:out value="${book.user.userName }"></c:out></td>
				</tr>
			</c:forEach> 
		</table>
	</div>


</body>

</html>