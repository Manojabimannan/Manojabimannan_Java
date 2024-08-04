package com.techymeet.Java.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		pq.add(500);
		
		System.out.println(pq);
		System.out.println(pq.contains(100));//Contains True or False
		System.out.println(pq.size());//Size Total
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.remove(300));//Remove Value Based
		System.out.println(pq);
		Iterator<Integer>priority=pq.iterator();
		
		for(int i:pq) {
			System.out.println(i);
		}
		System.out.println(" ");
		while(priority.hasNext()) {
			System.out.println(priority.next());
		}
		pq.add(1000);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());//First In First Out
		System.out.println(pq.peek());//Show The First One
		System.out.println(pq);
			
			
	}

}
