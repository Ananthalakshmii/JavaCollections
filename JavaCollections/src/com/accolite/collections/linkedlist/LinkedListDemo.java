package com.accolite.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Deque;
import java.util.Iterator;

/*
 Difference between arraylist and linkedlist -- AL and LL
 1. AL uses dynamic array internally to store data - index based storage, LL uses doubly linked list to store data elements--structure
 2. insertion, deletion takes more shifting in AL , so use LL in such cases---performance
 3. LL requires more memory than AL because AL-data,index; LL-data,Prvious node pointer,next node pointer---memory
 4. AL can act as List only(implements list).. LL can act as List,Queue (implements List and deque interface)
 5. AL is better for storing and accessing data. LL is better for manipulating data
 1. AL,LL can contain duplicate element
 2. AL,LL maintains insertion order
 3. AL,LL can contain null value
 
 comes from dequeue
 1. add()
 2. add(index,element)
 3.addFirst()
 4.addLast()
 
 retrieve elements from the linkedlist
 1. getting first element
 2. getting last element
 3. getting element at given index
 4. get all elements from LL
 
 Remove elements from LL
 1. remove first element
 2. remove last element
 3. remove first occurence of a given element in LL
 4. clear LL 
 
 Search
 1.contains
 2. find the index of first occurrence of element in LL--indexOf
 3. find last occurence -- lastIndexOf
 
 Iterating thru LL
 1. Iterator
 2. forEach
 3.for each advanced loop
 4. simple for loop
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> fruits=new LinkedList<String>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		System.out.println(fruits);
		
		fruits.add(2, "watermelon"); // adding at index 2
		System.out.println(fruits);
		
		fruits.addFirst("strawberry");//part of deque method
		System.out.println(fruits);
		
		fruits.addLast("grapes");
		System.out.println(fruits);
		
		System.out.println(fruits.getFirst());//present in dequeue
		System.out.println(fruits.getLast());
		System.out.println(fruits.get(2));//present in list
		for(String str:fruits)
			System.out.println(str);
		
		String ele=fruits.removeFirst();
		System.out.println(fruits+" ---- "+ele);
		
		String ele1=fruits.removeLast();
		System.out.println(fruits+" ---- "+ele1);
		
		fruits.remove("apple");
		System.out.println(fruits);
		
		fruits.clear();
		System.out.println(fruits);
		
		
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add(2, "watermelon");
		fruits.addFirst("strawberry");
		fruits.addLast("grapes");
		fruits.add("watermelon");
		System.out.println(fruits);
		
		System.out.println("contains "+fruits.contains("apple"));
		System.out.println(fruits.indexOf("watermelon"));
		System.out.println(fruits.lastIndexOf("watermelon"));
		
		Iterator<String> iterator=fruits.iterator();//iterator
		while(iterator.hasNext()) {
			String fruit=iterator.next();
			System.out.println(fruit);
		}
		System.out.println();
		
		
		fruits.forEach(fruit->System.out.println(fruit));//foreach-lambda
		System.out.println();
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
	}

}
