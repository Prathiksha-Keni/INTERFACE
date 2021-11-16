package com.xworkz.FlightBooking.DAO;

public class Vistara implements FlightInterface {


	@Override
	public void placeToTravell(String FromPlace, String TopPlace) {
		System.out.println("Flights avaliable on Vistara");
		
	}

	@Override
	public void ticketBooking(int NoOfPeople) {
		System.out.println("Ticket booked for Vistara");
		
	}

	@Override
	public void flightDuration() {
		System.out.println("Flight Duration for Vistara is 15hr");
		
	}
}
