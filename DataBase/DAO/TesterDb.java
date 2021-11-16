package com.xworkz.DataBase.DAO;

public class TesterDb {

	public static void main(String[] args) {
		CompanyB a = new CompanyB();
		a.connectDB("Prathiksha","p123");
		a.saveDB("Prathiksha","bangalore");
		a.updateDB("Prathiksha Keni","mangalore");
		a.deleteDB("Prathiksha Keni");

	}

}
