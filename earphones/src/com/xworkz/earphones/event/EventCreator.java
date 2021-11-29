package com.xworkz.earphones.event;

public class EventCreator {
	public static void main(String[] args) {
		 
		System.out.println("created EventCreator no-arg");
	}
//exception event
	//abnormal situation
	//stop execution of program public void
	
	 public void createExceptionalEvent(){
		//No exception of type integer can be thrown; an exception type must be a subclass of throwable;
		RuntimeException runtimeException=new RuntimeException();
		throw runtimeException;
			
	}

}

