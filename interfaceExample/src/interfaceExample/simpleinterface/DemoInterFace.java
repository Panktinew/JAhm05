package interfaceExample.simpleinterface;
//public class DemoInterFace extends TestInterFace implements Printable,BaseInterface {

public class DemoInterFace  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterFace ti = new TestInterFace();
		System.out.println(TestInterFace.msg);
		
		ti.showData();
	}

}
