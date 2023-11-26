package Project1;

public class SongRecord {
	private String title;
	private String artist;
	private int minutes;
	private int seconds;
	
	public SongRecord() {
		title="";
		artist="";
		minutes=0;
		seconds=0;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setMinutes(int minutes) {
		if(minutes<0) {
			throw new IllegalArgumentException("Invalid value for minutes");
		}
		else {
			this.minutes = minutes;
		}
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int seconds) {
		if(seconds<0||seconds>59) {
			throw new IllegalArgumentException("Invalid value for seconds");
		}
		else{
			this.seconds = seconds;
		}
	}
	
	@Override
	@SuppressWarnings("unused")
	public String toString() {
		String result="";
		
		return String.format("%-16s%-16s%2d:%02d", title, artist, minutes, seconds);
	}
	
	protected Object clone() throws CloneNotSupportedException{
		SongRecord temp=new SongRecord();
		
		temp.setTitle(this.title);
		temp.setArtist(this.artist);
		temp.setMinutes(this.minutes);
		temp.setSeconds(this.seconds);
		
		return temp;
	}
	
	@SuppressWarnings("unused")
	@Override
	public boolean equals(Object obj) {
		if(obj==null||!(obj instanceof SongRecord)) {
			throw new IllegalArgumentException("Invalid Song");
		}
		else {
			boolean flag=false;
			SongRecord s1=this;
			SongRecord s2=(SongRecord)obj;
			
			if(s1.getTitle().equalsIgnoreCase(s2.getTitle())&&
					s1.getArtist().equalsIgnoreCase(s2.getArtist())&&
					s1.getMinutes()==s2.getMinutes()&&
					s1.getSeconds()==s2.getSeconds()) {
				
				return true;
			}
			else {
				return false;
			}
		}
	}
}
