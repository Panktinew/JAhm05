package tnsif.region.personalinfo;

import tnsif.region.countrystatepack.*;
//not allocating memory


public class Person {
	
	private String pname;
	private Country c1;
	private City cty;
	private int age;
	private int income;
	
	
	public Person()
	{
		
	}
	
	
	
	public Person(String pname, Country c1, City cty,int age,int income) {
		super();
		this.pname = pname;
		this.c1 = c1;
		this.cty = cty;
		this.age = age;
		this.income = income;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Country getC1() {
		return c1;
	}
	public void setC1(Country c1) {
		this.c1 = c1;
	}
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getIncome() {
		return income;
	}



	public void setIncome(int income) {
		this.income = income;
	}



	public City getCty() {
		return cty;
	}
	public void setCty(City cty) {
		this.cty = cty;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", c1=" + c1 + ", cty=" + cty + ", age=" + age + ", income=" + income + "]";
	}
	
	
	
	
	

}
