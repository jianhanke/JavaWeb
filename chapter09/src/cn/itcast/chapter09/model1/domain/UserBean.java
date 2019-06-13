package cn.itcast.chapter09.model1.domain;

public class UserBean {

	private String name;
	private String password;
	private String email;
	
	static {
		System.out.println("newInstanceÀàµÄ¶¯Ì¬²âÊÔ");
	}
	
	public UserBean(String name) {
		this.name=name;
	}
	
	public UserBean() {
		
	}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "ĞÕÃû"+name+"ÃÜÂë"+password+"ÓÊÏä"+email;
	}
	
	
}
