package com.ocja;

public interface INamingConflicts {
	
	 void m1();	
	
}
interface Right{
	void m1( );
}
abstract class TestDemo implements INamingConflicts,Right{
}
class AB extends TestDemo{

	@Override
	public void m1() {
		
		
	}
	
}