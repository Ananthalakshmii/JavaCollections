package com.accolite.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 Map-key value
 1.Hashmap is a hash table implementation of map interface
 2. hashmap cannot contain duplicate key
 3. hashmap allows null key and null value
 4. hashmap is unordered collection- does not guarantee specific order of elements
 5. not thread safe- use explicit synchronize for concurrent modification to Hashmap\
 
 add key value to map
 HM can contain only one null key
 isEmpty()
 size() - size of unique key elements
 containsKey()-- check if a key exist in hashmap
 containsValue()
 get() -- get value by key
 remove(key) -- remove keys from hashmap
 keySet() -- get all keys from hashmap
 values()- get all values from hashmap
 
 Iterator over hashmap:
 1. for each method
 2. using iterator
 3. java 8 foreach
 
 user defined object in a map
 
 if 2 objects are equal, then their hashcode should be equal 
 */
public class Map_HashMap {
	public static void main(String[] args) {
		//example to map numbers to string
		Map<String, Integer> numberMapping=new HashMap<String, Integer>();
		
		numberMapping.put("one", 1);
		numberMapping.put("two", 2);
		numberMapping.put("three", 3);
		numberMapping.put("four", 4);
		System.out.println(numberMapping); //{four=4, one=1, two=2, three=3}
		
		numberMapping.put(null, 5);
		numberMapping.put(null, 6);
		System.out.println(numberMapping); //{null=6, four=4, one=1, two=2, three=3}
		//key for 5 is overriden-- HM can contain only 1 null key
		
		System.out.println(numberMapping.isEmpty());
		
		System.out.println(numberMapping.size()); //2 null keys overriden to 1 null key--so size is 5 FIVE
		
		System.out.println(numberMapping.containsKey("four"));
		System.out.println(numberMapping.containsValue(4));
		
		System.out.println(numberMapping.get("one"));
		numberMapping.put("one", 11);
		System.out.println(numberMapping.get("one"));
		
		numberMapping.remove("two");
		System.out.println(numberMapping); //{null=6, four=4, one=11, three=3}
		
		System.out.println(numberMapping.keySet()); //[null, four, one, three]---set-unique value
		
		System.out.println(numberMapping.values());//[6, 4, 11, 3]--return type collection- because can contain duplicate values
		
		
		for(Map.Entry<String,Integer> entry : numberMapping.entrySet()) { //for each method         entryset returns set of entry
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println();
		
		//using iterator
		Set<Map.Entry<String, Integer>> entries=numberMapping.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator=entries.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry=iterator.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println();
		
		
		numberMapping.forEach((k,v)-> System.out.println(k+" "+v));
		
		
		//user defined object in a map
		Map<Integer, Student> student=new HashMap<Integer, Student>();
		student.put(1, new Student("asd","dfewf"));
		student.put(2, new Student("ewf","wer"));
		student.put(3, new Student("ewftgr","t5er"));
		System.out.println(student.values());
		
	}

}
