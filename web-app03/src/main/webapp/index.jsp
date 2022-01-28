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
		<div class="list-group">
			<a href="core?c=if" class="list-group-item">
				example JSTL taglib	core : if
			</a>
			<a href="core?c=forEach" class="list-group-item" class="list-group-item">
				example JSTL taglib core : forEach
			</a>
			<a href="core?c=choose" class="list-group-item" class="list-group-item">
				example JSTL taglib core : choose
			</a>
			<a href="core?c=set" class="list-group-item" class="list-group-item">
				example JSTL taglib core : set
			</a>
		</div>
	</div>
</body>
</html>