package com.oca;

public class ArrayDemo {

	@Override
	public String toString() {
		return "ArrayDemo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static void main(String[] args) {
//		int num1[]= new int[3];
//		int num2[]= {1,2,3,4,5};
//		num1=num2;
//	for (int i : num1) {
//		System.out.println(i);
//		
//	}
//		String s="Java demo";
//		int length=s.length();
//		System.out.println(length);
		
		
		/*
		 * boolean b=new Boolean(Boolean.valueOf(args[0])); boolean b1=new
		 * Boolean(args[1]); System.out.println(b+""+b1);
		 */
		
		int[][] arr=new int[2][4];
		arr[0] =new int[] {1,3};
		arr[1] =new int[] {1,2,3,4};
		for (int[] is : arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(is[i]);
				
			}
			System.out.println();
			
		}
		
		
		
	}

}
