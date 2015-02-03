package JbEclip;

import java.io.Serializable;

public class PersonBean implements Serializable{

	private String name = null;
	private boolean deceased = true;

	//no arg constructor
	public PersonBean(){
	}
	
	//getter for property
	public String getName(){
		return name;
	}
	
	//setter for property
	public void setName(final String value){
		name = value;
	}
	
	//getter for property deceased
	public boolean isDeceased(){
		return deceased;
		
	}
	
	//setter for property
	public void setDeceased (final boolean value){
		deceased = value;
	}
	

}
