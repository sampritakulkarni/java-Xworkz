class ShoeUtil{

public static void main(String a[]){
System.out.println("Main method started");

Shoe shoe= new Shoe();
shoe.name="Earth Shoes";
shoe.price=2500.00;
shoe.brand="NIKE";
shoe.color="white and Pink";
shoe.address="Online";

shoe.displayShoeDetails();
shoe.shoe();

Shoe shoe1= new Shoe();
shoe1.name="puma";
shoe1.price=5500.00;
shoe1.brand="puma";
shoe1.color= "Pink";
shoe1.address="Online";

shoe1.displayShoeDetails();
shoe1.shoe();

Shoe shoe2= new Shoe();
shoe2.name="bata Causal";
shoe2.price=6500.00;
shoe2.brand="bata";
shoe2.color="blue and white";
shoe2.address="Online";

shoe2.displayShoeDetails();
shoe2.shoe();

Shoe shoe3= new Shoe();
shoe3.name="pumaSport";
shoe3.price=7000.00;
shoe3.brand="puma";
shoe3.color="gray and Pink";
shoe3.address="Online";

shoe3.displayShoeDetails();
shoe3.shoe();

Shoe shoe4= new Shoe();
shoe4.name="lancercausal";
shoe4.price=9500.00;
shoe4.brand="lancer";
shoe4.color="white and black";
shoe4.address="Online";

shoe4.displayShoeDetails();
shoe4.shoe();
}
}


