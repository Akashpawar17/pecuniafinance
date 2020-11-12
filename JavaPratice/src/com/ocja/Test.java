package com.ocja;

public abstract class Test {
	 final void m3() {
		
	}
	 

	public abstract int getNoOfWheels();
	
}

class Bus extends Test {

	@Override
	public int getNoOfWheels() {
		return 7;
	}

}

class Auto extends Test {

	@Override
	public int getNoOfWheels() {
		return 3;
	}
	
}

