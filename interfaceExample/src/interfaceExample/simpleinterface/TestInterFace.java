 package interfaceExample.simpleinterface;

public class TestInterFace implements Printable,BaseInterface{
	
	@Override
  public void showData() {
		System.out.println("I am using interface");
	}
	

}
