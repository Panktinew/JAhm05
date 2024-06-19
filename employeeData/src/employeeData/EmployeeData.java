package employeeData;

public class EmployeeData {
	
	private String name, designation;
	private int basicSalary;
	
	//constructor with no parameters
public EmployeeData() {
		name="default";
		designation = "dm";
		
		basicSalary=000;
	}
	
/*	public EmployeeData(String nm,String desi,int basicSalary)
	{
		
    name = nm;
    designation=desi;
    this.basicSalary=basicSalary;
		
		
	}*/
	public EmployeeData(String name, String designation, int basicSalary) {
		
		this.name = name;
		this.designation = designation;
		this.basicSalary = basicSalary;
	}
	
	
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", designation=" + designation + ", basicSalary=" + basicSalary + "]";
	}
	
	//for printing all the data members togather 
	
	
	

}
