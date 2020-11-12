package com.oca;

public class Demoo {
	int a1;
public static void doStuff(int a) {

	a=a*a;
	
}
public static void doString(StringBuilder s) {

s.append(""+s);
	
}


	public static void main(String[] args) {
		Demoo d=new Demoo();
		d.a1=11;
		//String sb ="hello";
		StringBuilder sb=new StringBuilder("Hello");
		Integer i=10;
		doStuff(i);
		doString(sb);
		doStuff(d.a1);
	System.out.println(i+""+sb+""+d.a1);

	}

}
