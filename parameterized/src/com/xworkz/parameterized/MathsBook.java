package com.xworkz.parameterized;

public class MathsBook {

	
	int printerId;
	String size;
	String publication;
	double price;
	String author;

	public MathsBook(int pId, String sz, String  pub, double pc, String aut){
	  System.out.println("MathsBook object is created is created");
	printerId=pId;
	size=sz;
	publication=pub;
	price=pc;
	author=aut;
	}

	public void maths(){
	System.out.println("Solved Problems");
	}

	public  void displayDetails(){
	System.out.println(printerId+","+size+","+publication+","+price+","+author);
	}

	public static void main(String a[]){
	  MathsBook mathsBook= new MathsBook(675,"7*8 inch","M.C.Grawhill",450,"Umarani");
	mathsBook.displayDetails();
	   MathsBook mathsBook1= new MathsBook(6754,"6*9 inch","M.C.Grawhill",550,"PadmaReddy");
	mathsBook1.displayDetails();
	mathsBook.maths();
	mathsBook1.maths();

	}

}
