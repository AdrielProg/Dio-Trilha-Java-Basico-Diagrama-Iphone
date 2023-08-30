package model.service;

import java.util.Scanner;

public interface PhoneDevice {
   
	public void call(Scanner sc);
	
	public void answerCall();
	
	public void startVoiceRecording();
}
