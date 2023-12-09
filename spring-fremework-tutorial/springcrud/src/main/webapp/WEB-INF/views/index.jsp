<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
<head>
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-12">
				<h2 class="text-center mb-5">Product Dashboard</h2>
				<c:if test="${not empty successMsg}">
					<div class="alert alert-success" role="alert">${successMsg}</div>
				</c:if>
				<div class="container text-right mb-3">
					<a href="${pageContext.request.contextPath}/product/add" class="btn btn-outline-success">Add Product</a>
				</div>
				<table class="table table-sm">
					<thead class="table-dark">
						<tr>
							<th scope="col">#</th>
							<th scope="col">Title</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products}" var="product">
							<tr>
								<th scope="row">${product.id}</th>
								<td>${product.title}</td>
								<td>${product.price}</td>
								<td><a href="${pageContext.request.contextPath}/product/edit/${product.id}" title="Edit"><i
										class="fa-regular fa-pen-to-square"></i></a> <a href="javascript:void(0)"
									onclick="delete_product('${pageContext.request.contextPath}/product/delete/${product.id}')" title="Delete"><i
										class="fa-regular fa-trash-can text-danger"></i></a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script>
		function delete_product(url) {
			if (confirm("Are you sure to delete this product!") == true) {
				window.location.replace(url);
			}
		}
	</script>
</body>
</html>