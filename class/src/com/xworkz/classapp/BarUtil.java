package com.xworkz.classapp;

public class BarUtil {
	
	public static void main(String a[]){
		System.out.println("main method started");

		Bar bar= new Bar();
		bar.name="Lime and salt";
		bar.price=7850.00;
		bar.idea="Studio kook classic mini bar";
		bar.color="browm";

		bar.displayBarDetails();
		bar.bar();

		Bar bar1= new Bar();
		bar1.name="Beer Garden";
		bar1.price=8675.00;
		bar1.idea="classic mini bar";
		bar1.color="white";

		bar1.displayBarDetails();
		bar1.bar();


		Bar bar2= new Bar();
		bar2.name="wild rover pub";
		bar2.price=5678.00;
		bar2.idea="cheers and beers";
		bar2.color="black";

		bar2.displayBarDetails();
		bar2.bar();

		Bar bar3= new Bar();
		bar3.name="cocktail country";
		bar3.price=6753.00;
		bar3.idea="happy new year";
		bar3.color="colorful";

		bar3.displayBarDetails();
		bar3.bar();

		Bar bar4= new Bar();
		bar4.name="lion";
		bar4.price=7777.00;
		bar4.idea="speakeasy";
		bar4.color="black";

		bar4.displayBarDetails();
		bar4.bar();

		}


}
