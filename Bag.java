class  Bag{

public BookDetailsDTO[] bookDetails;
private int index;

public Bag(int size){

bookDetails = new BookDetailsDTO[size];
}

public boolean addBookDetails(BookDetailsDTO bookDetails){  
  boolean isAdded=false;
System.out.println("inside addBookDetails()");
if(bookDetails!=null){
System.out.println("got the book details");
this.bookDetails[index++]=bookDetails;
isAdded=true;
}

else{
  System.out.println("cannot add book Details");
}
return isAdded;
}

public void getBookDetails(){
  for(int i=0;i<bookDetails.length;i++){
  System.out.println(bookDetails[i].getBookId()+" "+bookDetails[i].getBookName()+" "+bookDetails[i].getBookAddress()+" "+bookDetails[i].getBookType());

}

}

}