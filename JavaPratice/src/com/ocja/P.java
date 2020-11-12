package com.ocja;

public class P {
	public void m1() {
		System.out.println("m1..");
	}

}
class C extends P{
	public void m2() {
		System.out.println("m2..");
	}
}
class TestdEM{
	public static void main(String[] args) {
		P p=new C();
		p.m1();
		//p.m2();
		((C)p).m1();
	}
}