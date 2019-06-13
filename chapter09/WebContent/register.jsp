<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="ControllerServlet" method="post">
		    <h3>用户注册</h3>
		    <div id="outer">
			    <div>
				    <div class="ch">姓名:</div>
				  	<div class="ip">
				  	<input type="text" name="name" value="${register.name }" >
				  	<font color="red">${register.errors.name } ${register.errors.dbError } </font>
				  	</div>
			    </div>
			<div>
				    <div class="ch">密码:</div>
				    <div class="ip">
					<input type="text" name="password" value="${register.password}" } >
					<font color="red">${register.errors.password } </font>
				    </div>
			    </div>
			 <div>
				    <div class="ch">确认密码:</div>
				    <div class="ip">
					  <input type="text" name="password2" value="${register.password2 }" >
					  <font color="red"> ${register.errors.password2} </font>
				    </div>
			 </div>
			   	 <div>
				    <div class="ch">邮箱:</div>
				    <div class="ip">
					   <input type="text" name="email" value="${register.email }" >
					   <font color="red">  ${register.errors.email} </font>
				    </div>
			    </div>
			<div id="bt">
				    <input type="submit">
			</div>
		    </div>
</form>

</body>
</html>