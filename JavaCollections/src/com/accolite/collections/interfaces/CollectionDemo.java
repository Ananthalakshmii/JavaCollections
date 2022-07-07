package com.accolite.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Collection<String> collection=new ArrayList<String>();
		
		collection.add("banana");
		collection.add("mango");
		collection.add("apple");
		System.out.println(collection);
		
		collection.remove("banana");
		System.out.println(collection);
		
		System.out.println(collection.contains("mango"));
		
		collection.forEach(e->{
			System.out.println(e);
		});
		
		collection.clear();
		System.out.println(collection);

	}

}
