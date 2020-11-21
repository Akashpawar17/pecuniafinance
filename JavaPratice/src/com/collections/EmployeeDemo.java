package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.Student;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(102, "sairao",50000);
	Employee e2=new Employee(101, "prakash",30000);
	Employee e3=new Employee(103, "vikash",20000);

				
		List<Employee>	 list=new ArrayList<>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	//SORTING USING LAMBDA EXPRESSION 
	//Collections.sort(list, (x1,x2)->x1.getEname().compareTo(x2.getEname()));
	//SORTING USING COMPARATOR METHOD
	/*
	 * Collections.sort(list, new Comparator<Employee>() {
	 * 
	 * @Override public int compare(Employee o1, Employee o2) { // TODO
	 * Auto-generated method stub return (int) (o1.getEsalary()-o2.getEsalary()); }
	 * });
	 */
	Collections.reverse(list);
	//Collections.sort(list);
	for (Employee e : list) {
		System.out.println(e);
		
	}
	}
	/*
	 * class sortName implements Comparator<Employee> {
	 * 
	 * @Override public int compare(Employee o1, Employee o2) { // TODO
	 * Auto-generated method stub return o1.getEname().compareTo(o2.getEname()); }
	 * 
	 * }
	 */
}
