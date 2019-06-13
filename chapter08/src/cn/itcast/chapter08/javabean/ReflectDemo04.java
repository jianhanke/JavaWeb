package cn.itcast.chapter08.javabean;

import java.lang.reflect.Method;

public class ReflectDemo04 {
	
	public static void main(String[] args)throws Exception {
		
		Class clazz=Class.forName("cn.itcast.chapter08.javabean.Person4");
		
		Method md=clazz.getMethod("sayHello", String.class,int.class);
		String result=(String) md.invoke(clazz.newInstance(), "����",35);
		System.out.println(result);
		
		
		Method md2=clazz.getMethod("ceshi");  //���Բ�������
		md2.invoke(clazz.newInstance(), args);
		
		Person4 person4=(Person4) clazz.newInstance();
		person4.ceshi();
		System.out.println(person4.getAge());
	}

}
class Person4{
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
	public void ceshi() {
		System.out.println("���Ƿ���Ĳ���");
	}
	
	public String sayHello(String name,int age) {
		return "��Һ�,����"+name+",�ҽ���"+age+"��!";
	}
	
	
}