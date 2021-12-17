package com.xworkz.collectionframework;


import java.util.ArrayList;
import java.util.List;

public class Tester {
        
	public static void main(String[] args) {
		List list= new ArrayList();
		
		String name="Sarika";
		int age =25;
		boolean isMarried=true;
		long phone=9876543210L;
		
		list.add(name);
		list.add(age);
		list.add(isMarried);
		list.add(phone);
		
		System.out.println(list);
		System.out.println("Size:"+list.size());
		System.out.println("Present abc"+list.contains("Sarika"));
		System.out.println(list);
		
		List list2=new ArrayList<>();
		
		list2.add("abcd");
		list2.add(234);
		list2.add(false);
		list2.add(1234567890L);
		System.out.println(list2);
		
		list.addAll(list2);
		System.out.println(list);
	    System.out.println("Contains list2:"+list.containsAll(list2));
		list.removeAll(list2);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		list.retainAll(list2);
		
		System.out.println(list);
		System.out.println(list.isEmpty());
		
				
		
	}
}
