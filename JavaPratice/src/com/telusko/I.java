package com.telusko;

public interface I {
	void display1();

}

class c2{
	public void display2() {
		System.out.println("display2");
	}
}
class c1 extends c2 implements I{

	@Override
	public void display1() {
		System.out.println("display1");
		
	}
	public static void main(String[] args) {
		c2 o1=new c1();
		I o2=new c1();
		c2 s=(c2) o2;
		I t= (I) o1;
		t.display1();
		s.display2();
		
	}
	
}
