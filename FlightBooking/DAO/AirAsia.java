package com.xworkz.FlightBooking.DAO;

public class AirAsia implements FlightInterface {

	@Override
	public void placeToTravell(String FromPlace, String TopPlace) {
		System.out.println("Flights avaliable on AirAsia");
		
	}

	@Override
	public void ticketBooking(int NoOfPeople) {
		System.out.println("Ticket booked for AirAsia");
		
	}

	@Override
	public void flightDuration() {
		System.out.println("Flight Duration for AirAsia is 10hr");
		
	}
}
