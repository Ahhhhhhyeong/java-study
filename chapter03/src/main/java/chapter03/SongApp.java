package chapter03;

public class SongApp {

	public static void main(String[] args) {
		//Song song = new Song();
		//song.setTitle("좋은날");
		//song.setArtist("아이유");
		//song.setAlbum("Real");
		//song.setComposer("이민수 작곡");
		//song.setYear(2010);
		//song.setTrack(3);		
		Song song = new Song("좋은날", "IU","Real", "이민수", 2010, 3);		
		song.show();
		
		Song song2 = new Song("신호등", "이무진");
		song2.show();
		
	}

}
