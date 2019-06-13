package cn.itcast.chapter06.session.ceshi;

import java.util.*;

import com.sun.javafx.collections.MappingChange.Map;

import cn.itcast.chapter06.session.exampl01.Book;

public class BookDB2 {
		
		private static LinkedHashMap<String,Book2> books=new LinkedHashMap<String,Book2> ();
		
		static {
			books.put("1",new Book2("1","���ǵ�һ����11"));
			books.put("2",new Book2("2","���ǵڶ�����2222"));
			books.put("3",new Book2("3","���ǵ�������33333333"));
			books.put("4",new Book2("4","���ǵ��ı���44444444444"));
			books.put("5",new Book2("5","���ǵ��屾��55555555555555"));
		}
		public static Collection<Book2> getAll() {
			return books.values();
		}
		public static Book2 getBook(String id) {
			return ((LinkedHashMap<String, Book2>) books).get(id);
			
		}
	
	
	
}