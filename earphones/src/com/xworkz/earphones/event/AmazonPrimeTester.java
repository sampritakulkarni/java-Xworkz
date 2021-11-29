package com.xworkz.earphones.event;

import com.xworkz.earphones.event.AmazonPrime;

public class AmazonPrimeTester {
	public static void main(String[] args) throws NotPrimeMemberException {
		AmazonPrime amazon = new AmazonPrime();
		amazon.freeDelivery(false, "Karnataka");
		System.out.println("Should be Kannadiga.........");
	}

}
