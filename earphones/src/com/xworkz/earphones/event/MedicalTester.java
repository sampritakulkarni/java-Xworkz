package com.xworkz.earphones.event;

import com.xworkz.earphones.event.MedicalInsurance;

public class MedicalTester {
	public static void main(String[] args) throws CashLessException {
		MedicalInsurance medical = new MedicalInsurance();
		medical.canAvailCashLess(500.00, "card");
		System.out.println("Card Accepted");
	}

}
