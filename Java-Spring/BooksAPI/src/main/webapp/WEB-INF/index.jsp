<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>All Books</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Title</th>
			<th>Language</th>
			<th># of Pages </th>
			
		</tr>
		<tr>
		<c:forEach  var="book" items="${books}">
		
			<td><c:out value="${book.id}"></c:out></td>
			<td><a href="book/${book.id}"><c:out value="${book.title}"></a></c:out></td>
			<td><a><c:out value="${book.language}"></a></c:out></td>
			<td><a ><c:out value="${book.numberOfPages}"></a></c:out></td>
			</c:forEach>
		</tr>
	</table>

</body>
</html>