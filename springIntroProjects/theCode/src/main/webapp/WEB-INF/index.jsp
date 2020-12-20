<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>What is the code?</h1>
 	<form action="/tryagain" method="post" id="form1">
 		<span><c:out value="${errors}" /></span><br>
  		<input type="text" id="guestGuess" name="uGuess" placeholder="What is the code?"/><br>
  		<button type="submit" form="form1" value="Submit">Try Code!</button>
	</form>
	<p>The code you input was: <c:out value="${uGuess}"/></p>
</body>
</html>