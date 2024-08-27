package com.techymeet.Java.Collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetCollection {

	public static void main(String[] args) {
        //No Allow Duplicate
		// Not MainTain Insertion Order
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(1000);
		lhs.add(5000);
		lhs.add(3000);
		lhs.add(7000);
		lhs.add(2000);
		lhs.add(4000);
		lhs.add(5000);
		lhs.add(3000);
		lhs.add(7000);
		System.out.println(lhs);
		LinkedList<Integer> lhs1 = new LinkedList<>();
		lhs1.add(10);
		lhs1.add(10);
		lhs1.add(100);
		lhs1.add(10);
		lhs1.add(01);
		lhs1.add(02);
		lhs1.add(03);
		System.out.println(lhs1);
		LinkedHashSet<Integer> Duplicate = new LinkedHashSet<>(lhs1);
		System.out.println(Duplicate);
		for (int i : Duplicate) {
			System.out.println(i);
		}

	}

}
