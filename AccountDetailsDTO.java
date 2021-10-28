public class AccountDetailsDTO{

 private int accountId;
 private String accountName;
 private String accountAddress;
 private String accountType;

public AccountDetailsDTO(){
System.out.println("AccountDetailsDTO object is created");
}

   public int getAccountId(){
     return accountId;
}

  public void setAccountId(int accountId){
this.accountId=accountId;
}

public String getAccountName(){
return accountName;
}

public void setAccountName(String accountName){
this.accountName=accountName;
}

public String getAccountAddress(){
return accountAddress;
}

public void setAccountAddress(String accountAddress){
this.accountAddress=accountAddress;
}

public String getAccountType(String accountType){
this.accountType=accountType;
}

}