package model.service;

import java.util.Scanner;

import model.util.ContactList;

public interface PhoneDevice {
   
	public void call(Scanner sc);
	
	public void answerCall();
	
	public void startVoiceRecording();

	void selectContact(ContactList contactList, Scanner sc);
}
