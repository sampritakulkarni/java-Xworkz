package com.xworkz.election;

public class ElectionUtil {
 
	public static void main(String[] args) {
		
		Election election = new Voter();
		
		ElectionCommission electionCommission=new ElectionCommission(election);
		System.out.println(electionCommission.cardValidation());
	}
}
