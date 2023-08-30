package model.service;

import java.util.Scanner;

import model.util.MusicPlaylist;

public interface MusicPlayer {
	
	
	public void playSong();
	
	public void pauseMusic();
	
	public void selectMusic(MusicPlaylist msc, Scanner sc);

	public String playSongSelected();
}
