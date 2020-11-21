package com.java8;

import java.util.function.Predicate;

public class StringPredicateJoining {
	/*
	 * public static void m2(Predicate<String> s,String[] s1) { for (String x : s1)
	 * { System.out.println(x);
	 * 
	 * }
	 */
	

	public static void main(String[] args) {
		String[] s= {"akash","mahesh","nagendra","vicky"};
		Predicate<String> s1=x->x.equals("akash");
		Predicate<String> s2=x->x.equalsIgnoreCase("Mahesh");
		System.out.println(s1.test("akash"));
		System.out.println(s1.negate());
		 
	}

}
