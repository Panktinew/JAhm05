package collectionExamples.istlistexamples;

import java.util.*;
import collectionExamples.listexamples.*;
public class ListExampleClass {

	public static void main(String[] args) {
		 
		List <Color> listc = new ArrayList<Color>();
		listc.add(new Color (1,"White"));
		listc.add(new Color (2,"green"));
		listc.add(new Color (3,"blue"));
		listc.add(new Color (4,"red"));
		
		for(Color c: listc ) {
			
			System.out.println(c);
		}
		
		 Collections.sort(listc);
	}

}
