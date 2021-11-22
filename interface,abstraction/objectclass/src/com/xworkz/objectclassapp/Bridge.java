package com.xworkz.objectclassapp;

public class Bridge {
	private String name;
	private String length;
	private double price;
	private int year;
	
	public Bridge() {
	}
	
	public Bridge(String name, String length, double price,int year ) {
		super();
		this.name=name;
		this.length=length;
		this.price=price;
		this.year=year;
		
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public String getLength() {
	return length;
}
public void setlength(String length) {
	this.length=length;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price=price;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year=year;
}
@Override
public String toString() {
	return "Bridge -[name="+name+",length="+length+",price="+price+",year="+year+"]";
			
}
}
