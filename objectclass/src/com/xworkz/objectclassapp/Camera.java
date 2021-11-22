package com.xworkz.objectclassapp;

public class Camera {
	private String brand;
	private String modelNo;
	private double price;
	private String company;
	
	
	public Camera() {
	}
	
	public Camera(String brand,String modelNo,double price,String comany) {
		super();
		this.brand=brand;
		this.modelNo=modelNo;
		this.price=price;
		this.company=company;
	}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand=brand;
}
public String getModelNo() {
	return modelNo;
}
public void setModelNo(String ModelNo) {
	this.modelNo=modelNo;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price=price;
}
public String getCompany() {
	return company;
}
public void setCompany(String Company) {
	this.company=company;
}
@Override
public String toString() {
	return "Camera - [brand="+brand+",modelNo="+modelNo+",price="+price+",comapny="+company
			+"]";
}

}
