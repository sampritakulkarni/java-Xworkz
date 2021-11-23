package com.xworkz.election;

public class Voter   implements Election{

	@Override
	public int validAge() {
		System.out.println("Age 22");
		return 0;
	}

	@Override
	public int wardNo() {
		System.out.println("ward No 5");
		return 0;
	}

	@Override
	public String address() {
		System.out.println("Dharwad");
		return null;
	}

}
