package userdefinedexception;

public class BelowSalaryException extends Exception {
	
	public BelowSalaryException() {
		System.out.println("Please check salary input");
	}
	
	public BelowSalaryException(String msg) {
		System.out.println(msg);
	}

}
