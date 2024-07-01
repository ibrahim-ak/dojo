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
<title>Dashboard</title>
</head>
<body>

	<h1>Welcome to the Dashboard</h1>
	<table>
	
		<tr>
			<th>Dojo name</th>
		</tr>
		<c:forEach var="dojo" items="${dojos}">
		<tr>
			<td><a href="dojo/${dojo.id}"><c:out value="${dojo.name}"></c:out></a>  </td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>