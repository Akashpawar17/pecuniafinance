package com.oca;

public class A {
	public void test() {
		System.out.println("A");
	}
	public static void main(String[] args) {
		A b1=new A();
A b2=new C();
A b3=(B)b2;
b1=(A)b2;
//A b3=b2;
b1.test();
b3.test();

		
	}

	
}
class B extends A{
	public void test() {
		System.out.println("B");
	}
}
class C extends B{
	public void test() {
		System.out.println("C");
	}
}