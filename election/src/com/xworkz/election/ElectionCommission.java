package com.xworkz.election;

public class ElectionCommission {

	
	private Election election;
	
	public ElectionCommission(Election election) {
		this.election=election;
	}
	
	public String cardValidation() {
		System.out.println("Invoked cardValidation");
		int age=election.validAge();
		int wardNum=election.wardNo();
		String address=election.address();
		boolean validated=false;
		
		if(age >= 18 && (wardNum>=1 &&wardNum<=300) && (address.length() >=1 &&address.length()  <=50)) {
		validated=true;	
		}
		return validated==true?"carddetails are good to be validated":"provide a valid details";
	}
}
