package hirera_example;

public class Student extends Person {
	private String div;

	public Student() {
		//super();  // it will call parent class default constructor
	System.out.println("I am  student");
	
	}
	
	
	public Student(String nm,String ct,String div) {
		 super(nm,ct);
		this.div = div;
	}


	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	@Override
	public String toString() {
		return " name =" + getName() + "  city=" + getCity() + div ;
	}
	

}
