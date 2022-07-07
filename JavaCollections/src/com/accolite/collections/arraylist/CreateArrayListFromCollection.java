package com.accolite.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 1. create a arraylist from collection
 2. addAll(collection) - adds a collection to the existing arraylist
 */
public class CreateArrayListFromCollection {

	public static void main(String[] args) {
		
		List<Integer> first5prime=new ArrayList<Integer>();
		first5prime.add(2);
		first5prime.add(3);
		first5prime.add(5);
		first5prime.add(7);
		first5prime.add(11);
		
		List<Integer> first10Prime=new ArrayList<Integer>(first5prime);
		
		List<Integer> next5prime=new ArrayList<Integer>();
		next5prime.add(13);
		next5prime.add(17);
		next5prime.add(19);
		next5prime.add(23);
		next5prime.add(29);
		
		first10Prime.addAll(next5prime);
		
		System.out.println(first10Prime);
	}

}
