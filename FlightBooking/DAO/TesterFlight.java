package com.xworkz.FlightBooking.DAO;

public class TesterFlight {

	public static void main(String[] args) {
		Vistara flight = new Vistara();
		flight.placeToTravell("bangalore", "delhi");
		flight.ticketBooking(2);
		flight.flightDuration();

	}

}
