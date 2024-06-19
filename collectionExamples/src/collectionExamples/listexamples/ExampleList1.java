package collectionExamples.listexamples;
import java.util.*;
public class ExampleList1 {

	public static void main(String[] args) {
		 
		// arraylist,linkedlist,vector
		
		//List l2 = new LinkedList<>();
		//List l3 = new Vector<>();
		
		List l1 = new ArrayList<>(30); 
		//empty ,by default 10 
		
		
		l1.add("Pooja");
		l1.add(456);
		l1.add(45.67);
		l1.add("12/12/2009");
		
		
		
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<Integer>(40);
		l2.add(12);
		l2.add(14);
		l2.add(12);
		l2.add(82);
		
		System.out.println(l2);
		
		Integer lno = new Integer(12);
		boolean b= l2.contains(lno);
		
		System.out.println(b);
	     System.out.println(  l2.indexOf(lno));
		 System.out.println(l2.lastIndexOf(lno));
		
		l2.remove(lno);
		System.out.println(l2);
		
		// 1 : for each loop

		for(Object i : l1) {
			
			System.out.println(i);
			
		}
		for(int i : l2) {
			
			System.out.println(i*100);
			
		}
		
		//2 : iterator interface
		
		Iterator re = l2.iterator();
		
		while(re.hasNext()) {
			int r =  Integer.parseInt(re.next().toString());
			
			System.out.println(r*10);
		}
		
		
		
		System.out.println("sizde =" +l2.size());
		
		Collections.sort(l2);
		
		System.out.println(l2);
	}

}
