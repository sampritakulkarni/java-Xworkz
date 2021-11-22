package com.xworkz.bankapp;

public  abstract class Bank {
	public void bank(String[] args) {  
		System.out.println("Deposite money");
	}
	
	public abstract void provideLoan();
	
	public abstract void openAccount();
	
	public abstract void closeAccount();
   
}
