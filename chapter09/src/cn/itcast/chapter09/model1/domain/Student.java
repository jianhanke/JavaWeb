package cn.itcast.chapter09.model1.domain;

public class Student {
	private String name;
	private int age;
	private boolean flag;
	
	public Student() {
		System.out.println("无参构造方法"+name+age+flag);
	}
	
	public Student(String name){
		this.name=name;
		this.name="20";
		System.out.println("实例化方法"+name);
		System.out.println("实例化方法"+this.name);
	}
	{
		this.flag=true;
		this.name="all";
		System.out.println("初始化");
	}
	static {
		System.out.println("静态方法");
	}
	public static void main(String[] args) {
		Student student=new Student("hanke");
		Student student2=new Student();
	}
}
