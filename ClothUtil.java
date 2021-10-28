class ClothUtil{

public static void main(String a[]){
System.out.println("main method started");

Cloth cloth= new Cloth();
cloth.name="Lehenga";
cloth.price=6550.00;
cloth.brand="Banaras Pattern";
cloth.color="lilac and dusty pink";

cloth.displayClothDetails();
cloth.cloth();

Cloth cloth1= new Cloth();
cloth1.name="Gowns";
cloth1.price=10000.00;
cloth1.brand=" Silk";
cloth1.color="Royal Blue";

cloth1.displayClothDetails();
cloth1.cloth();


Cloth cloth2= new Cloth();
cloth2.name="Dress Materials";
cloth2.price=12000.00;
cloth2.brand="All";
cloth2.color="varities of colors";

cloth2.displayClothDetails();
cloth2.cloth();


Cloth cloth3= new Cloth();
cloth3.name="Jeans pant and T-shirt";
cloth3.price=7000.00;
cloth3.brand="Jeans";
cloth3.color="Black and Blue";

cloth3.displayClothDetails();
cloth3.cloth();

Cloth cloth4= new Cloth();
cloth4.name="Sarees";
cloth4.price=30000.00;
cloth4.brand="Mysore silk";
cloth4.color="pink";

cloth4.displayClothDetails();
cloth4.cloth();

}

}