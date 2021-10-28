class AddNumbers1{

public static void main(String a[]){

int value=add(45,67);
System.out.println(value);
int ans=add(78,23);
System.out.println(ans);
int output=add(56,123);
System.out.println(output);
int finalOutput=add(67,12345);
System.out.println(finalOutput);

add(60,5,6);

}

public static int add(int a,int b){
return a+b;
}
public static void add(int a,int b,int d){
  System.out.println(a+b+d);
}
}