<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
<h2> Files </h2>
<hr/> 
<!-- Static -->
<%@ include file="file1.txt" %>
<br/>
<!--  Dynamic -->
<jsp:include page="file2.txt"/>
</body>
</html>