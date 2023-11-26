package Project1;

public class Playlist {
	
	public static final int MAX_SONGS_IN_PLAYLIST=50;
	private SongRecord[] songs;
	int numOfSongs;
	
	public Playlist() {
		songs = new SongRecord[MAX_SONGS_IN_PLAYLIST];
		numOfSongs=0;
	}

	public void addSong(SongRecord tSong) {
		// TODO Auto-generated method stub
		songs[numOfSongs]=tSong;
		numOfSongs++;
		
		System.out.println("Song added  : "+tSong.getTitle());
		System.out.println(" By : "+tSong.getArtist());
		System.out.println();
		
		//System.out.println("Song added to the playlist successfully.");
		//System.out.println("Total no: of songs : "+numOfSongs);
	}
	public void addSong2(int position,SongRecord tSong) {
		if(position>numOfSongs+1||position<1||position>50) {
			throw new IllegalArgumentException("Invalid Input");
		}
		else if(position==numOfSongs+1) {
			songs[numOfSongs]=tSong;
			numOfSongs++;
		}
		else {
			for(int i=numOfSongs-1;i>=position-1;i--) {
				songs[i+1]=songs[i];
			}
			songs[position-1]=tSong;
			numOfSongs++;
		}
		System.out.println("Song added  : "+tSong.getTitle());
		System.out.println(" By : "+tSong.getArtist());
		System.out.println();
	}
	@Override
	public String toString() {
		String s="";
		System.out.println("Song No.  Title           Artist          Duration");
		System.out.println("--------------------------------------------------");
		for(int i=0;i<numOfSongs;i++) {
			s=s+String.format("%-10d%s",(i+1), songs[i].toString())+"\n";
		}
		return s;
	}
}
