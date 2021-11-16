package com.xworkz.BillPayement.DAO;

public class PhonePay implements OnlineTransaction{

	@Override
	public void mobilePayement() {
		System.out.println("Mobile bill paid via PhonePay");
		
	}

	@Override
	public void electricityPayement() {
		System.out.println("Electricity bill paid via PhonePay");
		
	}

	@Override
	public void cardPayement() {
		System.out.println("Card bill paid via PhonePay");
		
	}
	
	public void addMoneyToWallet() {
		System.out.println("Add money to phone pay wallet");
	}

}
