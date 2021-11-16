package com.xworkz.OnlineShopping.DAO;

public class TesterShopping {

	public static void main(String[] args) {
		Flipkart shop = new Flipkart();
		shop.login("Prathiksha", "p123");
		shop.cart();
		shop.orders();
		shop.mobileCategory();
		shop.electronicCategory();
		shop.homeCategory();
		shop.fashionCategory();
		shop.shipmentaddress("Bangalore");

	}

}
