package chapter03;


public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song(String title, String artist, String album, 
				String composer, int year, int track) {
		//
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public Song(String title, String artist) {
		//this.title = title;
		//this.artist = artist;
		this(title, artist, null, null, 0, 0);
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public String getComposer() {
		return composer;
	}

	public int getYear() {
		return year;
	}

	public int getTrack() {
		return track;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void show() {
		System.out.println(
						artist + " " 
						+ title + " (" 
						+ album + ", " + year + ", "
						+ track + ", " 
						+ composer + " 작곡, "+ track + "번)");

	}

}
