package com.oca;

public  class Planet {
	
	public String name;
public 	int moons;


	public Planet(String name, int moons) {
	super();
	this.name = name;
	this.moons = moons;
}


	public static void main(String[] args) {
		Planet[] p= {
				new Planet("mercury", 0),
				new Planet("venus", 0),
				new Planet("earth",1),new Planet("mars", 2)
		};
		System.out.println(p);
		System.out.println(p[2]);
		System.out.println(p[2].moons);
		
	}
	
}
