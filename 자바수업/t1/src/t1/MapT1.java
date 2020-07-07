package t1;

import java.util.*;

public class MapT1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("1번", 1);
		map.put("2번", 2);
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);		
			System.out.println(value+"키값");
		}
	}
}
