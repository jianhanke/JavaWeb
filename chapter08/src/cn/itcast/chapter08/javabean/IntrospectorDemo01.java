package cn.itcast.chapter08.javabean;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;



public class IntrospectorDemo01 {

	public static void main(String[] args)throws Exception{
		Person0 beanObj=new Person0();
		BeanInfo binfo=Introspector.getBeanInfo(Person0.class,beanObj.getClass().getSuperclass());
		PropertyDescriptor[] properties =binfo.getPropertyDescriptors();
		
		for(int i=0;i<properties.length;i++) {
			String name=properties[i].getName();
			Class type =properties[i].getPropertyType();
			System.out.println(name+":"+type.getName());
		}
		
		
	}
	
}
