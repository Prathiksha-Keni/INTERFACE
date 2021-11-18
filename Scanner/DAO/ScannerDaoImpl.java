package com.xworkz.Scanner.DAO;


import com.xworkz.Scanner.DTO.ScannerDto;

public class ScannerDaoImpl implements ScannerInterface{

	public ScannerDaoImpl() {
		System.out.println("DAO created");
	}
	ScannerDto scanner[]=new ScannerDto[5];
	int index=0;
	@Override
	public void saveDto(ScannerDto obj) {
		System.out.println("Inside save method");
		System.out.println("--------------------");
		scanner[index]=obj;
		index++;
		
	}
	@Override
	public void displayAll() {
		for (int i = 0; i < scanner.length; i++) {
			if(scanner[i]!=null) {
			System.out.println(scanner[i].getBrand());
			System.out.println(scanner[i].getColor());
			System.out.println(scanner[i].getPrice());
			System.out.println(scanner[i].getColorMode());
			System.out.println(scanner[i].getResolution());
			System.out.println("--------------------");
		}
		}
		
	}
	@Override
	public void update(String brand,String newbrand) {
		for (int i = 0; i < scanner.length; i++) {
			if (scanner[i].getBrand().equals(brand)) {
				scanner[i].setBrand(newbrand);
			}
		}
		
	}
	@Override
	public void delete(int price) {
		for (int i = 0; i < scanner.length; i++) {
			if (scanner[i].getPrice()==price) {
				scanner[i]=null;
			}
	}


	}
}
