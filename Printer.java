class Printer{

int printerId;
String size;
String brand;
double price;
String type;

  public Printer(int pId, String sz, String brnd, double pc, String tp){
 System.out.println("Printer object is created");
 printerId=pId;
 size=sz;
 brand=brnd;
 price=pc;
 type=tp;
}

public void print(){
System.out.println("printing papers");
}

public void displayDetails(){
System.out.println(printerId+" ,"+ size+" ,"+ brand+", "+price+" ,"+type);
}

public static void main(String a[]){
 Printer printer = new Printer(4567,"12x12 inch","HP",8000.00,"Ink-Jet");
printer.displayDetails();
Printer printer1 = new Printer(5678,"15x15 inch","canon",7000.00,"Normal");
printer1.displayDetails();
printer.print();
printer1.print();

}

}