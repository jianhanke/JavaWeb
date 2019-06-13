package cn.itcast.chapter08.javabean;

import java.lang.reflect.Field;

public class ReflectDemo03 {
	
	public static void main(String[] args)throws Exception {
		Class clazz=Class.forName("cn.itcast.chapter08.javabean.Person2");
		Object p=clazz.newInstance();
		
		Field nameField=clazz.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(p,"李四");
		System.out.println(p);
		
		Field ageField=clazz.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(p, 20);
		System.out.println(p);
		
		
	}

}

class Person3 {
	private String name;
	public  int age;
	
	public String toString() {
		return "姓名:"+this.name+",年龄:"+this.age;
	}
}
