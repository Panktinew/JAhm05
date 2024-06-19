package treesetexamples;

import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
	TreeMap<String,Integer> courses = new TreeMap<String,Integer>();
	
	courses.put("Python", 8000);
	courses.put("Java", 18000);
	//courses.put(".net", 18000);
	//courses.put(".net", 1000);
	courses.put("C++", 8000);
	
	
	//courses.put("Python", 8000);
	
 System.out.println( 	courses.firstEntry());
	System.out.println(courses);
	}

}
