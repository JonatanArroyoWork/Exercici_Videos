package videoPackage;

import java.util.*;
import java.util.Date;

public class User {
	
		//Declaración de campos de Clase
	public String name;
	public String surname;
	private String password;
	private Date regDate;
	private ArrayList<Video> videoList;
	
		//Constructor de clase
	
	public User ( String name, String surname, String password, Date regDate,
				ArrayList<Video> videoList) {
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.regDate = regDate;
		videoList = new ArrayList<Video>();
	}
	
		//Constructor vacío
	public User () {
		videoList = new ArrayList<Video>();
	}
	
	//Getters & Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	// Método Inserción y Obtención de videos
	
	public void setVideoList(ArrayList<Video> videoList) {
		this.videoList = videoList;
	}
	
	public String toString() {
		String results = "+";
		for (int i= 0; i< this.videoList.size(); i++){
			results += " " + this.videoList.get(i);
		}
		return results;
	}

	public void addVideo(Video title){
		this.videoList.add(title);
	}
		
	public ArrayList<Video> getVideoList() {
		return videoList;
	}

	public void setVideoList(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
	
}
