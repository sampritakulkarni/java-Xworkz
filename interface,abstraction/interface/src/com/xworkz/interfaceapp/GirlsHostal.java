package com.xworkz.interfaceapp;

public class GirlsHostal  implements Hostal {

	@Override
	public void admission() {
		System.out.println("Take Admission in Hostal");
	}

	@Override
	public void closeTime() {
		System.out.println("Close time after 7:00 pm");
	}

	@Override
	public void gender() {
		System.out.println("Only for Girls");
	}

}
