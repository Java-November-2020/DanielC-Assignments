<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Add New Car</title>
</head>
<body>
	<div class="container">
		<h1>Add New Car</h1>
		<c:forEach items="${errors}" var="err">
		<p>${err}</p>
		</c:forEach>
		<hr>
		<form:form method="POST" action="/add" modelAttribute="car">
			<div class="form-group">
				<form:label path="make"> Make: 
				<form:errors path="make"/>
				<form:input path="make"/>
				</form:label>
			</div>
			<div class="form-group">
				<form:label path="model"> Model: 
				<form:errors path="model"/>
				<form:input path="model"/>
				</form:label>
			</div>
			<div class="form-group">
				<form:label path="color"> Color: 
				<form:errors path="color"/>
				<form:input path="color"/>
				</form:label>
			</div>
			<div class="form-group">
				<form:label path="year"> Year: 
				<form:errors path="year"/>
				<form:input path="year"/>
				</form:label>
			</div>
			<div class="form-group">
				<form:label path="transmission"> Transmission: 
				<form:errors path="transmission"/>
				<form:input path="transmission"/>
				</form:label>
			</div>
			<button class="btn btn-dark">Create New Car</button>
		</form:form>
		<hr>
		
		
		<h1>NON-JSTL/Regular HTML WAY TO ADD CARS</h1>
		<form action="/add" method="POST">
			<div class="form-group">
				<label for="make"> Make </label>
				<input type="text" name="make">
			</div>
			<div class="form-group">
				<label for="model"> Model </label>
				<input type="text" name="model">
			</div>
			<div class="form-group">
				<label for="color"> Color </label>
				<input type="text" name="color">
			</div>
			<div class="form-group">
				<label for="year"> Year </label>
				<input type="text" name="year">
			</div>
			<div class="form-group">
				<label for="transmission"> Transmission </label>
				<input type="text" name="transmission">
			</div>
			<button>Add Car</button>
		</form>
	</div>
</body>
</html>