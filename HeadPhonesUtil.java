class HeadPhonesUtil{

public static void main(String a[]){
System.out.println("main method started");

HeadPhones headphones =new HeadPhones();
headphones.name="Apple headphones and headsets";
headphones.price=37390.00;
headphones.brand="Apple";
headphones.color="Blue";

headphones.displayHeadPhonesDetails();
headphones.headphones();

HeadPhones headphones1 =new HeadPhones();
headphones1.name="headphones and headsets";
headphones1.price=6785.00;
headphones1.brand="Any";
headphones1.color="black";

headphones1.displayHeadPhonesDetails();
headphones1.headphones();

HeadPhones headphones2 =new HeadPhones();
headphones2.name="headphones and headsets";
headphones2.price=8734.00;
headphones2.brand="sony";
headphones2.color="dark pink";

headphones2.displayHeadPhonesDetails();
headphones2.headphones();


HeadPhones headphones3 =new HeadPhones();
headphones3.name="headphones";
headphones3.price=9873.00;
headphones3.brand="samsung";
headphones3.color="purple";

headphones3.displayHeadPhonesDetails();
headphones3.headphones();


HeadPhones headphones4 =new HeadPhones();
headphones4.name="headsets";
headphones4.price=6538.00;
headphones4.brand="Bose";
headphones4.color="black and white";

headphones4.displayHeadPhonesDetails();
headphones4.headphones();

}

}
