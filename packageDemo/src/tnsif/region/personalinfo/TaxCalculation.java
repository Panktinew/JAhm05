package tnsif.region.personalinfo;

public class TaxCalculation {
	
	public void calcualateTax(Person p) {
		double tax=0.0;
		
		if(p.getAge() >=18) {
			
			if(p.getIncome() >=50000 && p.getIncome() <70000) {
               			
			tax = p.getIncome() *0.05;
		}
		else if(p.getIncome() >=70000 && p.getIncome() <100000)
		{
			tax = p.getIncome() *0.10;
		}
		else if(p.getIncome() >=100000 )
		{	
		tax = p.getIncome() *0.15;
		}
		else {
			System.out.println("no tax");
		}
			
	}

		else {
			System.out.println("no tax");
		}
		
		System.out.println("tax=" + tax);
	}
  
}
