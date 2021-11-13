package com.xworkz.classobjectapp;

public class FlowerPotDTOUtil {
	
	public static void main(String [] args){
	    FlowerPotDTO flowerpot = new FlowerPotDTO();

	   flowerpot.setColor("orange");
	   flowerpot.setPrice(850.00);
	   flowerpot.setMaterial("Plastic");
	   flowerpot.setDesign("Stone and Mirror work design");

	System.out.println(flowerpot.getColor()+","+flowerpot.getPrice()+","+flowerpot.getMaterial()+","+flowerpot.getDesign());
	System.out.println(flowerpot);

	}

}
