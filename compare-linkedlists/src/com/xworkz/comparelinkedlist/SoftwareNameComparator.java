package com.xworkz.comparelinkedlist;

import java.util.Comparator;

public class SoftwareNameComparator   implements Comparator<SoftwareDTO>{

	@Override
	public int compare(SoftwareDTO obj1, SoftwareDTO obj2) {
		
		int value =obj1.getName().compareTo(obj2.getName());
		
		if(value<0)
			return -50;
		
		if(value>0)
			return 50;
		
		if(value==0);
			return 0;
	}

}
