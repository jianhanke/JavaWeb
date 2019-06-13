package cn.itcast.chapter08.javabean;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class IntrospectorDemo03 {

	public static void main(String[] args) throws Exception {
		
		Person0 p=new Person0();
		p.setName("�");
		p.setAge(20);
		
		PropertyDescriptor pd=new PropertyDescriptor("name",p.getClass());
		Method md=pd.getReadMethod();
		System.out.println(md.invoke(p));
		
		PropertyDescriptor pd2=new PropertyDescriptor("age",p.getClass());
		Method md2=pd2.getReadMethod();
		System.out.println(md2.invoke(p));
		
		
	}

}
