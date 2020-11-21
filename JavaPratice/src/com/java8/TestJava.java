package com.java8;

public class TestJava {

	public static void main(String[] args) {
		FunctionalDemo d = (a, b) -> a * b;
		System.out.println(d.m1(10, 20));

	}

}

interface FunctionalDemo {

	int m1(int a, int b);

}
