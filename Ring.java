class Ring{

String material;
double price;
int ringId ;
String shape;

@Override
public int hashCode()
{
  return ringId;
}

public static void main(String a[]){
 Ring ring =new Ring();
 ring.ringId=4;
 System.out.println(ring.hashCode());

 Ring ring1 =new Ring();
 ring1.ringId=6;
 System.out.println(ring1.hashCode());

}

}