<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		HttpServletRequest req=(HttpServletRequest)pageContext.getRequest();
		String ip=request.getRemoteAddr();
		out.println("本机IP地址为:"+ip);
	
	%>

</body>
</html>