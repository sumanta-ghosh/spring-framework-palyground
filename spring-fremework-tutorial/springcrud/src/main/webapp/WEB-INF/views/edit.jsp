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
				<h1 class="text-center mb-3">Edit Product</h1>
				<c:if test="${not empty successMsg}">
					<div class="alert alert-success" role="alert">${successMsg}</div>
				</c:if>
				<c:if test="${not empty errorMsg}">
					<div class="alert alert-danger" role="alert">${errorMsg}</div>
				</c:if>

				<form action="${pageContext.request.contextPath}/product/edit/${product.id}" method="POST">
					<input type="hidden" name="id" value="${product.id}">
					<div class="form-group">
						<label>Product Title</label> <input type="text" name="title" value="${product.title}" class="form-control"
							placeholder="Enter product title">
					</div>
					<div class="form-group">
						<label>Product Description</label>
						<textarea rows="4" class="form-control" name="description">${product.description}</textarea>
					</div>
					<div class="form-group">
						<label>Product Price</label> <input type="number" name="price" value="${product.price}" class="form-control"
							placeholder="Enter product price">
					</div>
					<div class="container text-right">
						<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Update</button>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>