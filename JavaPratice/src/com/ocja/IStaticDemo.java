package com.ocja;

public interface IStaticDemo {

	public static void m1() {
		System.out.println("static ...");
	}
}
class TestStatic {
	public static void main(String[] args) {
		IStaticDemo.m1();
	}
}