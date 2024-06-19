package bankactivities;

public  interface Bank {
	
	int MIN_BAL = 1000;
	int DEPOSITE_LIMIT = 20000;
	
	void deposite(Account acc,int amt);
	void withdraw(Account acc,int amt);
     
}
