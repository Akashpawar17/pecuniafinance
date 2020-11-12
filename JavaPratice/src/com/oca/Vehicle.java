package com.oca;

public class Vehicle {
	String type="";
	String speed="";
	public Vehicle(String type, String speed) {
		super();
		this.type = type;
		this.speed = speed;
	}
	

}
class Car extends Vehicle{
	String trans;
	

	public Car(String type, String speed, String trans) {
		super(type, speed);
		this.trans = trans;
	}


	
	
}
