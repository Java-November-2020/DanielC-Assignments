<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My test JSP</title>
</head>
<body>
	<p>Hello World</p>
	<p>
		<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
		<c:out value="${2+2}"/>	
		<br></br>
		<c:out value="${dojoName}"/>
	</p>
</body>
</html>