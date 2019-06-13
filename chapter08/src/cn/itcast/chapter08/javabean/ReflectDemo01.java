package cn.itcast.chapter08.javabean;

import java.lang.reflect.Field;

public class ReflectDemo01{
	
	public static void main(String[] args) throws Exception{
		Class clazz=Class.forName("cn.itcast.chapter08.javabean.Person");
		Person p=(Person) clazz.newInstance();
		p.setName("¿Ó∑º");
		p.setAge(18);
		
		System.out.println(p);
		Field nameField=clazz.getDeclaredField("name");
		
		nameField.setAccessible(true);
		nameField.set(p, "≈‡ §");
		System.out.println(p);
	}
}

class Person {
	private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "–’√˚:"+this.name+",ƒÍ¡‰"+this.age;
	}
}

