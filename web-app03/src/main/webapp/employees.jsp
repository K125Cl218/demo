<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>
	<%@include file="jspf/header.html"%>
	
	<h3 style="text-align: center;">Hello ${user}</h3>
	
	<%@include file="jspf/footer.html" %>
</body>
</html>