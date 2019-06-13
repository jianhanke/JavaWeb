package cn.itcast.chapter09.model1.domain;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Ceshi {
	
	public static void main(String[] args) throws Exception {
		
		Class clazz=Class.forName("cn.itcast.chapter09.model1.domain.UserBean");
		UserBean user=(UserBean) clazz.newInstance();
		
		System.out.println(user.getClass());
		
		Constructor[] constructor = clazz.getConstructors();
		Object user2=constructor[1].newInstance("name");
		
		System.out.println(user2);
		
		UserBean user3=new UserBean("ceshi");
		System.out.println(user3);
		
//		UserBean user3=new UserBean();   测试new and newInstance的区别
		
		Field nemaField=clazz.getDeclaredField("name");
		nemaField.setAccessible(true);
		nemaField.set(user2,"测试名");
		System.out.println(user2);
		
		
	}
	
}
