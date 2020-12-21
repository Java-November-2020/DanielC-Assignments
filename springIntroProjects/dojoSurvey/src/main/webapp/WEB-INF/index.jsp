<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
	<div class="jumbotron">
  		<h1 class="display-3">Take the Survey!</h1>
  	</div>

	<div class="col-6 mx-auto">
		<form action="/viewData" method="post" class="col m-3" style="border: solid black 1px">
  			<div class="form-group row">
    			<label for="name" class="col-sm-1 m-2 mr-1 col-form-label">Name: </label>
    			<div class="col-sm-4">
      				<input name="name" value="name" type="text" class="form-control m-2" id="name" placeholder="Smitty Werbenjagermanjensen">
    			</div>
  			</div>
  			<div class="form-group row">
    			<label for="favIDE" class="col-sm-1 m-2 col-form-label">Favorite IDE:  </label>
    			<div class="col-sm-4">
						<select name="IDE" class="custom-select">
  							<option selected>Open this select menu</option>
  							<option value="Sprint Boot Suite" id="IDE">Sprint Boot Suite</option>
  							<option value="VS Code" id="IDE">VS Code</option>
  							<option value="Xcode" id="IDE">Xcode</option>
  							<option value="Pycharm" id="IDE">Pycharm</option>
						</select>
    			</div>
    			
  			</div>
  			<div class="form-group row">
    			<label for="favLang" class="col-sm-1 m-2 col-form-label">Favorite Language:  </label>
    				<div class="col-sm-4">
						<select name="favLang" class="custom-select">
  							<option selected>Open this select menu</option>
  							<option value="CSS" id="favLang">CSS</option>
  							<option value="Javascript" id="favLang">Javascript</option>
  							<option value="Python" id="favLang">Python</option>
  							<option value="Java" id="favLang">Java</option>
  							<option value="C" id="favLang">C</option>
  							<option value="C#" id="favLang">C#</option>
  							<option value="C++" id="favLang">C++</option>
  							<option value="Ruby" id="favLang">Ruby</option>
  							<option value="HTML" id="favLang">HTML</option>
						</select>
    				</div>
  			</div>
  			<label for="comments">Comments (optional)</label><br>
			<textarea id="comments" name="comments" rows="4" cols="94"></textarea> 
			<button type="submit" class="btn btn-primary" value="submit">Submit</button>
		</form>
	</div>
</body>
</html>









