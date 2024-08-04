package com.techymeet.Java.Collection;

import java.util.Deque;
import java.util.Iterator;

public class ArrayDeque {

	public static void main(String[] args) {

		//ArrayDeque and LinkedList Same Node Based First ,Last 
		Deque<String> Dq=new java.util.ArrayDeque<>();
		Dq.add("Abimanyuu");
		Dq.add("BalaMurugan");
		Dq.add("CharuHassan");
		System.out.println(Dq.element());
		System.out.println(Dq.getFirst());
		System.out.println(Dq.getLast());
		System.out.println(Dq.isEmpty());
		System.out.println(Dq.offer("Mohan"));//add
		System.out.println(Dq.offerFirst("Anbu"));//Add First
		System.out.println(Dq.offerLast("Zeb"));//add Last
		System.out.println(Dq);
		Dq.addFirst("ManojAbhimanyuu");
		System.out.println(Dq);
		Dq.push("Mohan");
		System.out.println(Dq);
		System.out.println(Dq.pop());
		Dq.add("Gopinath");
		System.out.println(Dq.removeFirst());//Last In Last Out
		System.out.println(Dq);
		System.out.println(Dq.removeLast());
		System.out.println(Dq);
		Iterator<String> D=Dq.iterator();
		System.out.println(Dq.element());//First Element Value Show Display
		System.out.println(Dq.offerLast("Zebv"));
		System.out.println(Dq);
		
	}
}
