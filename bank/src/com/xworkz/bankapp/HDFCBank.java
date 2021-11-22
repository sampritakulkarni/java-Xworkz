package com.xworkz.bankapp;

public class HDFCBank  extends Bank {

	@Override
	public void provideLoan() {
		System.out.println("loan provided by HDFC bank");
		
	}

	@Override
	public void openAccount() {
		System.out.println("Account open in HDFC bank");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("Account close in HDFC bank");
	}

}
	
	

