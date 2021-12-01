package com.xworkz.movie;

import com.xworkz.movie.constants.TicketType;

public class TheaterStarter {
	
	public static void main(String [] args) {
		Theater theater = new Theater("Mugilpete");
		
		theater.bookTicket("Mugilpete",TicketType.GANDHI_CLASS, 5);
		theater.bookTicket("Mugilpete",TicketType.MIDDLE_CLASS, 5);
		theater.bookTicket("Mugilpete",TicketType.BALCONY, 3);
		
		
		System.out.println("after booking.......");
	}

}
