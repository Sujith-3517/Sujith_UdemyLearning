<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ page import="org.studyeasy.HelloClass, java.util.Date" %>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
<%= new HelloClass().demo() %>

<% out.print(new Date());  %>
</body>
</html>