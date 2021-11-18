package com.xworkz.Scanner;

import com.xworkz.Scanner.DAO.ScannerDaoImpl;
import com.xworkz.Scanner.DTO.ScannerDto;

public class Tester {

	public static void main(String[] args) {
		ScannerDaoImpl scanner = new ScannerDaoImpl("Epson","black",14000,"black n white",25);
		ScannerDto hp = new ScannerDto ("HP","black",25000,"black n white",25);
		scanner.saveDto(hp);
		ScannerDto dell = new ScannerDto ("dell","black",35000,"colour",30);
		scanner.saveDto(dell);
		ScannerDto samsung = new ScannerDto ("samsung","black",12000,"colour",50);
		scanner.saveDto(samsung);
		ScannerDto canon = new ScannerDto ("canon","black",15000,"colour",25);
		scanner.saveDto(canon);
		scanner.displayAll();
		System.out.println("After update");
		scanner.update("dell", "dell pro");
		scanner.displayByBrand("dell pro");
		
		
	

	}

}
