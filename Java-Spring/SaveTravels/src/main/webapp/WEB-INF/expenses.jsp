<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expenses</title>
</head>
<body>


	<h1>Expense Details</h1>
	<h2>
		<a href="/">GoBack</a>
	</h2>





	<p>
		Travel Expense:
		<c:out value="${travel.expense}"></c:out>
	</p>
	<p>
		Travel Vendor :
		<c:out value="${travel.vendor }"></c:out>
	</p>
	<p>
		Travel Amount $:
		<c:out value="${travel.amount }"></c:out>
	</p>
	<p>
		Travel description:
		<c:out value="${travel.descritpion }"></c:out>
	</p>
</body>
</html>