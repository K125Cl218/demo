<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8" session="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>JSTL core example</title>
</head>
<body>
	<div class="container" style="background: #cdd; height: 100%;">
		<%@include file="jspf/jstl_left.html" %>
		<h1 style="text-align: center;">c:forEach</h1>
		<c:if test="${not empty list}">
			<h3>list of employees</h3>
			<ul class="list-group">
			<c:forEach items="${list}" var="emp">
					<li class="list-group-item">${emp}</li>
			</c:forEach>
			</ul>
		</c:if>
	</div>
</body>
</html>