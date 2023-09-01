package model.service;

import java.util.Scanner;

import model.util.ContactSet;

public interface PhoneDevice {
   
	public void call(Scanner sc);
	
	public void answerCall();
	
	public void startVoiceRecording();

	void selectContact(ContactSet contactList, Scanner sc);
}
