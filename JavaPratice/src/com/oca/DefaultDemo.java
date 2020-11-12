package com.oca;

public class DefaultDemo {
	
	public boolean b;
	public char c;
	public float f;
	
	
	public void display() {
		System.out.println("value:"+b+""+c+""+f+"");
	}

	public static void main(String[] args) {
		DefaultDemo d=new DefaultDemo();
		d.display();
		
	}

}
