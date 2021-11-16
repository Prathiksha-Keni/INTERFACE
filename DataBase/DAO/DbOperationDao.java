package com.xworkz.DataBase.DAO;

public interface DbOperationDao {

	public void connectDB(String username,String password);
	public void saveDB(String name,String place);
	public void updateDB(String name,String place);
	public void deleteDB(String name);
}
