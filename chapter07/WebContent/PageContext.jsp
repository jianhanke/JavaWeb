<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>

<%
	String ip2=request.getRemoteAddr();
	out.print(ip2);
	
	HttpServletRequest req=(HttpServletRequest)pageContext.getRequest();
	String ip=request.getRemoteAddr();
	out.print(ip);
%>
	

</body>
</html>