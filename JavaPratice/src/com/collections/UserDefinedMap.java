package com.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class UserDefinedMap {

	public static void main(String[] args) {
		Employee e1 = new Employee(111, "sairao", 50000);
		Employee e2 = new Employee(121, "prakash", 30000);
		Employee e3 = new Employee(131, "vikash", 20000);

		Map<Integer, Employee> map = new HashMap<>();
		map.put(101, e1);
		map.put(102, e2);
		map.put(103, e3);

		/*
		 * //COMPARING BY KEY USING STREAMS List<Entry<Integer, Employee>>
		 * s=map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(
		 * Collectors.toList()); System.out.println(s);
		 */
		// COMPARING BY KEY AND REVERSE ORDER USING STREAMS
		// FOR VALUE WE HAVE COMPARING BY VALUE METHOD
		/*
		 * List<Entry<Integer, Employee>>
		 * s=map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.
		 * reverseOrder())).collect(Collectors.toList()); System.out.println(s);
		 * 
		 */

		for (Map.Entry<Integer, Employee> ent : map.entrySet()) {
		int x=	ent.getKey();
		Employee e=ent.getValue();
		System.out.println(e.getEname());
			//System.out.println(ent.getKey() + "" + ent.getValue());

		}

	}

}
