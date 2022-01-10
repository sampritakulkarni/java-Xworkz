package com.xworkz.comparelinkedlist;

import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeTester {

	public static void main(String[] args) {

		SortedSet<Employee>set = new TreeSet<Employee>();
		
		Employee emp1 = new Employee(1,"Sonakshi",987654321,55555.00);
		Employee emp2 = new Employee(55,"Pinky",987699321,33333.00);
		Employee emp3 = new Employee(67,"Ravi",987656621,88888.00);
		Employee emp4 = new Employee(76,"Raju",987659921,77777.00);
		Employee emp5 = new Employee(88,"Chaitra",911654321,58555.00);
		
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		
		System.out.println(set);
		System.out.println("");
		
		System.out.println(set.first());
		System.out.println("");
		System.out.println(set.last());
		System.out.println("");
		System.out.println(set.headSet(emp4));
		System.out.println("");
		System.out.println(set.tailSet(emp3));
		System.out.println("");
		System.out.println(set.subSet(emp4, emp3));
		System.out.println("");
		
		
	}

}
