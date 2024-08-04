package com.techymeet.Java.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(100);
		ll.add(200);
		ll.add(1, 1000);
		ll.addFirst(10);
		ll.addLast(10000);
		System.out.println(ll);
		System.out.println(ll.offer(90));
		System.out.println(ll.offerFirst(1000));
		System.out.println(ll.offerLast(9000));
		System.out.println(ll.isEmpty());
		System.out.println(ll.remove(5));
		System.out.println(ll);
		LinkedList<Integer> ll1=new LinkedList<>();
		ll1.addAll(ll);
		System.out.println(ll1);
		LinkedList<Integer> ll2=new LinkedList<>();
		ll2.add(1);
		ll2.add(2);
		ll2.add(3);
		ll2.add(4);
		ll2.subList(0, 3);
		System.out.println(ll2);
		ll2.addAll(2,ll1);
		System.out.println(ll2.peek());
		System.out.println(ll2.peekFirst());
		System.out.println(ll2.peekLast());
		System.out.println(ll2.pop());
		System.out.println(ll2.poll());
		System.out.println(ll2.pollLast());
		System.out.println(ll2);
        Iterator<Integer> iterable=ll2.iterator();
        while(iterable.hasNext()) {
        	System.out.println(iterable.next());
        }
        System.out.println("----------ll2.toArray();-----------");
        ll2.toArray();
        Object [] arr=ll2.toArray();
        for(Object arr2:arr) {
        	System.out.println(arr2);
        	
        }
        for(Object arr2:arr) {
        	System.out.print(arr2+" ");
        	
        }
        
		
	}

}
