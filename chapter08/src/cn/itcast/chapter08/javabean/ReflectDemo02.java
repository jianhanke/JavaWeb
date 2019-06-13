package cn.itcast.chapter08.javabean;

import java.lang.reflect.Constructor;

public class ReflectDemo02 {
	
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("cn.itcast.chapter08.javabean.Person2");
		Constructor cons[]=clazz.getConstructors();
		System.out.println(cons);
		Person2 p=(Person2) cons[1].newInstance("�",20);
		System.out.println(p);
		
	}

}
class Person2{
	private String name;
	private int age;
	public Person2() {
		this.name="����";
		this.age=100;
	}
	public Person2(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
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
		return "����:"+this.name+",����"+this.age;
	}
}