package exceptionExample.simpleexception;

public class Example1 {

	public static void main(String[] args) {
		 int a,b,c;
		 a=12;
		 b=12;
		  
		try {	 
		 int[] arr = {1,2,3,4,5};
			c= a/b;
		 
			
		 System.out.println(arr[10]);
		 System.out.println("will not be printed");
		}
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException ari) {
			System.out.println(ari.getMessage());
		}
		 
		catch(Exception  eo) {
			System.out.println( eo.getMessage());
		}
		
		finally {
			 System.out.println("Bye...Bye...");
		 } 
		 
		
	}

}
