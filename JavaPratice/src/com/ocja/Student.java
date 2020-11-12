package com.ocja;

public class Student {
	String name;
	int rollNo;
	

	public Student(String x, int y) {
		name = x;
		rollNo = y;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}


	public static void main(String[] args) {
		Student s1=new Student("akash", 111);
System.out.println(s1);
	}

}
