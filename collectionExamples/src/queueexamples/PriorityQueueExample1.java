package queueexamples;
import java.util.*;
public class PriorityQueueExample1 {

	public static void main(String[] args) {
	
	Queue<String> pq1 = new PriorityQueue<String>();
	
	pq1.add("Dog");
	pq1.add("Wolf");
	pq1.add("Lion");
	pq1.add("tiger");
	
	
	System.out.println(pq1);
	
	
	Queue<Integer> pq2 = new PriorityQueue<Integer>();
	
	
	
	pq2.add(56);
	pq2.add(6);
	pq2.add(5);
	pq2.add(0);
	pq2.add(61);
	
	
	System.out.println(pq2);
	
	pq2.remove();
	System.out.println(pq2);
	pq2.offer(-1);
	System.out.println(pq2);
	
	}

}
