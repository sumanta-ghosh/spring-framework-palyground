<%@page import="java.util.List"%>
<html>
<body>
	<a href="/springmvc/">Home</a>
	<a href="/springmvc/about">About</a>
	<a href="/springmvc/contact-us">Contact Us</a>
	<div>
		<%
		String name = (String) request.getAttribute("pageName");
		List<String> friends = (List<String>) request.getAttribute("friends");
		%>
		<h2>
			This is
			<%=name%>
		</h2>
		<ul>
			<%
			for (String friendName : friends) {
			%>
			<li><%=friendName%></li>
			<%
			}
			%>
		</ul>
	</div>
</body>
</html>
