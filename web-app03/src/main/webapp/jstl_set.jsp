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
		<%@include file="jspf/jstl_left.html"%>
		<h1 style="text-align: center;">c:choose when otherwise</h1>
		<c:if test="${not empty list }">
			<h3>list of employes</h3>
			<div class="list-group">
				<c:forEach items="${list}" var="emp">
					<c:choose>
						<c:when test="${emp.title == 'title1'}">
							<a class="list-group-item"> 
							<span class="list-group-item-info">${emp.firstName} - ${emp.lastName}</span>
								<p>- ${emp.title}</p>
							</a>
						</c:when>
						<c:when test="${emp.title == 'title3'}">
						<c:set var="emp3" value="${emp}"/>
							<a class="list-group-item"> 
							<span class="list-group-item-dark">${emp.firstName} - ${emp.lastName}</span>
								<p>- ${emp.title}</p>
							</a>
						</c:when>
						<c:otherwise>
							<a class="list-group-item"> <span class="list-group-item">${emp.firstName} - ${emp.lastName}</span>
								<p>- ${emp.title }</p>
							</a>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				
			<h3><c:out value="${emp3}"/></h3>
			</div>
		</c:if>
	</div>
</body>
</html>