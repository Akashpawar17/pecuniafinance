package com.variables.oca;

public class Vowel {
	private char ch;

	public static void main(String[] args) {
		char ch1='a';
		char ch2=ch1;
		ch2='e';
		Vowel obj1=new Vowel();
		Vowel obj2=obj1;
		obj1.ch='i';
		obj2.ch='o';
		System.out.println(ch1+":"+ch2);
		System.out.println(obj1.ch+":"+obj2.ch);
		
	}

}
