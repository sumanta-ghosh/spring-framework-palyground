<%@page import="java.util.List"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<a href="/springmvc/">Home</a>
	<a href="/springmvc/about">About</a>
	<a href="/springmvc/contact-us">Contact Us</a>
	<div>
		<h2>This is ${pageName}</h2>
		<ul>
			<c:forEach var="name" items="${friends}">
				<li>${name}</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>
