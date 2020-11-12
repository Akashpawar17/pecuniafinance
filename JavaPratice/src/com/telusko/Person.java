package com.telusko;

public class Person {
	
	public static void main(String[] args) {
		String s="A";
		String result=null;
		if(s.equals("Java")) {
			result="first level";
		}
		else {
			result="second level";
		}
		System.out.println(result);
	result=s.equals("A")?"first level":"second level";
	System.out.println(result);
	}

}
