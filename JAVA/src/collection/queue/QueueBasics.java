package collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class QueueBasics {
	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<Integer>();

		q1.offer(-3);
		q1.offer(22);
		q1.offer(10); 
		System.out.println(q1); //while printing priority queue it can be random but if 
								//we remove elements it will always be removed in natural order
		System.out.println(q1.poll());
		System.out.println(q1.poll());
		System.out.println(q1.poll());
	}
}

/*
 [-3, 22, 10]
-3
10
22
 */
