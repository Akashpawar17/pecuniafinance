package com.ocja;

public class WrapperDemo {

	public static void main(String[] args) {
		// STRING VARIABLE SHOULD BE OF NUMBER TYPE ONLY, IF YOU DECLARE IT AS
		// STRING(NAMES) THEN WE WILL
		// GET NUMBER FORMAT EXCEPTION
		// STRING TO INT
		String x = "10";
		// WE CAN DO IT WITH TWO DIFFERENT METHODS EITHER BY PARSEINT() OR VALUEOF()

		int i = Integer.parseInt(x);
		//int i1 = Integer.valueOf(x);
		System.out.println(i);
		//System.out.println("" + i1);
//INT TO STRING
		int y = 15;
		String s = Integer.toString(y);
	Integer s1=	Integer.valueOf(y);
		System.out.println(s);
		System.out.println("  "+s1);
//WRAPPER OBJECT WE CAN PASS PRIMITIVE AND STRING VALUES
		Integer in = new Integer("10");
		System.out.println(in);
//WRAPPER OBJECT OF BOOLEAN
		Boolean b = new Boolean("TrUe");
		boolean b1 = b.booleanValue();
		boolean b2 = b.valueOf(b);
		System.out.println("primitive value for boolean wrapper:" + b1);
		System.out.println("valueof method:" + b2);

	}

}
