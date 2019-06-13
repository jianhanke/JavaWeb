<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  
	for(int i=0;i<=10;i++){  
	 out.print(i); 	
 }
%>

<%
	int x=3;
	
%>

<%
out.println(x);
%>
<h2>标题党</h2>

<%
	for(int i=1;i<3;i++){%>
	
		<h<%=i %>>itcast2 </h<%=i %>>
			
	<% } %> 
<% out.println("这是一个测试"); %>

<%!
	static{
	System.out.println("JSp 什么时候实例化");
	System.out.println("Jsp文件实例化测试");
}
%>
<%!
 public void jspInit(){
	System.out.println("实例化测试");
}

%>

</body>
</html>