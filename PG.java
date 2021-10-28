class  PG{

public RoomDetailsDTO[] roomDetails;
private int index;

public PG(int size){

roomDetails = new RoomDetailsDTO[size];
}

public boolean addRoomDetails(RoomDetailsDTO roomDetails){  
  boolean isAdded=false;
System.out.println("inside addRoomDetails()");
if(roomDetails!=null){
System.out.println("got the room details");
this.roomDetails[index++]=roomDetails;
isAdded=true;
}

else{
  System.out.println("cannot add room Details");
}
return isAdded;
}

public void getroomDetails(){
  for(int i=0;i<roomDetails.length;i++){
  System.out.println(roomDetails[i].getRoomId()+" "+roomDetails[i].getRoomName());

}

}

}