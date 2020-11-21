package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComp {

	public static void main(String[] args) {
		List<Student> l = Arrays.asList(new Student("paawan", 105, 51000), new Student("akash", 107, 48000),
				new Student("zayn", 101, 49000)

		);
		// Collections.sort(l,(x1,x2)->x1.name.compareTo(x2.name));
		// Collections.sort(l,(x1,x2)->x1.rollNo-x2.rollNo);
		// Collections.sort(l,new Comparator<sortName>() {

	 Collections.sort(l);
		System.out.println("BEFORE SORTING:" + l);
		for (Student student : l) {
			System.out.println("AFTER NAME SORTING" + student);
		}
	}

}

class sortName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int) (o1.salary - o2.salary);
	}

}
