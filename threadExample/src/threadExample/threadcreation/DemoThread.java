package threadExample.threadcreation;

public class DemoThread {

	public static void main(String[] args) {
		 
		
		Thread1 th1 = new Thread1();
		th1.start();  // thread class
		
		
		Thread2 th2 = new Thread2();
		Thread th = new Thread(th2);
		th.start();
		
		System.out.println("Thread is started");
	}

}
