import java.util.Scanner;

class PGUtil{

public static void main(String a[]){
  Scanner sc = new Scanner(System.in);
System.out.println("Enter the size");
 int size = sc.nextInt();
 PG pg = new PG(size);

   RoomDetailsDTO dto = new RoomDetailsDTO();
        dto.setRoomId(564);
        dto.setRoomName("The pink");
        
        
PG.addRoomDetails(dto);

PG.getRoomDetails();

}

}