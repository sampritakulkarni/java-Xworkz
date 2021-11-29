package com.xworkz.earphones.event;

import com.xworkz.earphones.event.CashLessException;

public class MedicalInsurance {

	public void canAvailCashLess(double totalHour,String name) throws CashLessException{
		System.out.println("invoked canAvailCashLess method");
		if(name!=null && name.length()>3 && name.length()<=20 && totalHour>=8) {
			System.out.println("can be AvailCashLess");
		}
		else {
			System.out.println("canot be AvailCashLess");
			
			throw new CashLessException();
		}
	}
}
