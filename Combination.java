class Combination{
public static void main(String a[]){
System.out.println("main method started");
findCombiation(4,2);
System.out.println("main method ended");
}

public static void findCombination(int n,int r){
System.out.println("invoked findCombination method");
int fact=1,i;
for(int i=1;i<=n;i++){
fact=fact*i;
fact=fact(n)/(fact(n-r)*fact(r));
}

System.out.println(fact);
System.out.println("end of findCombination method");
}
}