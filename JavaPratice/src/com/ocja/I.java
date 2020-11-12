package com.ocja;

interface  I {
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	

}
abstract class A implements I{

	abstract void m6();
	
	public void m2() {
	}
	public void m3() {
	}
	public void m4() {
	}
	public void m5() {
	}
	
	

	public void m9() {
	}
	
	
}
class B extends A{
	public void m1() {
		System.out.println("m1");
	}

	@Override
	void m6() {
		// TODO Auto-generated method stub
		
	}
	
}
