package hirera_example;

public class Person {
	private String name,city;

	
	public Person() {
		System.out.println("I am Person");
	}
	public Person(String name, String city) {
		 
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
