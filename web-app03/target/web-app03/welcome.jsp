<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
	<%@include file="jspf/header.html"%>
	
	<h3 style="text-align: center;">Hello ${employee}</h3>
	
	<%@include file="jspf/footer.html" %>
</body>
</html>