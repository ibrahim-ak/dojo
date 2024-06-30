<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Burger Tracker</h1>
	<div>
		<table>
			<tr>
				<th>Burger Name</th>
				<th>Restaurant Name</th>
				<th>Rating</th>
			</tr>
			<c:forEach items="${burgerss}" var="burger">
				<tr>
					<td><c:out value="${burger.burgerName }"></c:out></td>
					<td><c:out value="${burger.restaurentName }"></c:out></td>
					<td><c:out value="${burger.rate }"></c:out></td>
				</tr>
			</c:forEach>
		</table>

	</div>

	<div>
		<form:form action="/newburger" method="post" modelAttribute="burger">
			<p>
				<form:label path="burgerName">Burger Name</form:label>

				<form:input path="burgerName" />
			</p>
			<p>
				<form:label path="restaurentName">Restaurant Name</form:label>

				<form:input path="restaurentName" />
			</p>
			<p>
				<form:label path="rate">Rate</form:label>

				<form:input type="number" path="rate" />
			</p>
			<p>
				<form:label path="notes">Notes</form:label>

				<form:textarea path="notes" />
			</p>
			<input type="submit" value="Submit" />

			<p>
				<form:errors path="burgerName" />
				<br>
				<form:errors path="restaurentName" />
				<br>
				<form:errors path="rate" />
				<br>
				<form:errors path="notes" />
			</p>
		</form:form>
	</div>



</body>
</html>