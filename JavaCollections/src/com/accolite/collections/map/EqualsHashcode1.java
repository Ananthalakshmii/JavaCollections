package com.accolite.collections.map;

import java.util.Objects;

/*
 inside hashcode
inside hashcode
inside equals
true
 */
public class EqualsHashcode1 {

	public static void main(String[] args) {
		Employee1 e1=new Employee1("Anu", 30, 435350);
		Employee1 e2=new Employee1("Anu", 30, 435350);
		Employee1 e3=new Employee1("Vani", 30, 325430);
		
		//System.out.println(e1.equals(e2));
		if(e1.hashCode()==e2.hashCode())
			System.out.println(e1.equals(e2));

	}

}

class Employee1{
	private String name;
	private int age;
	private double salary;
	
	public Employee1(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int hashCode() { //quicker way to check for equality
		System.out.println("inside hashcode");
		return Objects.hash(age, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return age == other.age && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	*/
		
		System.out.println("inside equals");
		if(this==obj)
			return true;
		if(obj==null || this.getClass()!=obj.getClass())
			return false;
		
		Employee1 emp=(Employee1)obj;
		return this.name.equals(emp.name);
	}
	
	
}