package com.java8;

import java.util.function.Predicate;

public class PredicateJoining {
	public static void m1(Predicate<Integer> p,int[] x) {
		for (int x1 :  x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
			
		}
		
	}

	public static void main(String[] args) {
		int[] x= {0,2,4,1,6,8,12,31,11};
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		System.out.println("Number greater than 10");
		m1(p1,x);
		m1(p2,x);
		System.out.println("Predicate joining negate method");
		m1(p1.negate(),x);
		System.out.println("And method");
		m1(p1.and(p2),x);
		System.out.println("Or method");
		m1(p1.or(p2),x);
		
		
		

	}

}
