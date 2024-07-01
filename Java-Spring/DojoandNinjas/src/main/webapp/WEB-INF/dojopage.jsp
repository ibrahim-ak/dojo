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
<title>Dojo page</title>
</head>
<body>
	<table>
		
			<tr>
				<th>Dojo <c:out value="${dojoid.name}"></c:out></th>
			</tr>
			<tr>
				<c:forEach var="ninja" items="${dojoid.ninjas}">
					<td> <c:out value="${ninja.firstName }"></c:out> </td>
					<td> <c:out value="${ninja.lastName }"></c:out> </td>
					<td> <c:out value="${ninja.age }"></c:out> </td>
					</c:forEach>
			</tr>
		
		
	</table>
</body>
</html>