<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Welcome to Dogs-dot</title>
</head>
<body>
	<div class="container">
	<h1>Welcome to Dogs dot com</h1>
	<table class="table table-dark">
		<thead>
			<tr>
				<th>id</th>
				<th>Name</th>
				<th>Breed</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
		<!-- 
		Items is what we named it in viewModel in the controller
		Var is going to be the iterator
		 -->
			<c:forEach items="${allDogs}" var="dog">
			<tr>
				<td>${dog.id}</td>
				<td>${dog.name}</td>
				<td>${dog.breed}</td>
				<td>${dog.age}</td>
			</tr>
			</c:forEach>
		</tbody>	
	</table>
	</div>
</body>
</html>