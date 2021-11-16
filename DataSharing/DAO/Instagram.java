package com.xworkz.DataSharing.DAO;

public class Instagram implements ShareInterface{
	
	@Override
	public void shareImage() {
		System.out.println("Image shared through Instagram");
		
	}

	@Override
	public void shareMessage() {
		System.out.println("Message shared through Instagram");

		
	}

	@Override
	public void shareAudio() {
		System.out.println("Audio shared through Instagram");
		
	}

	@Override
	public void shareVideo() {
		System.out.println("Video shared through Instagram");
		
	}

}
