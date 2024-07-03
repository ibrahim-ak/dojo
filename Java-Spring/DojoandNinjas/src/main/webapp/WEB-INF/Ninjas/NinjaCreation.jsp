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
<title>New ninja</title>
</head>
<body>

	<h1>New Ninja</h1>

	<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
	<form:select path="dojo">
        <c:forEach var="dojoo" items="${dojos}">
            <!--- Each option VALUE is the id of the person --->
            <form:option value="${dojoo.id}" path="dojo">
            <!--- This is what shows to the user as the option --->
                <c:out value="${dojoo.name}"/>
                
            </form:option>
        </c:forEach>
    </form:select>
		<p> 
			<form:label path="firstName">Ninja firstname</form:label>
			<form:input path="firstName" />
		</p>
		<p>
			<form:label path="lastName">Ninja lastname</form:label>
			<form:input path="lastName" />
		</p>
		<p>
			<form:label path="age">Age</form:label>
			<form:input path="age" />
		</p>

		<input type="submit" value="Creat" />
		<form:errors path="firstName" />
		<form:errors path="lastName" />
		<form:errors path="age" />
	</form:form>

</body>
</html>