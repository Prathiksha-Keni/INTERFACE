package com.xworkz.DataBase.DAO;

public class CompanyA implements DbOperationDao{

	@Override
	public void connectDB(String username,String password) {
		System.out.println("Company A Database connected");
		
	}

	@Override
	public void saveDB(String name,String place) {
		System.out.println("Company A Database saved");
		
	}

	@Override
	public void updateDB(String name,String place) {
		System.out.println("Company A Database updated");
		
	}

	@Override
	public void deleteDB(String name) {
		System.out.println("Company A Database deleted");
		
	}

}
