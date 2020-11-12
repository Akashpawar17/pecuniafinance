package com.oca;

public class TestDemo {
	static int count=0;
	int i=0;
	
	public void work() {
		while (i<5) {
			++i;
			++count;
			
		}
		
	}

	public static void main(String[] args) {
		TestDemo t1=new TestDemo();
		TestDemo t2=new TestDemo();
		t1.work();
		t2.work();
		System.out.println(t1.count+""+t2.count);
		
				
				
	}

}
