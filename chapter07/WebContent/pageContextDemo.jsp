<%@ page language="java" contentType="text/html; charset=UTF-8"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

pageContext.setAttribute("company","北京传智播客教育有限公司",pageContext.SESSION_SCOPE);
request.setAttribute("name","剑寒客");


Object name=pageContext.getAttribute("company",pageContext.PAGE_SCOPE);
out.println("公司名称:"+name+"<br />");
		
	Object name2=pageContext.getAttribute("company");
	out.println(name2+"<br />");
	
	pageContext.getSession();
	
%>
	${sessionScope.company } <br />
	${requestScope.name } <br />

</body>
</html>