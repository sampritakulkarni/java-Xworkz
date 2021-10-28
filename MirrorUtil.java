class MirrorUtil{

public static void main(String a[]){
System.out.println("main method started");

Mirror mi= new Mirror();
 mi.name="Leaf Designed wall mirror";
 mi.price=2500.00;
 mi.brand="Painting Mantra";
 mi.color="white and Golden";

mi.displayMirrorDetails();
mi.mirror();

Mirror mi1= new Mirror();
 mi1.name="wall mirror";
 mi1.price=5643.00;
 mi1.brand="Hosley";
 mi1.color="white and silver";

mi1.displayMirrorDetails();
mi1.mirror();

Mirror mi2= new Mirror();
 mi2.name="concave mirror";
 mi2.price=8764.00;
 mi2.brand="Exclusive lane";
 mi2.color="white";

mi2.displayMirrorDetails();
mi2.mirror();

Mirror mi3= new Mirror();
 mi3.name="convex mirror";
 mi3.price=5555.00;
 mi3.brand="Raj glass works";
 mi3.color="white";

mi3.displayMirrorDetails();
mi3.mirror();

Mirror mi4= new Mirror();
 mi4.name="plano convex-concave mirror";
 mi4.price=7774.00;
 mi4.brand="case decor";
 mi4.color="white ";

mi4.displayMirrorDetails();
mi4.mirror();

}

}