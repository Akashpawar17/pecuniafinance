package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

//PREDICATE FUNCTION RETURNS BOOLEAN DATA TYPE
public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<String> p = c -> c.equalsIgnoreCase("akash");
		String l = "Akash";

		System.out.println(p.test(l));
//////
		Predicate<Integer> p1 = x -> x % 2 == 0;
		System.out.println(p1.test(10));
	}

}
