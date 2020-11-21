package com.ocja;

public class ReferenceDemo {
	int x=10;
	public static void m1(ReferenceDemo t1) {
		t1.x=999;
		System.out.println("inside static"+t1.x);
		
	}

	public static void main(String[] args) {
	
ReferenceDemo d=new ReferenceDemo();
d.x=779;
m1(d);
System.out.println("inside main"+ d.x);
	}

}
