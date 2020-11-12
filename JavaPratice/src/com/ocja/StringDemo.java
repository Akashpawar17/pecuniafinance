package com.ocja;

public class StringDemo {

	String name;
	int rollNo;
	
	

	public StringDemo(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}



	public static void main(String[] args) {
		StringDemo s1=new StringDemo("Akash", 101);
		StringDemo s2=new StringDemo("Akash", 101);
		System.out.println(s1.equals(s2));
	}

}
