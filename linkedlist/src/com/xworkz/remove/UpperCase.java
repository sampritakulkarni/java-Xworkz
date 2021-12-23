package com.xworkz.remove;

public class UpperCase {
	
	public static void main(String[] args) {
		String str="CollecTion FraMeWorK";
		str=str.replaceAll("[A-Z]", "");
		System.out.println(str);
	}
	

}
