package functionalinterface;

public interface Register {
 
	void showReceipt();  //abstract
	static void getID() {
		System.out.println("ID" + 13);
	}
	
}
