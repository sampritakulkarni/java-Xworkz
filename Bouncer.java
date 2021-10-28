class  Bouncer{

public static void main(String a[]){
System.out.println("main method started");
check(17);
System.out.println("main method ended");
}

public static void check(int age){
System.out.println("invoked check method");

if(age>=18){
System.out.println("enter the pub and enjoyyyyyyyyyyyyyy......");
}
else{
System.out.println("grow up child.....go home and study");
}
System.out.println("end of check method");
}
}