package com.accolite.collections;

import java.util.Collection;

public class NeedOfCollections {

	public static void main(String[] args) {
	
		int arr[]=new int[10000];
		
		//Limitations of array
		//1.Arrays are fixed in size
		//2. Arrays can hold only homogeneous type of data
		
		Student student[]=new Student[10];
		student[0]=new Student();
		student[1]=new Student();
		
		Object obj[]=new Object[10]; //Generic object type can hold any object type data
		obj[0]=new Student();
		obj[1]=new Book();
		
		//3.No readymade API available in array
		
		//To overcome limitations of array, we go for collection -- collection- group of individual objects as a single unit/entity--- rt.jar--java.util--collection.class,List,..
		
	}

}
class Student{
	
}

class Book{
	
}