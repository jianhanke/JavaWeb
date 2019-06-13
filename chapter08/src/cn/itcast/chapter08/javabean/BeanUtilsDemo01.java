package cn.itcast.chapter08.javabean;
import cn.itcast.chapter08.javabean.Person0;



import org.apache.commons.beanutils.BeanUtils;



public class BeanUtilsDemo01 {
	
	public static void main(String[] args) throws Exception {
	Person0 p=new Person0();
	
	BeanUtils.setProperty(p,"name","Jack");
	BeanUtils.setProperty(p,"age",10);
	
	String name=BeanUtils.getProperty(p, "name");
	String age=BeanUtils.getProperty(p,"age");
	
	System.out.println("我的名字是:"+name+"我的年龄是"+age);
	}
}
