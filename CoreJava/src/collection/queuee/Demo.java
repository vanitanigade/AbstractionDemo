package collection.queuee;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Demo {

	public static void main(String[] args) {

		Queue<Integer> qu = new LinkedList<>();		// same result as q
		
		Deque<Integer> dq = new LinkedList<>();
		dq.addLast(null);
		
		Deque<Integer> q = new LinkedList<>();	//same result as qu
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println("size: " + q.size());
		System.out.println("firstelement: " + q.peek());
		q.remove();	//10
		
		System.out.println("size: " + q.size());
		System.out.println("firstelement: " + q.peek());
		q.remove(40);	
		
		System.out.println("size: " + q.size());
		System.out.println("firstelement: " + q.peek());
		
		Iterator itr = q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
