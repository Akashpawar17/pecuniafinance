package com.telusko;

import java.util.ArrayList;

public class ArraysDemo {

	public static void main(String[] args) {
		int[][] x=new int[2][4];
		x[0]=new int[] {2,3,4,5};
		x[1]=new int[] {2,3};
		for (int[] is : x) {
			for (int is2 : is) {
				System.out.println(is2);
				
			}
			System.out.println();
		}
}
}

