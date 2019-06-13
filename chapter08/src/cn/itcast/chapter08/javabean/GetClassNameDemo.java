package cn.itcast.chapter08.javabean;

class X{}

public class GetClassNameDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		X x=new X();
		Class s=Class.forName("cn.itcast.chapter08.javabean.X");
		
		System.out.println(x.getClass());
		System.out.println(x.getClass().getName());
		System.out.println(s);
		System.out.println(X.class);
	}
	
}
