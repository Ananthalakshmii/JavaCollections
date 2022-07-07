package com.accolite.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 1. isEmpty() - to check if list is empty
 2. add()
 3. size()- number of elements in list
 4. get(index) - gets the value at the index
 5. set(index, element) - sets the element to index
 6.remove(index)
 7. remove(element)
 8. removeAll(collection) - used to remove multiple elements from a list -> create a sublist with all the elements to be deleted and pass as a parameter to removeAll
 9. clear()-deletes elements in the list
 
 10. different ways to iterate through arraylist
 a. for loop
 b. foreach
 c. iterate with iterator
 d. while loop with iterator
 e. java 8 stream(with/without) + lambda
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();//initial capacity of arraylist is 10
		//List<String> fruits=new ArrayList<>(20);
		
		System.out.println("fruits list is empty? "+fruits.isEmpty());
		
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("orange");
		
		System.out.println("size of fruits "+fruits.size());
		
		System.out.println("favorite fruit "+fruits.get(1));
		
		fruits.set(0, "papaya");
		System.out.println(fruits);
		
		fruits.add("grapes");
		fruits.add("pineapple");
		System.out.println(fruits);
		
		fruits.remove(0);
		System.out.println(fruits);
		
		fruits.remove("mango");
		System.out.println(fruits);
		
		List<String> subFruits=new ArrayList<String>();
		subFruits.add("apple");
		subFruits.add("grapes");
		
		fruits.removeAll(subFruits);
		System.out.println(fruits);
		
		fruits.clear();
		System.out.println(fruits);
		
		
		//different ways to iterate over list
		List<String> courses=Arrays.asList("c","c++","java","spring","hibernate");
		
		for(int i=0;i<courses.size();i++) {
			System.out.println(courses.get(i));
		}
		System.out.println();
		
		for(String course:courses) {
			System.out.println(course);
		}
		System.out.println();
		
		for (Iterator iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		System.out.println();
		
		Iterator<String> it=courses.iterator();
		while (it.hasNext()) {
			String course = (String) it.next();
			System.out.println(course);
			
		}
		System.out.println();
		
		courses.stream().forEach(course->System.out.println(course));
		courses.forEach(course->System.out.println(course));

	}

}
