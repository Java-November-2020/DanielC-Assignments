<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter for My Server</title>
</head>
<body>
	<p>You have visited <a href="/counter"></a> <c:out value="${counter}"/> times.</p>
	<p><a href="/">Test another visit?</a></p>
	<p><a href="/counterTwo">Add by two!</a></p>
	<p><a href="/reset">Wanna reset?</a></p>
</body>
</html>