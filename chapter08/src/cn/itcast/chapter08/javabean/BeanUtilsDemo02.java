package cn.itcast.chapter08.javabean;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class BeanUtilsDemo02 {
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("cn.itcast.chapter08.javabean.Person0");
		Person0 p=(Person0)clazz.newInstance();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("name", "ÕÅÈýsan");
		map.put("age", 10);
		
		BeanUtils.populate(p,map);
		System.out.println(p);
		
		System.out.println(p.getClass());
		System.out.println(p.getClass().getName());
	}
}
