public class RoomDetailsDTO{

private int roomId;
 private String roomName;

public RoomDetailsDTO(){
System.out.println("RoomDetailsDTO object is created");
}

public int getRoomId(){
return roomId;
}

public void setRoomId(int roomId){
this.roomId=roomId;
}

public String getRoomName(){
return roomName;
}

public void setRoomName(String roomName){
this.roomName=roomName;
}

}