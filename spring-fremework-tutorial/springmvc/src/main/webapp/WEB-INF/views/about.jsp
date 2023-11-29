<html>
<body>
	<a href="/springmvc/">Home</a>
	<a href="/springmvc/about">About</a>
	<a href="/springmvc/contact-us">Contact Us</a>
	<a href="/springmvc/signup">Sign up</a>
	<div>
		<%
		String name = (String) request.getAttribute("pageName");
		%>
		<h2>
			This is
			<%=name%>
		</h2>
	</div>
</body>
</html>
