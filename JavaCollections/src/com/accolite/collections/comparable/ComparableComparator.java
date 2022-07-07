package com.accolite.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 Collections sort is implemented for all primitive types. but not for user defined type
 in order to write custom method , the class should implement COMPARABLE INTERFACE AND IMPLEMENT COMPARETO METHOD
 the method has to write the logic of how to sort the collections-- on which criteria the sort should happen
 
 COMPARATOR can be used:
 1.class doesnot implement comparable interface and there is no chance of changing the source code
 2. write a new logic for sorting other than in the compareto method of comparable interface
 -- this is used as a second parameter in the sort function
 */
public class ComparableComparator {

	public static void main(String[] args) {
		List<Laptop> laps=new ArrayList<Laptop>();
		laps.add(new Laptop("Dell", 12, 1220));
		laps.add(new Laptop("Acer", 16, 820));
		laps.add(new Laptop("Apple", 8, 2220));
		
		Collections.sort(laps);
		
		for(Laptop lap:laps)
			System.out.println(lap);
		System.out.println();
		
		Comparator<Laptop> laptop = new Comparator<Laptop>() {
			
			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice()>o2.getPrice())
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(laps, laptop);
		for(Laptop lap:laps)
			System.out.println(lap);
	}

}
