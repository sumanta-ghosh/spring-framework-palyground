<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Spring Core MVC :: ${pageName}</title>
</head>
<body>
	<div class="container mt-5">
		<a href="/springmvc/">Home</a> <a href="/springmvc/about">About</a> <a href="/springmvc/contact-us">Contact Us</a>
		<div>
			<form action="" method="POST">
				<div class="form-group">
					<label for="exampleInputEmail1">Email address</label> 
					<input type="email" 
						name="userEmail" 
						value="${user.userEmail}"
						class="form-control"
						id="exampleInputEmail1" 
						aria-describedby="emailHelp" 
						placeholder="Enter email">
						<c:if test = "${not empty userEmailErr}">
							<small class="form-text text-muted">${userEmailErr}</small>
						</c:if>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Password</label> 
					<input 
						type="password"
						name="userPassword" 
						value="${user.userPassword}"
						class="form-control"
						id="userPassword" 
						placeholder="Password">
						<c:if test = "${not empty userPasswordErr}">
							<span>${userPasswordErr}</span>
						</c:if>
				</div>
				<div class="form-check">
					<input type="checkbox" class="form-check-input" id="exampleCheck1" value="y" name="iAgree"> <label class="form-check-label"
						for="exampleCheck1">Check me out</label>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
