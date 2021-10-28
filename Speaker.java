class Speaker{

static String name = "JBL";
static int minVolume = 0;
static int maxVolume=6;
static int currentVolume ; 
static boolean isConnected ; 



public static void onOrOff(){
System.out.println("invoked onOrOff()");
  if(isConnected == false){
    isConnected = true;
 System.out.println("Speaker is turned On...");
    }
 else if(isConnected == true){ 
   isConnected = false;
System.out.println("Speaker is turned Off...");
}
System.out.println("end of onOrOff()");
}


public static void  increaseVolume(){
System.out.println("inside increaseVolume()");
if(isConnected){
 if(currentVolume < maxVolume ){
   currentVolume = currentVolume+1 ;    
System.out.println("the current volume is : "+currentVolume);
}
else {
   System.out.println("max volume reached....");
  }
}

else{
System.out.println("Gubee.... first turn on the speaker");
}
System.out.println("end of increaseVolume()");
}

public static void decreaseVolume(){
System.out.println("inside decreaseVolume()");
if(isConnected){
if(currentVolume>=minVolume){
currentVolume=currentVolume-1;
System.out.println("the current volume is:"+currentVolume);
}
else{
System.out.println("min volume reached...");
}
}
else{
System.out.println("Gubee.... first turn on the speaker");
}
System.out.println("end of decreaseVolume()");
}
}

