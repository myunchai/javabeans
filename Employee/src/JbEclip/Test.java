package JbEclip;

public class Test {
	public static void main(String arg[]){
		
		Employees nam=new Employees();
		Employees dep= new Employees();
				
		nam.setName("Employee name:" + "Mei");
		dep.setDepartment("Department:" + " " + "CIT");
	
		
		System.out.println(nam.getName());
		System.out.println(dep.getDepartment());
	}

}
