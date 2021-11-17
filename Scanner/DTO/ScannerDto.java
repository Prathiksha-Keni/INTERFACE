package com.xworkz.Scanner.DTO;

public class ScannerDto {

	private String brand;
	private String color;
	private int price;
	private String ColorMode;
	private int resolution;
	public ScannerDto(String brand, String color, int price, String colorMode, int resolution) {
		System.out.println("DTO created");
		this.brand = brand;
		this.color = color;
		this.price = price;
		ColorMode = colorMode;
		this.resolution = resolution;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColorMode() {
		return ColorMode;
	}
	public void setColorMode(String colorMode) {
		ColorMode = colorMode;
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	
	
}
