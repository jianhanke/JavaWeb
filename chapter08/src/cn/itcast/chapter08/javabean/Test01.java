package cn.itcast.chapter08.javabean;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class Test01 {

	public static void main(String[] args) throws Exception {

		Person5 p=new Person5();
		
		BeanUtils.setProperty(p, "name", "youjun");
		BeanUtils.setProperty(p, "age", 20);
		String name=BeanUtils.getProperty(p, "name");
		String age=BeanUtils.getProperty(p, "age");  //返回类型是字符串
		
		
		float b=  1.002f;
		System.out.println(1.01+1.02);
		System.out.println(1.001f+1.002f);
		
		String num="0300000000000002";
		System.out.println(num.length());
		
		System.out.println(name+age);

	}

}
