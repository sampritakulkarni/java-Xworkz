package com.xworkz.classobjectapp;

public class HatDTOUtil {
	
	public static void main(String [] args){
	    HatDTO hat = new HatDTO();

	   hat.setColor("Pink");
	   hat.setPrice(550.00);
	   hat.setMaterial("Soft Silk");
	   hat.setDesign("Stone work design");

	System.out.println(hat.getColor()+","+hat.getPrice()+","+hat.getMaterial()+","+hat.getDesign());
	System.out.println(hat);

	}


}
