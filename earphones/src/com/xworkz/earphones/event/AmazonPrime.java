package com.xworkz.earphones.event;

import com.xworkz.earphones.event.NotPrimeMemberException;

public class AmazonPrime {

	public void freeDelivery(boolean primeMember,String country) throws NotPrimeMemberException{
		System.out.println("invoked freeDelivery method)");
		if(primeMember && country!=null && country.length()>3 && country.length()<=20) {
			System.out.println("can take membership");
			
		}
		else {
			System.err.println("cannot take membership");
			
			throw new NotPrimeMemberException();
		}
	}
}
