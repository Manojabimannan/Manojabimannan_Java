package com.techymeet.Java.Practices;

import java.util.HashSet;

public class DuplicateRemaingValueFind {

	public static void main(String[] args) {

		int [] arr= {3,5,7,1,3,5,7,8,2,3,5,0};
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i:arr) {
			set.add(i);
		}
		System.out.println(set);
	}

}
