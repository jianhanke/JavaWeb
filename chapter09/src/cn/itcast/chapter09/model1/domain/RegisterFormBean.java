package cn.itcast.chapter09.model1.domain;

import java.util.HashMap;
import java.util.Map;

public class RegisterFormBean {
	
	private String name;
	private String password;
	private String password2;
	private String email;
	private Map<String,String> errors=new HashMap<String,String> (); 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public Map<String, String> getErrors() {
		return errors;
	}
	public void setErrors(String errorName,String errorInfo) {
		
		errors.put(errorName, errorInfo);
		
	}
	
	public boolean validate() {
		
		boolean flag=true;
		
		if(name==null || "".equals(name)) {
			this.errors.put("name","请输入姓名");
			flag=false;
		}
		if(password==null || "".equals(password)) {
			this.errors.put("password","密码不能为空");
			flag=false;
		}
		if(password2==null || "".equals(password2)) {
			this.errors.put("password2","确认密码不能为空");
			flag=false;
		}
		if(email==null || "".equals(email)) {
			this.errors.put("email","邮件不能为空");
			flag=false;
		}
		return flag;
	}
	
	
	
}
