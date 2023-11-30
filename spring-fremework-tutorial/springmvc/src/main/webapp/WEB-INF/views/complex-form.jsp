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

<title>Spring Core MVC :: Complex Form</title>
</head>
<body>
	<div class="container mt-4">
		<a href="/springmvc/">Home</a> <a href="/springmvc/about">About</a> <a href="/springmvc/contact-us">Contact Us</a>
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex Form</h3>
						<form action="handle-complex-form" method="POST">
							<div class="form-group">
								<label>Name</label>
								<input type="text" class="form-control" placeholder="Type your name" name="name" value="">
							</div>
							<div class="form-group">
								<label>Email</label>
								<input type="email" class="form-control" placeholder="Type your email" name="email" value="">
							</div>
							<div class="form-group">
								<label>DOB</label>
								<input type="text" class="form-control" placeholder="dd/mm/yyyy" name="dob" value="">
							</div>
							<div class="form-group">
								<label>Select Courses</label>
								<select class="form-control" name="courses" multiple="multiple">
									<option value="Java">Java</option>
									<option value="Python">Python</option>
									<option value="PHP">PHP</option>
									<option value="HTML">HTML</option>
								</select>
							</div>
							<div class="form-group">
								<label>Gender</label>
								<div class="form-check form-check-inline">
								  <input class="form-check-input" type="radio" name="gender" id="gender-male" value="m">
								  <label class="form-check-label" for="gender-male">Male</label>
								</div>
								<div class="form-check form-check-inline">
								  <input class="form-check-input" type="radio" name="gender" id="gender-female" value="f">
								  <label class="form-check-label" for="gender-female">Female</label>
								</div>
							</div>
							<div class="form-group">
								<label>Type</label>
								<select class="form-control" name="sudentType">
									<option value="Normal Student">Normal Student</option>
									<option value="Professional">Professional</option>
									<option value="Under Grade">Under Grade</option>
								</select>
							</div>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>
			</div>
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