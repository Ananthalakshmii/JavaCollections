package com.accolite.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 All the wrapper classes by default implement equals and hashcode.
So duplicates is not allowed.
so the size of duplicate entry in Integer is eliminated and size is shown as 1 unlike Employee where duplicate is allowed because equals and hashcode is not implemented
and hence the duplicate entry is allowed
hence the size becomes 2.
after implementing equals and hashcode, Employee duplicates are removed and size is 1 (and the last entry will overwrite the previous record)
 */
public class EqualsHashcode {

	public static void main(String[] args) {
		
		Integer i=new Integer(1);
		Integer j=new Integer(1);
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(i, "one");
		map.put(j, "two");
		System.out.println(map); //{1=two}
		System.out.println(map.size()); //1
		
		
		Employee e1=new Employee(1);
		Employee e2=new Employee(1);
		Map<Employee, String> emp=new HashMap<Employee, String>();
		emp.put(e1, "first");
		emp.put(e2, "second");
		System.out.println(emp); //{com.accolite.collections.map.Employee@5e265ba4=first, com.accolite.collections.map.Employee@156643d4=second} -without equals and hashcode
		System.out.println(emp.size()); //2
		
		//{com.accolite.collections.map.Employee@20=second}
		//1
	}

}

class Employee{
	private int id;
	
	public Employee(int id) {
		this.id=id;
		}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
	
	
	
}