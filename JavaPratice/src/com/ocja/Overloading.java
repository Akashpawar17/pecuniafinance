package com.ocja;

public class Overloading {

	public void name(String s) {
		System.out.println("String "+s);
		
	}
	public void name(StringBuffer s) {
		System.out.println("Stringbuffer ");
		
	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.name("akash");
//o.name(null);//no relation between objects

	}

}
