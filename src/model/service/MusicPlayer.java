package model.service;

import java.util.Scanner;

public interface MusicPlayer {
	
	
	public void playSong();
	
	public void pauseMusic();
	
	public void selectMusic(Scanner sc);

	public String playSongSelected();
}
