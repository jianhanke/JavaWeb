package cn.itcast.chapter09.model1.domain;

import java.util.HashMap;

public class DBUtil {
	
	private static DBUtil instance=new DBUtil(); 
	HashMap<String,UserBean> users=new HashMap<String,UserBean>();
	private DBUtil() {
		
		UserBean user1=new UserBean();
		user1.setName("Jock");
		user1.setPassword("123456");
		user1.setEmail("3123@qq.com");
		
		UserBean user2=new UserBean();
		user2.setName("Rose");
		user2.setPassword("123456");
		user2.setEmail("42141243@qq.com");
		
		users.put("Jock", user1);
		users.put("Rose", user2);
	}
	
	public static DBUtil getInstance() {
		return instance;
	}
	
	public UserBean getUser(String userName) {
		UserBean user=users.get(userName);
		return user;
	}
	
	public boolean insertUser(UserBean user) {
		
		if(user==null) {
			return false;
		}
			String userName=user.getName();
			if(users.get(userName)!=null) {
				return false;
			}
			users.put(userName, user);
			return true;

	}
	
}
