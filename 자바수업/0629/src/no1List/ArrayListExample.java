package no1List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");//2인덱스 즉 jdbc다음에 들어감
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체 수: "+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : "+skill);
		System.out.println();
		
		for(int i =0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		
		System.out.println();
		
		list.remove(2);//DB삭제
		list.remove(2);//servlet삭제
		
		for(int i =0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
//		for(String get  : list) {
//		
//			System.out.println(":"+get);
//		}
	}

}
