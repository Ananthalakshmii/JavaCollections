package com.accolite.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 Sort
 1. collections.sort(list)
 2.collections.reverse(list)
 3. collections.sort(list,comparator) --new class that implements comparator interface
 4. collections.sort(list,comparator) -- anonymous comparator class
 5. collections.sort(list,lambda expression)
 6. comparing names with compareto
 */

public class SortList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(40);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1, "asd", 30, 500000));
		emp.add(new Employee(2, "sdc", 23, 200000));
		emp.add(new Employee(3, "ret", 31, 400000));
		emp.add(new Employee(4, "ger", 29, 230000));
		
		Collections.sort(emp, new MySort());
		System.out.println(emp);
		
		Collections.sort(emp, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			}
		});
		System.out.println(emp);
		
		Collections.sort(emp, (e1,e2)->(int)(e1.getSalary()-e2.getSalary()));
		System.out.println(emp);
		
		
		Collections.sort(emp, (e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println(emp);
	}

}


class MySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary()-o2.getSalary());// ascending order
		//return (int) (o2.getSalary()-o1.getSalary()); //descending order
	}
	
}