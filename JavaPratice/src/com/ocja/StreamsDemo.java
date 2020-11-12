package com.ocja;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		// MAP METHOD-> We can return boolean types with map method
		/*
		 * List<Integer> l=Arrays.asList(1,3,6,2); List<Integer>
		 * squares=l.stream().map(x->x+x).collect(Collectors.toList());
		 * System.out.println(squares);
		 */

		// FILTER METHOD
		
		
		  List<String> l1=Arrays.asList("akash","mahesh","nagendra"); List<String>
		  names=l1.stream().filter(x->x.length()>=6).collect(Collectors.toList());
		  System.out.println(names);
		  
		 
		// SORTED METHOD
		/*
		 * List<String> l1=Arrays.asList("vikash","mahesh","nagendra"); List<String>
		 * names=l1.stream().sorted().collect(Collectors.toList());
		 * System.out.println(names);
		 */// TREMINAL OPERATORS-> TOSET() METHOD
		/*
		 * List<Integer> l=Arrays.asList(1,3,6,2); Set<Integer>
		 * squares=l.stream().map(x->x+x).collect(Collectors.toSet());
		 * System.out.println(squares);
		 */
		// FOREACH METHOD

		/*
		 * List<Integer> l=Arrays.asList(1,3,6,2);
		 * l.stream().map(x->x+x).forEach(y->System.out.println(y));
		 */
		  //METHOD REFERENCE-> forEach(System.out::println);
		//REDUCE METHOD
		
		
		  List<Integer> l=Arrays.asList(1,3,6,2); int
		  even=l.stream().filter(x->x%2==0).reduce(2,(a,i)->a*i);
		  System.out.println(even);
		 }

}
