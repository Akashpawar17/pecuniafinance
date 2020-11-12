package com.variables.oca;

public class Test {
	int x;
public static void m1(int t) {
	t=999;
	System.out.println("inside static:"+t);
}

	public static void main(String[] args) {
		int t=777;
		m1(t);
		System.out.println("main method"+t);
		
	}

}
