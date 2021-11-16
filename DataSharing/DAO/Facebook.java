package com.xworkz.DataSharing.DAO;

public class Facebook implements ShareInterface {
	
	@Override
	public void shareImage() {
		System.out.println("Image shared through Facebook");
		
	}

	@Override
	public void shareMessage() {
		System.out.println("Message shared through Facebook");

		
	}

	@Override
	public void shareAudio() {
		System.out.println("Audio shared through Facebook");
		
	}

	@Override
	public void shareVideo() {
		System.out.println("Video shared through Facebook");
		
	}
}
