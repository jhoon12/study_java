package no1;

import java.util.*;
public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿",95);
		
		System.out.println("�� entry�� : " + map.size());
		System.out.println("\tȫ�浿 : "+map.get("ȫ�浿"));
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
