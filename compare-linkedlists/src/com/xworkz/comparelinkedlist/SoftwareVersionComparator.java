package com.xworkz.comparelinkedlist;

import java.util.Comparator;

public class SoftwareVersionComparator implements Comparator<SoftwareDTO> {

	@Override
	public int compare(SoftwareDTO obj1, SoftwareDTO obj2) {
		
		Double version1=(Double) obj1.getVersion();
		Double version2=(Double) obj2.getVersion();
		return version1.compareTo(version2);
	}

}
