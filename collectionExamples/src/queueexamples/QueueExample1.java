package queueexamples;

import java.util.*;

public class QueueExample1 {

	public static void main(String[] args) {
	
		 Queue <Integer> q1  = new LinkedList<Integer>();
		 
		 q1.add(45);
		 q1.add(56);
		 q1.offer(67);
		 
		 q1.forEach(q -> System.out.println(q));
		 
		 System.out.println(q1.peek());
		 
		 
		 q1.poll();
		 System.out.println(q1.peek());
		 q1.remove();
		 System.out.println(q1.peek());
	}

}
