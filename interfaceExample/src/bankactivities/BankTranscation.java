package bankactivities;

public class BankTranscation implements  Bank {
	
	@Override
	public void deposite(Account acc,int amt) {
		//100+100
		acc.setBal(acc.getBal()+ amt);
		
		System.out.println("Balance Updated");
	}
	public void withdraw(Account acc,int amt) {
		
		acc.setBal(acc.getBal()-amt);
		System.out.println("Balance Updated");
	}
}
