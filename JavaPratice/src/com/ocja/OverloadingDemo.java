package com.ocja;

public class OverloadingDemo {
	public void m1(Animal a) {
		System.out.println("animal");
		
	}
	public void m1(Dog d) {
		System.out.println("dog");
	}

	public static void main(String[] args) {
		OverloadingDemo o=new OverloadingDemo();
		Animal a=new Animal();
		o.m1(a);
		Animal a1=new Dog();
		o.m1(a1);
		Dog d=new Dog();
		o.m1(d);
		
	}

}
class Animal{
	
}
class Dog extends Animal{
	
}