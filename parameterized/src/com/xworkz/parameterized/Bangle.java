package com.xworkz.parameterized;

public class Bangle {

	
	int bangleId;
	String size;
	String brand;
	double price;
	String color;

	  public Bangle(int pId, String sz, String brnd, double pc, String cl){
	 System.out.println("Bangle  object is created");
	 bangleId=pId;
	 size=sz;
	 brand=brnd;
	 price=pc;
	 color=cl;
	}

	public void bangle(){
	System.out.println("cute on girls hands");
	}

	public void displayDetails(){
	System.out.println(bangleId+" ,"+ size+" ,"+ brand+", "+price+" ,"+color);
	}

	public static void main(String a[]){
	 Bangle bangle = new Bangle(456,"4*2 size","Jewels galaxy",80000.00,"white & pink");
	bangle.displayDetails();
	Bangle bangle1 = new Bangle(578,"2*6 size","Zaveri pearls",70000.00,"white & Black");
	bangle1.displayDetails();
	bangle.bangle();
	bangle1.bangle();

	}
}
