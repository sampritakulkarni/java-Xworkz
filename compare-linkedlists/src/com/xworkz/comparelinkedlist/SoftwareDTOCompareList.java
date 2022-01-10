package com.xworkz.comparelinkedlist;

import java.util.Comparator;

public  class SoftwareDTOCompareList  implements Comparator<SoftwareDTO> {
	
	private SoftwareNameComparator softwareNameComparator;
	private SoftwareIdComparator softwareIdComparator;
	private SoftwarePriceComparator softwarePriceCompator;
	private SoftwareVersionComparator   softwareVersionComparator;
	private SoftwareAutoSaveSupportedComparator  softwareAutoSaveSupportedComparator;
	private SoftwareInternetAppComparator  softwareInternetAppComparator;
	
	
	public SoftwareDTOCompareList(SoftwareNameComparator softwareNameComparator,SoftwareIdComparator softwareIdComparator,SoftwarePriceCompator softwarePriceCompator,
			SoftwareVersionComparator   softwareVersionComparator,SoftwareAutoSaveSupportedComparator  softwareAutoSaveSupportedComparator,
			SoftwareInternetAppComparator  softwareInternetAppComparator) {

		super();
		this.softwareNameComparator=softwareNameComparator;
		this.softwareIdComparator=softwareIdComparator;
		this.softwarePriceComparator=softwarePriceCompator;
		this.softwareVersionComparator=softwareVersionComparator;
		this.softwareAutoSaveSupportedComparator=softwareAutoSaveSupportedComparator;
		this.softwareInternetAppComparator=softwareInternetAppComparator;
		
		
	}
	@Override
	public int compare(SoftwareDTO obj1, SoftwareDTO obj2) {
		int nameRes=softwareNameComparator.compare(obj1,obj2);
		if(namesRes!=0) {
			return nameRes;
		}
		
	int idRes=softwareIdComparator.compare(obj1,obj2);
		if(idRes!=0) {
			return idRes;
		}
	int priceRes=softwareIdComparator.compare(obj1,obj2);
	if(priceRes!=0) {
		return priceRes;
	}
	
	int versionRes=softwareVersionComparator.compare(obj1,obj2);
	if(versionRes!=0) {
		return versionRes;
	}
	
	int autoSaveSupportedRes=softwareAutoSaveSupportedComparator.compare(obj1, obj2);
	if(autoSaveSupportedRes!=0) {
		return internetAppRes;
	}
	return 0;
}
}
