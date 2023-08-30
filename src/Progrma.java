import java.util.Scanner;

import model.device.IPhone;
import model.util.MusicPlaylist;

public class Progrma {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
	  MusicPlaylist playlist = new MusicPlaylist( "Nivana test");		
	  playlist.addMusic("Smells Like Teen Spirit", "Nirvana");
      playlist.addMusic("Come as You Are", "Nirvana");
      playlist.addMusic("In Bloom", "Nirvana");
      playlist.addMusic("Heart-Shaped Box", "Nirvana");
      playlist.addMusic("Lithium", "Nirvana");
      playlist.addMusic("All Apologies", "Nirvana");
      playlist.addMusic("About a Girl", "Nirvana");
      playlist.addMusic("Rape Me", "Nirvana");
      playlist.addMusic("The Man Who Sold the World", "Nirvana");
      playlist.addMusic("Breed", "Nirvana");
     
      
     IPhone iphone = new IPhone(); 
     
     iphone.selectMusic(playlist, sc);
      
      
 	}
}
