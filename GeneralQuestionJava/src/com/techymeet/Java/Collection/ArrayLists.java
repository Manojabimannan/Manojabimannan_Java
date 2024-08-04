package com.techymeet.Java.Collection;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(null);
		arr.add(1, 200);
		System.out.println(arr);
		System.out.println(arr.containsAll(arr));
		System.out.println(arr.contains(300));
		arr.get(2);
		arr.set(0, 100);
		System.out.println(arr.indexOf(3));
		System.out.println(arr);
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.addAll(arr);
		arr1.add(600);
		//arr1.equals(arr);
		System.out.println(arr1.clone());
		System.out.println(arr1);
		ArrayList<Integer> arr3 = new ArrayList<>();
		arr3.add(1000);
		arr3.add(2000);
		arr3.add(3000);
		arr3.add(4000);
		arr3.add(5000);
		System.out.println(arr3);
		arr3.addAll(2, arr);
		System.out.println(arr3);
		
		

	}

}
