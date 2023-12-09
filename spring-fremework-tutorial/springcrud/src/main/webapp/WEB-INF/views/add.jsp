<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Add Product</h1>
				<form action="${pageContext.request.contextPath}/product/add" method="POST">
					<div class="form-group">
						<label>Product Title</label> <input type="text" name="title" value="" class="form-control"
							placeholder="Enter product title">
					</div>
					<div class="form-group">
						<label>Product Description</label>
						<textarea rows="4" class="form-control" name="description"></textarea>
					</div>
					<div class="form-group">
						<label>Product Price</label> <input type="number" name="title" value="" class="form-control"
							placeholder="Enter product price">
					</div>
					<div class="container text-right">
						<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Add</button>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>