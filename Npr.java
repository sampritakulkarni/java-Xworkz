class Npr{
public static void main(String a[]){
System.out.println("main method started");

int npr= fact(5)/(fact(5-2));
   System.out.println(npr);
System.out.println("main method ended");
}

public static int fact(int n){
System.out.println("invoked fact method");
int f=1;
for(int i=1;i<=n;i++){
  f=f*i;
}
  System.out.println(f);
System.out.println("end of fact method");
return f;
}
}