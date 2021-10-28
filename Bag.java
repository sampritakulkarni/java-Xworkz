class Bag{

int bagId;
int dimensions;
String department;
double price;
String type;


 public Bag( int bId, int dim, String depart, double pp, String tp ){
System.out.println("Bag Object is created");
  bagId=bId;
  dimensions=dim;
  department=depart;
  price=pp;
  type=tp;
}

public void bag(){
System.out.println("in bags , wallets and luggage");
}

  public void displayDetails(){
System.out.println(bagId+", "+dimensions+" ,"+department+", "+price+" ,"+type);
}

public static void main(String a[]){
  Bag bag=new Bag(5577,28*5*23,"women",550,"Sling bag");
  bag.displayDetails();
 
 Bag bag1=new Bag(4444,82*4*32,"All",7000,"luggage");
 bag1.displayDetails();

bag.bag();
bag1.bag();


}

}