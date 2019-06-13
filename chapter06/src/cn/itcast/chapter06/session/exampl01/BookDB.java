package cn.itcast.chapter06.session.exampl01;

import java.util.*;

import com.sun.javafx.collections.MappingChange.Map;

public class BookDB {
	
	public static void main(String[] args) {
		BookDB book=new BookDB();
	}
	private static LinkedHashMap<String, Book> books=new LinkedHashMap<String,Book>();
	static {
			((HashMap<String, Book>) books).put("1",new Book("1","JavaWeb����"));
		    ((HashMap<String, Book>) books).put("2",new Book("2","jdbc����"));
		    ((HashMap<String, Book>) books).put("3",new Book("3","struts����"));
		    ((HashMap<String, Book>) books).put("4",new Book("4","struts����"));
		    ((HashMap<String, Book>) books).put("5",new Book("5","spring����"));
	}
	public static Collection <Book> getAll(){
		return ((LinkedHashMap<String, Book>) books).values();
	}
	public static Book getBook(String id) {
		return ((LinkedHashMap<String, Book>) books).get(id);
		
	}
	
}
