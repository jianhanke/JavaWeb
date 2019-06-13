<%@ page language="java" contentType="text/html; charset=UTF-8"
    %>
    <%@page errorPage="execp.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String strprice=request.getParameter("price");
double price=Double.parseDouble(strprice);
out.println("Total price="+price*3);

%>

</body>
</html>