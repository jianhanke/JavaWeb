<%@ page language="java" contentType="text/html; charset=UTF-8"
    %>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
这是一个测试

<% Thread.sleep(2000); %>
<jsp:include page="welcome.jsp" flush="true" />

测试forward 自带的return 效果

</body>
</html>