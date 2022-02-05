package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq1 = new PriorityQueue<String>();//do not maintained the order
		
		pq1.add("Rohit");
		pq1.add("Supriya");
		pq1.add("John");
		pq1.add("Balram");
		pq1.add("Donald");
		
//		pq1.add(null); //queue never allow the null value but in array list or list it should be added
		
	System.out.println(pq1);
		
		System.out.println("First Element " + pq1.peek());
		System.out.println("First Element " + pq1.poll());
		System.out.println(pq1);
		
		
		
		
		ArrayDeque<String> dq1 = new ArrayDeque<String>();
		
		dq1.add("Nik");
		dq1.add("Mathew");
		dq1.add("Lisa");
		dq1.add("Rohit");
		dq1.add("Supriya");
		dq1.add("John");
		dq1.add("Balram");
		dq1.add("Donald");
		
//		dq1.add(null);// queue never allow the null value but in array list or list it should be added
		
		System.out.println(dq1);
		
		System.out.println(dq1.peek());
		System.out.println(dq1.peekFirst());
		System.out.println(dq1.peekLast());
		
		System.out.println(dq1.poll());// only used in Deque---- for removing the value
		System.out.println(dq1.pollFirst());
		System.out.println(dq1.pollLast());
		
		System.out.println(dq1);
	}

}
