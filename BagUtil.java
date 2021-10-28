import java.util.Scanner;

class BagUtil{

public static void main(String a[]){
  Scanner sc = new Scanner(System.in);
System.out.println("Enter the size");
 int size = sc.nextInt();
 Bag bag = new Bag(size);

   BookDetailsDTO dto = new BookDetailsDTO();
        dto.setBookId(564);
        dto.setBookName("The fairy story");
        dto.setBookAddress("library");
        dto.setBookType("sam");
bag.addBookDetails(dto);

bag.getBookDetails();

}

}