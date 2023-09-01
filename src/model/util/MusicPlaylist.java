package model.util;

import java.util.ArrayList;
import java.util.List;

public class MusicPlaylist {

	
	private List<Music> playlist;

	public MusicPlaylist() {
		this.playlist = new ArrayList<>();
		addPlaylistOnSystem();
	}


	public List<Music> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(List<Music> playlist) {
		this.playlist = playlist;
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

	public void addPlaylistOnSystem() {

		addMusic("Smells Like Teen Spirit", "Nirvana");
		addMusic("Come as You Are", "Nirvana");
		addMusic("In Bloom", "Nirvana");
		addMusic("Heart-Shaped Box", "Nirvana");
		addMusic("Lithium", "Nirvana");
		addMusic("All Apologies", "Nirvana");
		addMusic("About a Girl", "Nirvana");
		addMusic("Rape Me", "Nirvana");
		addMusic("The Man Who Sold the World", "Nirvana");
		addMusic("Breed", "Nirvana");
	}

}
