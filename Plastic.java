class Plastic{

public int plasticId ;
public String name;
public double price ;

public void holdThings(){
System.out.println("Holding things in a organized way");
}

public void setPlasticId(int plasticId){
this.plasticId=plasticId;
}

public void setName(String name){
this.name=name;
}

public void setPrice(double price){
this.price=price;
}

public void displayDetails(){
System.out.println(this.plasticId+","+this.name+","+this.price);
}

public void toSit(){
System.out.println("sitting on a chair");
}

}
