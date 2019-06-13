<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@page isErrorPage="true"	 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("exception.toString():");
out.println("<br>");
out.println(exception.toString());
out.println("<p>");
out.println("exception.getMessage():");
out.println("<br>");
out.println(exception.getMessage());


%>

</body>
</html>