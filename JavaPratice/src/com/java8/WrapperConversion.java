package com.java8;

public class WrapperConversion {

	public static void main(String[] args) {
		// PRIMITIVE (OR) STRING TO WRAPPER OBJECT

		String s = "true";
		int x = 120;
		Integer i7 = Integer.valueOf(x);
	Integer i6=	Integer.valueOf(s);
	boolean b6=Boolean.valueOf(s);
		System.out.println(i7);
		System.out.println(i6);
		System.out.println(b6);

		// WRAPPER OBJECT TO PRIMITIVE
		Boolean b = new Boolean("TruE");
		boolean b1 = b.booleanValue();
		System.out.println(b1);

		// STRING TO PRIMITIVE
		String s1 = "10";
		int i1 = 100;
		// STRING TO PRIMITIVE
		long i = Long.parseLong(s1);
//PRIMITIVE TO STRING
		/*
		 * String s = Integer.toString(i1); System.out.println(i);
		 * System.out.println(s);
		 */
//WRAPPER OBJECT TO STRING
		Double d = new Double(10);
		String s3 = d.toString();
	}

}
