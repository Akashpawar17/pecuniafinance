package com.telusko;

public class MyString {
	String msg;
	

	public MyString(String msg) {
		super();
		this.msg = msg;
	}


	public static void main(String[] args) {
		System.out.println("hello"+new StringBuilder("JAVA SE"));
		System.out.println("Hello"+new MyString("JAVA SE 8"));
	}

}
