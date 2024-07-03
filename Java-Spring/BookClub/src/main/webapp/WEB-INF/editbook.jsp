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
<title>create a book</title>
</head>
<body>
<header>
<h1>Add a book to your shelf! </h1>
	<a href ="/welcome">Back to the Shelves!</a>
</header>

<form:form action="/books/${books.id}/editbook" method="post" modelAttribute="books">
  <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="author">Author</form:label>
        <form:errors path="author"/>
        <form:input path="author"/>
    </p>
    <p>
        <form:label path="thoughts">thoughts</form:label>
        <form:errors path="thoughts"/>
        <form:textarea path="thoughts"/>
    </p>

    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>