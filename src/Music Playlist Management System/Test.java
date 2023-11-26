package Project1;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		SongRecord song1=new SongRecord();
		song1.setTitle("Perfect");
		song1.setArtist("Ed Sheeran");
		song1.setMinutes(4);
		song1.setSeconds(23);
		
		SongRecord song2=new SongRecord();
		song2.setTitle("Shape Of You");
		song2.setArtist("Ed Sheeran");
		song2.setMinutes(3);
		song2.setSeconds(53);
		
		SongRecord song3=new SongRecord();
		
		song3.setTitle("Easier");
		song3.setArtist("Seeb");
		song3.setMinutes(2); 	
		song3.setSeconds(46);
		
		Playlist english=new Playlist();
		
		english.addSong(song1);
		english.addSong(song2);
		english.addSong(song3);
		
		System.out.println(english.toString());
	}

}
