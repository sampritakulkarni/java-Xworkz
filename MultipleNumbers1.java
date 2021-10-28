class MultipleNumbers1{

public static void main(String a[]){

int value=mul(90,7865);
System.out.println(value);
int ans=mul(567,678);
System.out.println(ans);
int output=mul(4563,6789);
System.out.println(output);
int finalOutput=mul(55,77);
System.out.println(finalOutput);


mul(78,2,4);

}

public static int mul(int a,int b){
return a*b;
}
public static void mul(int a,int b,int c){
System.out.println(a*b*c);
}
}