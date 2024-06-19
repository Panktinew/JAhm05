package collectionExamples.listexamples;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		 List<String> v1 = new Vector<String>();
		 v1.add("Red");
		 v1.add("green");
		 v1.add("blue");
		 
		 System.out.println(v1);
		 
		/* Iterator ir = v1.iterator();
		 
		 while(ir.hasNext()) {
			 System.out.println(ir.next());
		 }
		*/ 
		 
v1.forEach(v -> System.out.println(v) );
		 
		 
		 
	}

}
