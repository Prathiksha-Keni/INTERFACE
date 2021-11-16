package com.xworkz.OnlineShopping.DAO;

public class Amazon implements ShoppingInterface {

	@Override
	public void login(String username, String password) {
		System.out.println("Login to Amazon");
		
	}

	@Override
	public void cart() {
		System.out.println("Items added to Amazon cart");
		
	}

	@Override
	public void orders() {
		System.out.println("Your orders");
		
	}

	@Override
	public void mobileCategory() {
		System.out.println("products categorised on mobile");
		
	}

	@Override
	public void electronicCategory() {
		System.out.println("products categorised on electronic gadgets");
		
	}

	@Override
	public void homeCategory() {
		System.out.println("products categorised on home appliances");
		
	}

	@Override
	public void fashionCategory() {
		System.out.println("products categorised on fashion");
		
	}
	public void shipmentaddress(String address) {
		System.out.println("Shipment address is "+address);
	}
}
