package com.telusko;

public interface Downloadable {
	
	 void download();

}
interface Readable extends Downloadable{
	void readBook();

}
 abstract class Book implements Readable{

	
	
	
	
}

class Ebook extends Book{

	@Override
	public void download() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readBook() {
		// TODO Auto-generated method stub
		
	}




	
}