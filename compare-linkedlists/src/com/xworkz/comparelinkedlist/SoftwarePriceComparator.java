package com.xworkz.comparelinkedlist;

import java.util.Comparator;

public class SoftwarePriceComparator implements Comparator<SoftwareDTO> {

	@Override
	public int compare(SoftwareDTO obj1, SoftwareDTO obj2) {
		
		Double price1=(Double) obj1.getPrice();
		Double price2=(Double) obj2.getPrice();
		return price1.compareTo(price2);
	}

}
