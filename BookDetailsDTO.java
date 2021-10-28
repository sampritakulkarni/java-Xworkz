public class BookDetailsDTO{

 private int bookId;
 private String bookName;
 private String bookAddress;
 private String bookType;

public BookDetailsDTO(){
System.out.println("BookDetailsDTO object is created");
}

   public int getBookId(){
     return bookId;
}

  public void setBookId(int bookId){
this.bookId=bookId;
}

public String getbookName(){
return bookName;
}

public void setBookName(String bookName){
this.bookName=bookName;
}

public String getBookAddress(){
return bookAddress;
}

public void setBookAddress(String bookAddress){
this.bookAddress=bookAddress;
}

public String getBookType(String bookType){
this.bookType=bookType;
}

}