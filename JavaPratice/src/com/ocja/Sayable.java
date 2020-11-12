package com.ocja;

public interface Sayable {
	void say();

}

class Method{
	public static void main(String[] args) {
		Sayable sayable= Method::m1;
		sayable.say();
		
	}

public static void m1() {
	System.out.println("hello this is static method");
}


}