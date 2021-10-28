import java.util.Scanner;

class BankUtil{

public static void main(String a[]){
  Scanner sc = new Scanner(System.in);
System.out.println("Enter the size");
 int size = sc.nextInt();
 Bank bank = new Bank(size);

   AccountDetailsDTO dto = new AccountDetailsDTO();
        dto.setAccountId(123);
        dto.setAccountName("samprita");
        dto.setAccountAddress("canara");
        dto.setAccountType("AABBCC");
bank.addAccountDetails(dto);

bank.getAccountDetails();

}

}