package cn.itcast.chapter06.session.ceshi;

import java.util.*;

import com.sun.javafx.collections.MappingChange.Map;

import cn.itcast.chapter06.session.exampl01.Book;

public class BookDB2 {
		
		private static LinkedHashMap<String,Book2> books=new LinkedHashMap<String,Book2> ();
		
		static {
			books.put("1",new Book2("1","这是第一本书11"));
			books.put("2",new Book2("2","这是第二本书2222"));
			books.put("3",new Book2("3","这是第三本书33333333"));
			books.put("4",new Book2("4","这是第四本书44444444444"));
			books.put("5",new Book2("5","这是第五本书55555555555555"));
		}
		public static Collection<Book2> getAll() {
			return books.values();
		}
		public static Book2 getBook(String id) {
			return ((LinkedHashMap<String, Book2>) books).get(id);
			
		}
	
	
	
}