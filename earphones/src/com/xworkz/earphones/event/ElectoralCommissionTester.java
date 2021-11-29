package com.xworkz.earphones.event;

import  com.xworkz.earphones.event.ElectoralCommission;

public class ElectoralCommissionTester {
	 public static void main(String[] args) throws NotEligibleforVoteException {
		ElectoralCommission commission = new ElectoralCommission();
		commission.canVote("Samprita", 22);
		
		System.out.println("Eligible for voting ......");
	}
	

}
