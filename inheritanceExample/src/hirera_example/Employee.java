package hirera_example;

public class Employee extends Person {
	
	private String depart;

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Employee [depart=" + depart + "]";
	}
	
	

}
