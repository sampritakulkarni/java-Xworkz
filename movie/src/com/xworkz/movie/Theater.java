package com.xworkz.movie;

import com.xworkz.movie.constants.TicketType;
import com.xworkz.movie.exception.HouseFullRunTimeException;

public class Theater {
 
	private final int gandhiClassTicket=5;
	private final int middleClassTicket=5;
	private final int balconyTicket=2;
	private String movieName;
	
	public Theater(String movieName) {
		this.movieName=movieName;
	}
	public boolean bookTicket(String movieName,TicketType ticketType, int totalTickets) {
		
		System.out.println("invoked bookTicket");
		if(movieName.equals(movieName) && TicketType.GANDHI_CLASS.equals(ticketType)) {
			if(TicketType.GANDHI_CLASS.equals(ticketType) && totalTickets<=this.gandhiClassTicket) {
				System.out.println(this.movieName.concat("is booked with").concat(ticketType.toString()));
				return true;
				
			}else {
				System.err.println("cannot bookticket for".concat(movieName).concat("ticket is full for"));
				throw new HouseFullRunTimeException("Gandhi class can have max 5 tickets only");
			}
			
			
		}
		
		if(movieName.equals(movieName)&& TicketType.MIDDLE_CLASS.equals(ticketType) ) {
			if(TicketType.MIDDLE_CLASS.equals(ticketType) && totalTickets<=this.middleClassTicket) {
				System.out.println(this.movieName.concat("is booked with").concat(ticketType.toString()));
				return true;
				
			}else {
				System.err.println("cannot bookticket for".concat(movieName).concat("ticket is full for"));
				throw new HouseFullRunTimeException("middle class can have max 5 tickets only");
			}
			
			
		}
		
		if(movieName.equals(movieName) &&TicketType.BALCONY.equals(ticketType)) {
			if(TicketType.BALCONY.equals(ticketType) && totalTickets<=this.balconyTicket) {
				System.out.println(this.movieName.concat("is booked with").concat(ticketType.toString()));
				return true;
				
			}else {
				System.err.println("cannot bookticket for".concat(movieName).concat("ticket is full for"));
				throw new HouseFullRunTimeException(" balcony can have max 2 tickets only");
			}
			
			
		}
		return false;
	}
}

