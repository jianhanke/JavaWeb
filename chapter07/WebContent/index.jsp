<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>

<%
pageContext.setAttribute("pageContext","pageContext");
request.setAttribute("request","request");
session.setAttribute("session","session");
application.setAttribute("application","application");

%>
<%=pageContext.getAttribute("pageContext") %> <br>
<%=request.getAttribute("request") %> <br>
<%=session.getAttribute("session") %> <br>
<%=application.getAttribute("application") %> <br>


<% request.getRequestDispatcher("index.jsp").include(request,response);  %>

<a href="/chapter07/index2.jsp">跳转到另一个jsp文件</a>
<br>
<a href="/chapter07/Index3" >跳转到Servlet容器</a>


</body>
</html>