package tnsif.region.personalinfo;

import tnsif.region.countrystatepack.City;
import tnsif.region.countrystatepack.Country;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Country c1 = new Country("India");
	City cty = new City("Ahmedabad");
    Person p = new Person("Pankti",c1,cty,16,100000);			
		
		System.out.println(p);
		
		TaxCalculation tc = new TaxCalculation();
		tc.calcualateTax(p);
				
		
		Country c2 = new Country();
		c2.setCname("India");
		
		City cty1 = new City( );
		cty1.setCname("Anand");
		
	    Person p1 = new Person( );
	    
	    p1.setPname("Roopa");
	    p1.setC1(c2);
	    p1.setCty(cty1);
	    
	    System.out.println(p1);
		
		
		
	}

}
