package cn.itcast.chapter06.cookie.example;

public class CeshiStatic {
		
	public static void main(String[] args) {
		Student t1=new Student();
		Student t2=new Student();
		Student.schoolName="回中";
		System.out.println("我的学校是:"+Student.schoolName);
		System.out.println("我的学校是:"+t1.schoolName);
		Student.schoolName="按时";
		System.out.println("我的学校是:"+t1.schoolName);
	}
	
}
class Student{
	static String schoolName;
}
