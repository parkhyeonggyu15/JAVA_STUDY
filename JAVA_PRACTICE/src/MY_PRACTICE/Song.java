package PRACTICE;

class SongEx{
	String title;
	String artist;
	int year;
	String country;
	public SongEx(){
		
	}

	public SongEx(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.printf("%d년 %s국적의 %s가 부른 %s",this.year,this.country,this.artist,this.title);
	}
}
public class Song {

	public static void main(String[] args) {
		SongEx ob = new SongEx("Dancing Queen","ABBA",1978,"스웨덴");
		ob.show();
	}

}
