package cn.itcast.chapter06.cookie.example;

public class CeshiStatic {
		
	public static void main(String[] args) {
		Student t1=new Student();
		Student t2=new Student();
		Student.schoolName="����";
		System.out.println("�ҵ�ѧУ��:"+Student.schoolName);
		System.out.println("�ҵ�ѧУ��:"+t1.schoolName);
		Student.schoolName="��ʱ";
		System.out.println("�ҵ�ѧУ��:"+t1.schoolName);
	}
	
}
class Student{
	static String schoolName;
}
