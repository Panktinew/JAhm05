package collectionExamples.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lst = new LinkedList<String>();
		lst.add("Dharmik");
		lst.add("neha");
		lst.add("noopur");
		
		System.out.println(lst);
		Iterator ir1 = lst.iterator();
		
		while(ir1.hasNext()) {
			
			System.out.println(ir1.next());
		}
		Collections.sort(lst);
		System.out.println(lst);
		
	}

}
