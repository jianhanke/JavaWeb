package cn.itcast.chapter09.model1.domain;

public class Student {
	private String name;
	private int age;
	private boolean flag;
	
	public Student() {
		System.out.println("�޲ι��췽��"+name+age+flag);
	}
	
	public Student(String name){
		this.name=name;
		this.name="20";
		System.out.println("ʵ��������"+name);
		System.out.println("ʵ��������"+this.name);
	}
	{
		this.flag=true;
		this.name="all";
		System.out.println("��ʼ��");
	}
	static {
		System.out.println("��̬����");
	}
	public static void main(String[] args) {
		Student student=new Student("hanke");
		Student student2=new Student();
	}
}
