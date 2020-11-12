package com.telusko;

public class SwitchDemo {

	public static void main(String[] args) {
		int w=0;
		String days[] = {"sun","mon","wed","sat"};
		for (String string : days) {
			switch(string) {
			case "sat":
			case "sun":
			w=w-1;
			break;
			case "mon":
				w++;
			case "wed":
				w=w+5;
			
			}
		}
		System.out.println(w);
	}

}
