package queueexamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample1 {

	public static void main(String[] args) {
		
	Deque<String> dq1 = new ArrayDeque<String>();
	dq1.add("Lotus");
	dq1.add("Rose");
	dq1.add("SunFlower");
	dq1.add("Marigold");
	
	
	System.out.println(dq1);
	
	
	dq1.offerFirst("Habiscus");
	dq1.offerLast("Tulip");
	
	dq1.forEach(q -> System.out.println(q));
	
	dq1.pollFirst();
	dq1.pollLast();
	
	System.out.println("after deleting");
	dq1.forEach(q -> System.out.println(q));
	
	
	}

}
