<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>New Dojo</h1>

<form:form action="/dojos/new" method="post" modelAttribute="dojo">
    <p>
        <form:label path="name">Dojo name</form:label>
        
        <form:input path="name"/>
    </p>

<input type="submit" value="Creat"/>
<form:errors path="name"/>
</form:form>    

</body>
</html>