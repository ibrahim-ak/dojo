<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="/expenses/edit/${id}" method="post"
		modelAttribute="travel">
		<input type="hidden" name="_method" value="put">
		<p>
			<form:label path="expense">expense</form:label>

			<form:input path="expense" />
		</p>
		<p>
			<form:label path="vendor">vendor</form:label>

			<form:input path="vendor"/>
		</p>
		<p>
			<form:label path="amount">Rate</form:label>

			<form:input type="double" path="amount" />
		</p>
		<p>
			<form:label path="descritpion">descritpion</form:label>

			<form:textarea path="descritpion" />
		</p>
		<input type="submit" value="Submit" />

		<p>
			<form:errors path="expense" />
			<br>
			<form:errors path="vendor" />
			<br>
			<form:errors path="amount" />
			<br>
			<form:errors path="descritpion" />
		</p>
	</form:form>
</body>
</html>