package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> c = new ArrayList<>();
		c.add(100);
		c.add(200);
		c.add(1, 300);
		/*
		 * System.out.println("USING FOR EACH LOOP"); for (Integer i : c) {
		 * System.out.println(i);
		 * 
		 * } System.out.println("LIST CONVERTING INTO SET INTERFACE"); Set<Integer>
		 * s=new HashSet<>(c); for (Integer s1 : s) { System.out.println(s1);
		 * 
		 * }
		 */
		List<String> l = new LinkedList<>();
		l.add("mahesh");
		l.add("akash");
		// l.add("akash");
		l.add("nagendra");
		//l.add(0, "sai");
		Collections.reverse(l);
		System.out.println(l);
		Set<String> s=new HashSet<>(l); 
		for (String s1 : s) {
			System.out.println(s1);
			
		}
		
		//Collections.sort(l);
	//List<String> l1=l.stream().filter(x->x.length()>6).collect(Collectors.toList());
	//System.out.println(l1);
		// USING FOREACH METHOD
		

		/*
		 * for (String s : l) { System.out.println(s);
		 * 
		 * }
		 */
		/*
		 * System.out.println("USING ITERATOR"); Iterator<Integer> it = c.iterator();
		 * while (it.hasNext()) { System.out.println(it.next()); }
		 */
		// USING LIST ITERATOR
		/*
		 * ListIterator<Integer> it1 = c.listIterator(); while (it1.hasNext()) {
		 * System.out.println(it1.next()); } while (it1.hasPrevious()) {
		 * System.out.println(it1.previous());
		 * 
		 * }
		 */
	}

}
