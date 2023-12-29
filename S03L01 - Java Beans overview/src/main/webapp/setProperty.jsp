<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Property</title>
</head>
<body>
<jsp:useBean id="user" class="org.studyeasy.beans.User" scope="session"></jsp:useBean>

<jsp:setProperty property="firstName" name="user" value="Chaand"/><br/>
<jsp:setProperty property="lastName" name="user" value="Sheikh"/>

Values are updated

</body>
</html>