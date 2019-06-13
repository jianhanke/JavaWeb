<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="cn.itcast.chapter09.model1.domain.UserBean"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		UserBean user2=(UserBean)session.getAttribute("username");
	%>
	
	<jsp:useBean id="user" class="cn.itcast.chapter09.model1.domain.UserBean" scope="session" />
	
	
	恭喜你登录成功
	你的姓名:<jsp:getProperty name="user" property="name" /> 
	你的密码:<jsp:getProperty name="user" property="password" />
	你的邮箱: <jsp:getProperty name="user" property="email" />
	
</body>
</html>