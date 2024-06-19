package treesetexamples;

import java.util.TreeSet;
import collectionExamples.listexamples.Color;

public class TreesetExample1 {

	public static void main(String[] args) {

		
		TreeSet<Integer> tr1 = new TreeSet<Integer>();
		TreeSet<String> tr2 = new TreeSet<String>();
		
		TreeSet<Color> tr3 = new TreeSet<Color>();
		
		
		tr1.add(45);
		tr1.add(5);
		tr1.add(4);
		tr1.add(0);
		tr1.add(41);
		
		tr1.add(4);
		
		
		
		System.out.println(tr1);
	}

}
