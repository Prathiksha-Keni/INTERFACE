package com.xworkz.DataSharing.DAO;

public class WhatsApp implements ShareInterface {

	@Override
	public void shareImage() {
		System.out.println("Image shared through whatsapp");
		
	}

	@Override
	public void shareMessage() {
		System.out.println("Message shared through whatsapp");

		
	}

	@Override
	public void shareAudio() {
		System.out.println("Audio shared through whatsapp");
		
	}

	@Override
	public void shareVideo() {
		System.out.println("Video shared through whatsapp");
		
	}

}
