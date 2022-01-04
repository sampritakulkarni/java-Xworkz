package com.xworkz.comparelinkedlist;

import java.util.Comparator;

public class SoftwareAutoSaveSupportedComparator   implements Comparator<SoftwareDTO>{
	
	@Override
	public int compare(SoftwareDTO obj1,SoftwareDTO obj2) {
		Boolean b1=(Boolean) obj1.isAutoSaveSupported();
		Boolean b2=(Boolean) obj2.isAutoSaveSupported();
		return b1.compareTo(b2);
		
	}

}
