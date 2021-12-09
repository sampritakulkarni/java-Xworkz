package com.xworks.arraycollection;

import java.util.*;

public class PersonArrayTester {
 public static void main(String[] args) {
	
	Collection collection = new ArrayList();
	
	collection.add (new String ("Xworkz"));
	collection.add(new PersonArrayTester());
	collection.add("Dharwad");
	collection.add(false);
	collection.add(10);
	collection.add(12.0);
	collection.add(false);
	collection.add(10);
	
	int collectionSize = collection.size();
	System.out.println("collectionSize" + collectionSize );
	
	System.out.println(collection);
	
	System.out.println(collection.isEmpty());
	if (collection.contains("Dharwad")) {
		System.out.println("Dharwad is present");
		
	}else {
		System.out.println("Dharwad is not present");
	}
	
	collection.remove("Xworkz");
	System.out.println("collection");
	
 
 Collection collection2=new ArrayList();
 
 collection2.add("Bangalore");
 collection2.add("Mysore");
 collection2.add("Karnataka"); 
 collection2.add("Assam");
 collection2.add("Japan");
 
 System.out.println(collection2);
 
 collection.addAll(collection2);
 System.out.println(collection);
 
 boolean isPresentcollection2=collection.containsAll(collection2);
 
 if(isPresentcollection2) {
	 System.out.println("collection2 is present");
	 
 }
 else {
	 System.out.println("collection2 is not present");
 }
 boolean isRetainsCollection=collection.retainAll(collection2);
 
 if(isRetainsCollection) {
	 
	 System.out.println("retains only collection2");
 }
 else {
	 System.out.println("not retains collection2");
 }
 
 System.out.println(collection);
 
    collection.clear();
    System.out.println(collection);
    System.out.println(collection2);
 
 
 
 }
}
