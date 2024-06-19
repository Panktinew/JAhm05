package staticexample;

public class ChildClass extends StaticFuntion {

	static int k;
	static
	{   
		k++;
		System.out.println("I am static Block");
	}
	
	 
}
