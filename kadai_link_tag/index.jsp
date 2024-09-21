<%@ page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>kadai_link_tag</title>
	</head>
	<body>
		<a href="<%= request.getContextPath() %>/link">名前「侍太郎」をServletに送信</a>
		<%
		String text = (String) request.getAttribute("text");
		if(text != null){
		%>
		<p><%= text %></p>
		<%
		}
		%>
	</body>
</html>
