package com.java8;

public class Student implements Comparable<Student> {
	String name;
	int rollNo;
	public double salary;

	public Student(String name, int rollNo, double salary) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		//return new Double(salary).compareTo(o.salary);
		//return new Integer(rollNo).compareTo(o.rollNo);
		return new String(name).compareTo(o.name);
	}
	

}
