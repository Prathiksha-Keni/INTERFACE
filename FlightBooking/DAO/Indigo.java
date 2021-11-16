package com.xworkz.FlightBooking.DAO;

public class Indigo implements FlightInterface {

	@Override
	public void placeToTravell(String FromPlace, String TopPlace) {
		System.out.println("Flights avaliable on Indigo");
		
	}

	@Override
	public void ticketBooking(int NoOfPeople) {
		System.out.println("Ticket booked for Indigo");
		
	}

	@Override
	public void flightDuration() {
		System.out.println("Flight Duration for Indigo is 7hr");
		
	}

}
