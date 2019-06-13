<%@ page language="java" contentType="text/html; charset=UTF-8"
	 import="java.util.Map"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	
	<jsp:useBean id="calculator" class="cn.itcast.chapter09.model1.domain.Calculator"  />
	<jsp:setProperty name="calculator" property="*" />
	
	<%
		if(calculator.validate()){
	%>
		<jsp:getProperty name="calculator" property="firstNum" />
		<jsp:getProperty name="calculator" property="operator" />
		<jsp:getProperty name="calculator" property="secondNum" />
		=<%=calculator.calculate() %>  
	<%
		}else{
			Map<String,String>errors=calculator.getErrors();
			pageContext.setAttribute("errors",errors);
		}
	%>
	
	<form action="" method="post" >
		第一个运算数: <input type="text" name="firstNum" />  <font color="red"> ${errors.firstNum} </font> <br>
		运算符 <select name="operator" style="margin-left:100px"> <br>
				<option value="+">+</option>
				<option value="-">-</option>
				<option value="*">*</option>
				<option value="/">/</option>
			 </select> <br>
		第二个运算数 <input type="text" name="secondNum" /> <font color="red"> ${errors.secondNum}</font> <br>
		<input type="submit" value="计算">
	</form>
	
	<%=calculator.isNullorEmpty()%>
	<%=calculator.isOperator() %>
	
	
	
</body>
</html>