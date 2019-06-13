<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="cn.itcast.chapter08.javabean.Manager2"
	import="java.util.Date"
	import="java.text.SimpleDateFormat"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<%
	Date date=new Date();
	pageContext.setAttribute("date",date);
%>

<jsp:useBean id="manager" class="cn.itcast.chapter08.javabean.Manager2" />
<jsp:setProperty name="manager" property="birthday" value="${date}" />

<%
	
	manager=(Manager2)pageContext.getAttribute("manager");
	String formatDate=new SimpleDateFormat("yyyy-MM--dd hh:mm:ss").format(manager.getBirthday());
	out.println("birthday属性的值为:"+formatDate);
	
%>

	
</body>
</html>