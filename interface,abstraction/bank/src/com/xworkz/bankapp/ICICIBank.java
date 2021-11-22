package com.xworkz.bankapp;

public class ICICIBank  extends Bank {

	@Override
	public void provideLoan() {
		System.out.println("Provide Loan by ICICI bank");
	}

	@Override
	public void openAccount() {
		System.out.println("Open Account in ICICI bank");
	}

	@Override
	public void closeAccount() {
		System.out.println("Close Accoun in ICICI bank");
	}

}
