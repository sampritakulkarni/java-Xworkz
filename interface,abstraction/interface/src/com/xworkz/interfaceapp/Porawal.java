package com.xworkz.interfaceapp;

public class Porawal implements Hospital {

	@Override
	public void register() {
		System.out.println("Registred in hospital");
	}

	@Override
	public void payAdvance() {
		System.out.println("Pay advance");
	}

	@Override
	public void validInsurance() {
		System.out.println("insurence is valid");
	}

}
