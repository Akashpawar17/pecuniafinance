package com.telusko;

public class Test {
	
	int x,y;
	

	public Test(int x, int y) {
		initialize(x, y);
		
	}
public void initialize(int x,int y) {
	this.x=x*x;
	this.y=y*y;
}

	public static void main(String[] args) {
		int x=3;int y=5;
		Test t=new Test(x, y);
		System.out.println(x+":"+y);
		
	}

}