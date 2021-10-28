class  Bank {

public AccountDetailsDTO[] accountDetails;
private int index;

public Bank(int size){

accountDetails = new AccountDetailsDTO[size];
}

public boolean addAccountDetails(AccountDetailsDTO accountDetails){  
  boolean isAdded=false;
System.out.println("inside addAccountDetails()");
if(accountDetails!=null){
System.out.println("got the account details");
this.accountDetails[index++]=accountDetails;
isAdded=true;
}

else{
  System.out.println("cannot add account Details");
}
return isAdded;
}

public void getAccountDetails(){
  for(int i=0;i<accountDetails.length;i++){
  System.out.println(accountDetails[i].getAccountId()+" "+accountDetails[i].getAccountName()+" "+accountDetails[i].getAccountAddress()+" "+accountDetails[i].getAccountType());

}

}

}