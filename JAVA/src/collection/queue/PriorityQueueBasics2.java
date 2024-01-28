package collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueBasics2 {

	public static void main(String[] args) {
		Queue<Integer> q1= new PriorityQueue<>();
		
		Random randint= new Random();
		for (int i = 0; i < 10; i++) {
			q1.offer(randint.nextInt(10));
		}
		System.out.println(q1);
		//peek returns value or null if queue empty
		q1.peek();
		//element returns value
		q1.element(); //can give no such element exception if queue empty
		//removes object or null if queue empty
		q1.remove(); //can give no such element exception if queue empty
		//poll removes object from queue
		q1.poll();
		System.out.println(q1);
 	}

}
