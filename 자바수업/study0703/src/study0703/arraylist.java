package study0703;

import java.util.*;

public class arraylist {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("1번sadddddddddddd");
		set.add("2번sssssssssssssssss");
		set.add("3번ssssssssssssssss");
		set.add("4번ssssssssssssssss");
		set.add("5번ssssssssssssssss");
		set.add("6번ssssssssssssssss");
		set.add("7번ssssssssssssssss");
		set.add("8번");
		set.add("9번");
		set.add("10번");
		set.add("11번");
		set.add("12번");
		set.add("13번");
		set.add("14번");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		for(String str2 : set) {}
	}
}
