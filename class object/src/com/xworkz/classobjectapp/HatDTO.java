package com.xworkz.classobjectapp;

public class HatDTO {
	
	private String color;
	private double price;
	private String material;
	private String design;

	public HatDTO(){
	 System.out.println("HatDTO object was created");
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
	 return "Hat - [Color="+getColor()+"Price="+getPrice()+"Material="+getMaterial()+"Design="+getDesign()+"]";
	}


}
