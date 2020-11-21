package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
	Set<String> s=new HashSet<>();
	s.add("john");
	s.add("akash");
	s.add("don");
	//IF WE WANT TO SORT A SET WE CAN DO IT USING TREESET
Set<String>	s1=new TreeSet<>(s);
//s1.addAll(s);
System.out.println(s1);
	/*
	 * List<String> l=new ArrayList<>(s); Collections.sort(l);
	 */
	/*
	 * for (String s1 : s) { System.out.println(s1);
	 * 
	 * }
	 */
	/*
	 * Iterator<String> it=s.iterator(); while (it.hasNext()) {
	 * System.out.println(it.next());
	 * 
	 * }
	 */
	} 

}
