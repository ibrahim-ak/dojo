<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit burger</title>
</head>
<body>

	<form:form action="/burgers/edit/${id}" method="post"
		modelAttribute="burger">
		<input type="hidden" name="_method" value="put">
		<p>
			<form:label path="burgerName">Burger Name</form:label>

			<form:input path="burgerName" />
		</p>
		<p>
			<form:label path="restaurentName">Restaurant Name</form:label>

			<form:input path="restaurentName"/>
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


</body>
</html>