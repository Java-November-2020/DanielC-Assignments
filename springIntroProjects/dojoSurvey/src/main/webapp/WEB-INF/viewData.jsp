<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta charset="ISO-8859-1">
<title>My Data</title>
</head>
<body>
	<h1>Submitted Info</h1>
	<p><Strong>Name: </Strong><c:out value="${name}" /></p><br>
	<p><Strong>IDE: </Strong><c:out value="${IDE}" /></p><br>
	<p><Strong>Favorite Language: </Strong><c:out value="${favLang}" /></p><br>
	<p><Strong>Comments: </Strong><c:out value="${comments}" /></p><br>
</body>
</html>