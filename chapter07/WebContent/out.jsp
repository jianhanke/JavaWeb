<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("first line<br>");
response.getWriter().println("second line<br>");
response.getWriter().println("third  line<br>");

%>
</body>
</html>