package t1;

import java.util.*;

public class netwalk {
	public static Map<String,Integer> map = new HashMap<>();
	public static List<String> list = new ArrayList<>();
	public static Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		set.add("네트워크");
		list.add("수행평가!");
		map.put("map", 1);
		
		
		System.out.println(list.get(0));
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String str =iter.next();
			System.out.println(str);
		}
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyInterator = keySet.iterator(); 
		while(keyInterator.hasNext()) {
			String str =keyInterator.next();
			int value = map.get(str);
			System.out.println(value);
		}	
	}	
}

