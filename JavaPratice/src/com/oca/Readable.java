package com.oca;

interface Readable {
	
	void readbook();
	void setBookMark();

}
abstract class Book implements Readable{
	
	void readBook() {
		
	}
	
	abstract class Ebook extends Book{

	
		
	}
}