<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<h1><c:out value="${book.title}"/></h1>

<h3><c:out value ="${book.description }"/></h3>
<h3><c:out value ="${book.language }"/></h3>
<h3><c:out value ="${book.numberOfPages }"/></h3>


</head>
<body>

</body>
</html>