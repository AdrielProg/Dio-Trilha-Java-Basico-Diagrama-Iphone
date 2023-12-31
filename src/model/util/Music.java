package model.util;

public class Music {

	private String name;
	private String artist;

	public Music(String name, String artist) {
		this.name = name;
		this.artist = artist;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return name + " - " + artist;
	}

}
