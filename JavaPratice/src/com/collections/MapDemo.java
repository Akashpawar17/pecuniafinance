package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "akash");
		map.put(3, "mahesh");
		map.put(4, "rajesh");
		map.put(2, "nagendra");
		// CASE 1:USING MAP.ENTRY IT WILL PRINT BOTH KEYS AND VALUES
		/*
		 * for (Map.Entry<Integer, String> entry : map.entrySet()) {
		 * System.out.println(entry.getKey()+""+entry.getValue());
		 * 
		 * }
		 */

		// CASE 2:
		// FOR PRINTING KEYS
		for (Integer s : map.keySet()) {
			//case 5:first we can get keys then we can get  the names by using map.get();
			String s3=map.get(s);
			System.out.println(s+":"+s3);

		} // FOR PRINTING VALUES
		/*
		 * for (String s : map.values()) { System.out.println(s);
		 * 
		 * }
		 */

		// CASE 3:
		/*
		 * Iterator<Map.Entry<Integer, String>> i=map.entrySet().iterator(); while
		 * (i.hasNext()) { Entry<Integer, String> m =i.next();
		 * System.out.println(m.getKey()+""+m.getValue());
		 */ // CASE 4:
		map.forEach((k, v) -> System.out.println("key-" + k + ":" + "value-" + v));
	}
}
