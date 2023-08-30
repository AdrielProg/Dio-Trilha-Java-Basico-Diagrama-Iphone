package model.util;

public class Music {

	private String name;
	private String artist;
	private String album;
	private Integer duration;

	public Music(String name, String artist, String album, Integer duration) {
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.duration = duration;
	}

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

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return name + " - " + artist;
	}

}
