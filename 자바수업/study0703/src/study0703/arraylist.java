package study0703;

import java.util.*;

public class arraylist {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("1��sadddddddddddd");
		set.add("2��sssssssssssssssss");
		set.add("3��ssssssssssssssss");
		set.add("4��ssssssssssssssss");
		set.add("5��ssssssssssssssss");
		set.add("6��ssssssssssssssss");
		set.add("7��ssssssssssssssss");
		set.add("8��");
		set.add("9��");
		set.add("10��");
		set.add("11��");
		set.add("12��");
		set.add("13��");
		set.add("14��");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		for(String str2 : set) {}
	}
}
