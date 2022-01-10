package com.xworkz.comparelinkedlist;

import java.util.Comparator;

public class SoftwareInternetAppComparator implements Comparator<SoftwareDTO>{

	@Override
	public int compare(SoftwareDTO obj1, SoftwareDTO obj2) {
		
		Boolean b1=(Boolean) obj1.isInternetApp();
		Boolean b2=(Boolean) obj2.isInternetApp();
		
	
		return 0;

}
}
