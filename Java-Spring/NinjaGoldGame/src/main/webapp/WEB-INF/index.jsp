<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	</head>

	<body>
		<div>
			<h1>your gold: <c:out value="${counter}"></c:out>
			</h1>

			<form action="/gold" method="post">
				<input type="hidden" name="place" value="clear">
				<button>reset gold</button>
			</form>
			<br>
		</div>

		<div class="bigbox">

			<div class="box">
				<form action="/gold" method="post">
					<h1>Farm</h1>
					<p>(earns 10-20 gold)</p>
					<input type="hidden" name="place" value="farm">
					<button>Find gold!</button>

				</form>
			</div>

			<div class="box">
				<form action="/gold" method="post">
					<h1>cave</h1>
					<p>(earns 5-10 gold)</p>
					<input type="hidden" name="place" value="cave">
					<button>Find gold!</button>

				</form>
			</div>

			<div class="box">
				<form action="/gold" method="post">
					<h1>House</h1>
					<p>(earns 2-5 gold)</p>
					<input type="hidden" name="place" value="house">

					<button>Find gold!</button>

				</form>
			</div>

			<div class="box">
				<form action="/gold" method="post">
					<h1>Quest</h1>
					<input type="hidden" name="place" value="quest">
					<p>(earns/takes 0-50 gold)</p>

					<button>Find gold!</button>

				</form>
			</div>


			<div class="box">
				<form action="/gold" method="post">
					<h1>SPA</h1>
					<p>(take 5-20 gold)</p>
					<input type="hidden" name="place" value="spa">

					<button>Find gold!</button>

				</form>
			</div>

		</div>
		</div>
		<div>
			<h2>Activities:</h2>
			<div class="activities">
				<c:forEach var="item" items="${array}">
					<c:if test="${item.indexOf('win') != -1}">
						<p class="green">
							<c:out value="${item}" />
						</p>
					</c:if>
					<c:if test="${item.indexOf('loss') != -1}">
						<p class="red">
							<c:out value="${item}" />
						</p>
					</c:if>
					

				</c:forEach>
			</div>

		</div>

	</body>

	</html>