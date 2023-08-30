package model.util;

import java.util.ArrayList;
import java.util.List;

public class MusicPlaylist {

	private String name;
	private List<Music> playlist;
	private Music music;

	public MusicPlaylist() {
		this.playlist = new ArrayList<>();
	}

	public MusicPlaylist(String name) {
		this.name = name;
		this.playlist = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Music> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<Music> playlist) {
		this.playlist = playlist;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public void addMusic(String musicName, String artist) {
		playlist.add(new Music(musicName, artist));
	}

	public void removeMusic(String musicName) {
		List<Music> musicToRemove = new ArrayList<>();
		if (!playlist.isEmpty()) {
			for (Music m : playlist) {
				if (m.getName().equalsIgnoreCase(musicName)) {
					musicToRemove.add(m);
				}
			}
			playlist.removeAll(musicToRemove);
		} else {
			System.out.println("A lista está vazia!");

		}
	}

	public List<Music> showMyPlaylistSong() {
		List<Music> myPlaylist = new ArrayList<>();
		if (!playlist.isEmpty()) {
			System.out.println("------Músicas Disponiveis-----");
			for (Music m : playlist) {
				myPlaylist.add(m);
				System.out.println(m.getName() + "-" + m.getArtist());
			}
			return myPlaylist;
		} else {
			System.out.println("Lista Vazia");
			return myPlaylist;
		}

	}
}
