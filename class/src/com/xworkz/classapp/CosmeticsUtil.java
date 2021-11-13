package com.xworkz.classapp;

public class CosmeticsUtil {
	
	public static void main(String a[]){
		System.out.println("main method started");

		Cosmetics cos = new Cosmetics();
		cos.name="lipstics";
		  cos.price=7000.00;
		  cos.brand="Hydra-Matte";
		  cos.color="Colourfull";
		  cos.address="purple";
		cos.displayCosmeticsDetails();
		cos.cosmetics();


		Cosmetics cos1 = new Cosmetics();
		cos1.name="Nail Polish";
		  cos1.price=2000.00;
		  cos1.brand="Lakme";
		  cos1.color="Red";
		  cos1.address="online";
		cos1.displayCosmeticsDetails();
		cos1.cosmetics();

		Cosmetics cos2 = new Cosmetics();
		cos2.name="Foundation";
		  cos2.price=2500.00;
		  cos2.brand="maybelline";
		  cos2.color="Skin color";
		  cos2.address="shop";
		cos2.displayCosmeticsDetails();
		cos2.cosmetics();

		Cosmetics cos3 = new Cosmetics();
		cos3.name="eyeliner";
		  cos3.price=800.00;
		  cos3.brand="mac";
		  cos3.color="black";
		  cos3.address="purple";
		cos3.displayCosmeticsDetails();
		cos3.cosmetics();

		Cosmetics cos4 = new Cosmetics();
		cos4.name="compact";
		  cos4.price=750.00;
		  cos4.brand="lakme";
		  cos4.color="white";
		  cos4.address="girls bag";
		cos4.displayCosmeticsDetails();
		cos4.cosmetics();

		}

}
