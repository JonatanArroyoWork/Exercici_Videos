package videoPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Video {
	
	//Declaraci�n de campos de Clase
	public URL url;
	public String title;
	public ArrayList<String> tags;

		//Constructor
	public Video( URL url, String title, ArrayList<String> tags) throws Exception{
		if (url == null) throw new Exception ("url can't be blank!!");
		this.url = url;
		if (title == null) throw new Exception ("title can't be blank!!");
		this.title = title;
		if (tags == null) throw new Exception ("tags can't be blank!!");
		this.tags = tags;
	}
	
	//Constructor vac�o
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
	public void setTags(ArrayList<String> tags) throws Exception {
		if (tags == null) throw new Exception ("the tags can't be blank!!!");
		this.tags = tags;
	}
	
	public void addTags(String tag){
		this.tags.add(tag);
	}
	

	public void setTags(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
}

	
