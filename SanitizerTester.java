class SanitizerTester{

public static void main(String a[]){
System.out.println("main method started");

Sanitizer san=new Sanitizer();
san.name="Himalaya Hand Sanitizer";
san.price=90.00;
san.brand="Himalaya";
san.color="colorless";
san.displaySanitizerDetails();

san.sanitizer();


Sanitizer san1=new Sanitizer();
san1.name="Savlon Sanitizer";
san1.price=87.90;
san1.brand="Savlon";
san1.color="Orange";
san1.displaySanitizerDetails();

san1.sanitizer();


Sanitizer san2=new Sanitizer();
san2.name="Boro plus Sanitizer";
san2.price=55.00;
san2.brand="Boro plus";
san2.color="colorless";
san2.displaySanitizerDetails();

san2.sanitizer();


Sanitizer san3=new Sanitizer();
san3.name="Dettol Hand Sanitizer";
san3.price=450.00;
san3.brand="Dettol";
san3.color="Brown";
san3.displaySanitizerDetails();

san3.sanitizer();


Sanitizer san4=new Sanitizer();
san4.name="Patanjali Hand Sanitizer";
san4.price=88.00;
san4.brand="patanjali";
san4.color="colorless";
san4.displaySanitizerDetails();

san4.sanitizer();
System.out.println("Main method ended");


}

}


