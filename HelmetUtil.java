class HelmetUtil{

public static void main(String a[]){
System.out.println("main method started");

Helmet helmet=new Helmet();
helmet.name="Studds Professional Black with black strip full face helmet";
helmet.price=949.00;  
helmet.brand="Studds";  
helmet.color= "Black and White";

helmet.displayHelmetDetails();
helmet.helmet();

Helmet helmet1=new Helmet();
helmet1.name=" Shoei helmet";
helmet1.price=5400.00;  
helmet1.brand="Shoei";  
helmet1.color= "Black";

helmet1.displayHelmetDetails();
helmet1.helmet();


Helmet helmet2=new Helmet();
helmet2.name="HJC helmet";
helmet2.price=6429.00;  
helmet2.brand="HJC";  
helmet2.color= "White";

helmet2.displayHelmetDetails();
helmet2.helmet();

Helmet helmet3=new Helmet();
helmet3.name="AGV helmet";
helmet3.price=9493.00;  
helmet3.brand="AGV";  
helmet3.color= "Black and orange";

helmet3.displayHelmetDetails();
helmet3.helmet();


Helmet helmet4=new Helmet();
helmet4.name="Arai helmet";
helmet4.price=8764.00;  
helmet4.brand="Studds";  
helmet4.color= "Black and White";

helmet4.displayHelmetDetails();
helmet4.helmet();

}

}