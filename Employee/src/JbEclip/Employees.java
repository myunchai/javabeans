package JbEclip;

import java.io.Serializable;


public class Employees implements Serializable {
	
	private Person person1;	
	private String department;
	private String name;	
	
	public Employees() {
	}	
	
	public void setPerson1(Person person1){	
		this.person1=person1;
	}
	
	public Person getPerson1(){
		return person1;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setDepartment(String department){
		this.department=department;
	}
	
	public String getDepartment(){
		return department;
	}
}
