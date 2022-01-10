package com.xworkz.comparelinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoftwareDemo {

	public static void main(String[] args) {
		
		List<SoftwareDTO> list=new ArrayList<SoftwareDTO>();
		
		SoftwareDTO software1=new SoftwareDTO(8,"FACE BOOK",400.00,1.1,false,true);
		SoftwareDTO software2=new SoftwareDTO(7,"WhatsApp",500.00,1.2,true,false);
		SoftwareDTO software3=new SoftwareDTO(6,"InstaGram",450.00,1.3,false,true);
		SoftwareDTO software4=new SoftwareDTO(5,"You Tube",408.00,1.4,true,false);
		SoftwareDTO software5=new SoftwareDTO(4,"PayTm",100.00,1.5,false,true);
		
		list.add(software1);
		list.add(software2);
		list.add(software3);
		list.add(software4);
		list.add(software5);
		
//		Collections.sort(list,new SoftwarePriceComparartor());
//		Collections.sort(list,new SoftwarePriceComparator());
//		Collections.sort(list,new SoftwarePriceComparator());
//		Collections.sort(list,new SoftwarePriceComparator());
//		Collections.sort(list,new SoftwareVersionComparator());
//		Collections.sort(list,new SoftwareAutoSaveSupportedComparator());
//		
		
		
		Collections.sort(list,new SoftwareDTOCompareList(
				new SoftwareNameComparator(),
				new SoftwareIdComparartor(),
				new SoftwarePriceComparator(),
				new SoftwareVersionComparator(),
				new SoftwareAutoSaveSupportedComparator(),
				new SoftwareInternetAppComparator()
				));
		for(SoftwareDTO softwareDTO:list) {
			System.out.println(softwareDTO);
		}
	}

}
