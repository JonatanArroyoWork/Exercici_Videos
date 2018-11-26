package videoPackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		Video video1 = new Video();
		video1.setTitle("comunion");
		video1.url = new URL("http://www.micomunion.com");
		String tags = new String("comunion,boda,bebe");
		video1.addTags(tags);
		
		Video video2 = new Video();
		video2.setTitle("boda");
		video2.url = new URL("http://www.miboda.com");
		String tags2 = new String("tarta,boda,pastel");
		video2.addTags(tags2);
		
		Video video3 = new Video();
		video3.setTitle("bebe");
		video3.url = new URL("http://www.mibebe.com");
		String tags3 = new String("nacimiento,niña,bebe");
		video3.addTags(tags3);
		
		Video video4 = new Video();
		video4.setTitle("boda");
		video4.url = new URL("http://www.micasa.com");
		String tags4 = new String("mudanza,casa,muebles");
		video4.addTags(tags4);
		
		
		//Instancio un usuario
		User user1 = new User() ;
			user1.name = ("Jonatan");
			user1.surname = ("Arroyo");
			user1.setPassword("secreto");
			user1.setRegDate(Date(2018, 11, 22));
			user1.addVideo(video1);
			user1.addVideo(video2);
			
			User user2 = new User() ;
			user2.name = ("Marta");
			user2.surname = ("Aguilar");
			user2.setPassword("Coll");
			user2.setRegDate(Date(2018, 11, 25));
			user2.addVideo(video3);
			user2.addVideo(video4);
	
				
				User[] User = {user1, user2};
				
			for (User u: User) {	
				
				for (Video v: u.getVideoList()) {
			
					System.out.println("El usuario " + u.getName() + " ha publicado los videos " 
							+ v.getTitle() + " " + " hashtags: " + v.getTags());
				}
			}
				
		}
	

	private static Date Date(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

}
