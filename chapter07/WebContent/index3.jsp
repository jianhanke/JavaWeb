<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>


<%=pageContext.getAttribute("pageContext") %> <br>
<%=request.getAttribute("request") %> <br>
<%=session.getAttribute("session") %> <br>
<%=application.getAttribute("application") %> <br>

</body>
</html>