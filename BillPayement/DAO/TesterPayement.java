package com.xworkz.BillPayement.DAO;

public class TesterPayement {

	public static void main(String[] args) {
		Paytm pay = new Paytm();
		pay.mobilePayement();
		pay.electricityPayement();
		pay.cardPayement();
		pay.addMoneyToWallet();

	}

}
