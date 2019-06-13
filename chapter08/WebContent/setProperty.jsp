<%@ page language="java" contentType="text/html; charset=UTF-8"	
import="cn.itcast.chapter08.javabean.Manager"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="">
公司 <input type="text" name="crop"> <br>
奖金22<input type="text" name="company"> <br>
奖金<input type="text" name="reward"> <br>

<input type="submit" value="提交">

</form>


<jsp:useBean id="manager" class="cn.itcast.chapter08.javabean.Manager" />
<jsp:setProperty name="manager" property="bonus" value="1000"  />
<jsp:setProperty name="manager" property="company" value="itcast" />





<%
	 manager=(Manager)pageContext.getAttribute("manager");
	 out.write("bonus属性的值为:"+manager.getBonus()+"<br>" );
	 out.write("company属性的值为:"+manager.getCompany()); 
%>

</body>
</html>