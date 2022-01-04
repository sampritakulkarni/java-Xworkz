package com.xworkz.comparelinkedlist;

import java.util.Comparator;

public class SoftwareIdComparator implements Comparator<SoftwareDTO> {

	@Override
	public int compare(SoftwareDTO obj1, SoftwareDTO obj2) {
		
		Integer i1=(Integer) obj1.getSoftwareId();
		Integer i2=(Integer) obj2.getSoftwareId();
		return i1.compareTo(i2);
	}

}
