package bankactivities;

public class DemoBankTran {

	public static void main(String[] args) {
	
		
		
		
		
		Account acc= new Account();
		acc.setAccname("Manya");
		acc.setEmail("mm@mm.com");
		acc.setBal(5000);
		
		//Bank b = new BankTranscation();
		 
	System.out.println(acc);	
	BankTranscation bt = new BankTranscation();
	
	bt.deposite(acc, 4000);
	
	System.out.println(acc);
		
	bt.withdraw(acc, 1200);
	System.out.println(acc);	
	}

}
