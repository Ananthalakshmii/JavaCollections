package com.accolite.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		//list maintains insertion order
		list.add("ele1");
		list.add("ele2");
		list.add("ele4");
		list.add("ele3");
		list.add("ele5");
		System.out.println(list);
		
		//list accepts duplicate elements
		list.add("ele3");
		System.out.println(list);
		
		//list accepts null elements
		list.add(null);
		System.out.println(list);
		
		//access elements from list
		System.out.println(list.get(1));
	}
}
