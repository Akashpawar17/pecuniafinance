package com.oca;



public class StringsDemo {

	public static void main(String[] args) {
		
		
		
		/*
		 * String
		 * s1=LocalDate.parse("1998-06-05").format(DateTimeFormatter.ISO_DATE_TIME);
		 * System.out.println("date"+s1);
		 */
		StringBuilder sb=new StringBuilder("hello");
		String s="hello";
		if(sb.toString().equals(s.toString())) {
			System.out.println("match1");
		}
		else if(sb.equals(s)){
			System.out.println("match2");
		}
		else {
			System.out.println("match 3");
		}

	}

}
