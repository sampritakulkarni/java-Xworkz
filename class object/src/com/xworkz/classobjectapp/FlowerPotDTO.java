package com.xworkz.classobjectapp;

public class FlowerPotDTO {
	
	private String color;
	private double price;
	private String material;
	private String design;

	public FlowerPotDTO(){
	 System.out.println("FlowerPotDTO object was created");
	}

	public void setColor(String color){
	this.color=color;
	}

	public String getColor(){
	return color;
	}

	public void setPrice(double price){
	this.price=price;
	}

	public double getPrice(){
	return price;
	}

	public void setMaterial(String material){
	this.material=material;
	}

	public String getMaterial(){
	return material;
	}

	public void setDesign(String design){
	this.design=design;
	}

	public String getDesign(){
	return design;
	}

	@Override
	public String toString(){
	 return "FlowerPot - [Color="+getColor()+"Price="+getPrice()+"Material="+getMaterial()+"Design="+getDesign()+"]";
	}


}
