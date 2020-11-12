package com.ocja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo {
	int id;
String name;
double salary;


	public StudentDemo(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}


	@Override
	public String toString() {
		return "StudentDemo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		List<StudentDemo> l= new ArrayList<>();
		StudentDemo d=new StudentDemo(101, "VIKASH", 10000);
		StudentDemo d1=new StudentDemo(105, "AKASH", 5000);
		
		StudentDemo d2=new StudentDemo(102, "MAHESH", 2000);
		l.add(d);
		l.add(d1);
		l.add(d2);
		System.out.println("Before sorting"+l);
		Collections.sort(l,(x1,x2)->{
			//return x1.id-x2.id;
			return (int) (x1.salary-x2.salary);
			//return x1.name.compareTo(x2.name);
		});
		for (StudentDemo s : l) {
			System.out.println("After sorting"+s.id+""+s.name+""+s.salary);
			
		}
	}

}
