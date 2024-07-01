<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Save Travels</h1>
	<div>
		<table style="border: 1px solid gray">
			<tr>
				<th style="border: 1px solid gray">Expense</th>
				<th style="border: 1px solid gray">Vendor</th>
				<th style="border: 1px solid gray">Amount$</th>
				<th style="border: 1px solid gray">Action</th>
				<th></th>
			</tr>
			<c:forEach items="${Travels}" var="t">
				<tr style="border: 1px solid gray">
					<td style="border: 1px solid gray"><a href="expenses/${t.id}"><c:out value="${t.expense}"></c:out></a></td>
					<td style="border: 1px solid gray"><c:out value="${t.vendor }"></c:out></td>
					<td style="border: 1px solid gray">$<c:out value="${t.amount }"></c:out></td>
					<td style="border: 1px solid gray"><a
						href="expenses/edit/${t.id }">edit</a></td>
					<td>
						<form action="travel/delete/${t.id}" method="post">
							<input type="hidden" name="_method" value="delete"> <input
								type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>

	</div>
	<h2>Add Expense</h2>
	<div>
		<form:form action="/newtravel" method="post" modelAttribute="travels">
			<p>
				<form:label path="expense">Expense</form:label>
				<form:input path="expense" />
			</p>
			<p>
				<form:label path="vendor">Vendor</form:label>
				<form:input path="vendor" />
			</p>
			<p>
				<form:label path="amount">Amount$</form:label>
				<form:input type="number" path="amount" step="any"/>
			</p>
			<p>
				<form:label path="descritpion">Description</form:label>
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
	</div>

</body>
</html>