package com.xworkz.BillPayement.DAO;

public class Paytm implements OnlineTransaction{

	@Override
	public void mobilePayement() {
		System.out.println("Mobile bill paid via Paytm");
		
	}

	@Override
	public void electricityPayement() {
		System.out.println("Electricity bill paid via Paytm");
		
	}

	@Override
	public void cardPayement() {
		System.out.println("Card bill paid via Paytm");
		
	}
	public void addMoneyToWallet() {
		System.out.println("Add money to phone Paytm wallet");
	}

}
