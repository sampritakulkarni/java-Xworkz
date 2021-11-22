package com.xworkz.objectclassapp;

public class PenDrive {
	
  private String capacity;
  private String working;
  private String brand ;
  private double price;
  
  public PenDrive() {
  }
  
  public  PenDrive(String capacity,String working,String brand,double price){
      super();
    this.capacity=capacity;
    this.working=working;
    this.brand=brand;
    this.price=price;
  
}
public String getCapacity() {
	return capacity;
}
public void setCapacity(String capacity) {
	this.capacity=capacity;
}
public String getWorking() {
	return working;
}
public void setWorking(String working) {
	this.working=working;
}
public String getBrand() {
	return brand;
}	
public void setBrand(String brand) {
	this.brand=brand;
}
public double getPrice() {
	return price;
}
public void setPrice() {
	this.price=price;
}
@Override
public String toString() {
	return "PenDrive - [capacity="+capacity+",working="+working+",brand="+brand+",price="+price
			+"]";
}

}