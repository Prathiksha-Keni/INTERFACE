package com.xworkz.Scanner.DAO;

import com.xworkz.Scanner.DTO.ScannerDto;

public interface ScannerInterface {

	public void saveDto(ScannerDto obj);
	public void displayAll();
	public void update(String brand,String newbrand);
	public void displayByBrand(String brand);
	public void delete(int price);
}
