package videoPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Video {
	
	//Declaración de campos de Clase
	public URL url;
	public String title;
	public ArrayList<String> tags;

		//Constructor
	public Video( URL url, String title, ArrayList<String> tags) {
		this.url = url;
		this.title = title;
		this.tags = tags;
	}
	
	//Constructor vacío
	public Video() {
		this.tags = new ArrayList<String>();
	}
	
		//Getters & Setters
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	
	public void addTags(String tag){
		this.tags.add(tag);
	}
	

	public void setTags(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
}

	
