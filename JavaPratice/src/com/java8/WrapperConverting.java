package com.java8;

public class WrapperConverting {

	public static void main(String[] args) {
		// Primitive or wrapper object to String
		/*
		 * Integer i = new Integer("10"); int x = 100; String s1 = Integer.toString(x);
		 * String s = i.toString(); System.out.println(" Wrapper object to String" + s);
		 * System.out.println("primitive to String " + s1);
		 */
		// String to primitive

		/*
		 * String s="100"; Integer i=Integer.parseInt(s); System.out.println(""+i);
		 */

		// Wrapper object to primitive
		/*
		 * Boolean b=new Boolean("tRue"); boolean x=b.booleanValue();
		 * 
		 * System.out.println(x);
		 */
		/*
		 * autoboxing-> compiler does automatic conversion from primitive to wrapper
		 * object Integer x = 120; AutoUnboxing ->compiler does automatic conversion
		 * from wrapper object to primitive int i=new Integer("100");
		 */
		// Primitive or String to wrapper object
		String x = "100";
		Integer i = Integer.valueOf(x);
		System.out.println(i);

	}

}
