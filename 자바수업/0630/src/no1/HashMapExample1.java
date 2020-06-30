package no1;

import java.util.*;
public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("½Å¿ë±Ç", 85);
		map.put("È«±æµ¿", 90);
		map.put("µ¿Àå±º", 80);
		map.put("È«±æµ¿",95);
		
		System.out.println("ÃÑ entry¼ö : " + map.size());
		System.out.println("\tÈ«±æµ¿ : "+map.get("È«±æµ¿"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = iterator.next();
			int value = map.get(key);
			System.out.println();
		}
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		iterator<Map.Entry<String,I>
	}
	
	
}
