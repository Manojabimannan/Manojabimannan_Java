package com.techymeet.Java.Collection;

import java.util.HashSet;
import java.util.LinkedList;

public class HashsetCollection {

	public static void main(String[] args) {

		HashSet<Object> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(100);
		set.add(200);
		set.add(20);
		set.add(null);//Allow Null
		System.out.println(set);
		System.out.println(set.remove(10));
		System.out.println(set);
		set.toArray();
		System.out.println(set.toString());
		// DuplicateFind
		LinkedList<Integer>l=new LinkedList<>();
		l.add(100);
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(300);
		System.out.println(l);
		HashSet<Integer> Hs=new HashSet<>(l);
		System.out.println(Hs);
		
		
		
	}

}
