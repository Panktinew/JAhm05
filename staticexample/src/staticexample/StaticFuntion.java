package staticexample;

public class StaticFuntion {
	
private int salary;
private static int cnt;


	 
	public static void showData() {
	//salary=23000; non static variables are not allowed
		cnt++;
		System.out.println(cnt);
	}

}
