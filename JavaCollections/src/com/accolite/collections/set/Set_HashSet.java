package com.accolite.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 1.HashSet cannot contain duplicate value..--if it finds duplicate ele->it overrides the existing ele
 2. Hashset allows (only) null value
 3.Hashset doesnot maintain the insertion order--- unordered collection
 4. Internally uses HashMap to store elements ******
 5. Not thread safe like AL,LL in multi threaded environment. need to explicitly synchronize concurrent access to HashSet in multi-threaded environment
 
 1.create a hashset from another collection--(HS/AL)- hashset(collection)
 2.addAll()
 
 removing elements from hashset
 1.remove()
 2.removeAll()-- removes one set from another
 3.clear()
 
 Different ways to iterate
 1. enhanced for loop
 2. basic loop with iterator
 3. while loop with iterator
 4. foreach with lambda
 5. stream + foreach() + lambda
 */
public class Set_HashSet {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();//default capacity - 16
		//List<String> set=new ArrayList<String>();
		set.add("element1");
		set.add("element1");
		System.out.println(set); //[element1]
		
		set.add(null);
		set.add(null);
		System.out.println(set); //[null, element1]
		
		set.clear();
		
		set.add("e1");
		set.add("e2");
		set.add("e3");
		set.add("e4");
		set.add("e5");
		System.out.println(set); //[e5, e1, e2, e3, e4]
		
		Set<String> fullSet=new HashSet<String>(set); //[e5, e1, e2, e3, e4]
		System.out.println(fullSet);
		
		Set<String> remSet=new HashSet<String>();
		remSet.add("e6");
		remSet.add("e7");
		
		fullSet.addAll(remSet);
		System.out.println(fullSet);//[e5, e6, e7, e1, e2, e3, e4]
		
		System.out.println("removed "+fullSet.remove("e4"));
		System.out.println(fullSet);
		
		Set<String> removeSet=new HashSet<String>();//removeAll
		removeSet.add("e2");
		removeSet.add("e3");
		fullSet.removeAll(removeSet);
		System.out.println(fullSet);
		
		
		for(String ele:set) {
			System.out.println(ele);
		}
		System.out.println();
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println();
		
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			String str=(String) iterator.next();
			System.out.println(str);
		}
		System.out.println();
		
		set.forEach(s->System.out.println(s));//method of iterable--foreach
		System.out.println();
		
		set.stream().filter(s->!"e1".equals(s))
		.forEach(s->System.out.println(s));
	}

}
