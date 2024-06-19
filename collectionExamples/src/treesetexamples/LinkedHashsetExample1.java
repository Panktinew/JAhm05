package treesetexamples;

import java.util.LinkedHashSet;

public class LinkedHashsetExample1 {

	public static void main(String[] args) {
	
		
	LinkedHashSet <String> lh1 = new LinkedHashSet<String>();  
	lh1.add("Neepa");
	lh1.add("Rajeev");
	lh1.add("Megha");
	lh1.add("Megha");
	
	System.out.println(lh1);
	
	lh1.forEach(l -> System.out.println(l));
	
	
	
	
	}

}
