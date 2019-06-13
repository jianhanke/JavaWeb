<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:useBean id="user" class="cn.itcast.chapter08.javabean.User" />
	
	<jsp:setProperty name="user" property="*" />
	<jsp:setProperty name="user" property="email" param="mail" />

姓名:<jsp:getProperty name="user" property="name" /><br />
性别:<jsp:getProperty name="user" property="gender" /><br />
学历:<jsp:getProperty name="user" property="education" /><br />
邮箱:<jsp:getProperty name="user" property="email" /><br />


</body>
</html>