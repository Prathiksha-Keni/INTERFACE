package com.xworkz.Scanner;

import com.xworkz.Scanner.DAO.ScannerDaoImpl;
import com.xworkz.Scanner.DTO.ScannerDto;

public class Tester {

	public static void main(String[] args) {
		ScannerDaoImpl scanner = new ScannerDaoImpl();
		ScannerDto hp = new ScannerDto ("HP","black",25000,"black n white",25);
		scanner.saveDto(hp);
		ScannerDto dell = new ScannerDto ("dell","black",35000,"colour",25);
		scanner.saveDto(dell);
		scanner.displayAll();
		scanner.update("hp", "hp v2");
		
	

	}

}
