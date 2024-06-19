package threadExample.threadfunctions;

class A extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Good Morning");
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}
	}
	
}

class B extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Have a nice DAy!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadFunctionExample {

	public static void main(String[] args) {
		
	A thread1= new A(); // newborn state
	B thread2= new B();
	
	System.out.println(thread1.getName());
	System.out.println(thread2.getName());
	
	
	
	thread1.start();
	//tell the compiler --- thread is ready for execution
	
	try {
		thread1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	thread2.start();
	System.out.println(thread2.isAlive());
	try {
		thread2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(thread2.isAlive());
	thread1.setPriority(Thread.MAX_PRIORITY);
	thread1.setName("First");
	thread2.setName("Second");
	System.out.println(thread1.getName());
	System.out.println(thread2.getName());
	
	System.out.println("Bye Bye....");
	}

}
